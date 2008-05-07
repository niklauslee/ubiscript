package org.ubiscript.server;

import java.io.*;
import org.ubiscript.*;

public class Marshaller {

	public static void marshall(Place place, UbiObject obj,
			BufferedWriter writer,	boolean asReference) throws IOException {
		if (asReference) {
			writer.write(Constants.Id_NetRef);
			writer.newLine();
			writer.write(place.getLocation());
			writer.newLine();
			writer.write(place.getPlaceId());
			writer.newLine();
			String refId = place.addRemoteRef(obj);
			writer.write(refId);
			writer.newLine();
			writer.flush();
		} else {
			if (obj instanceof UbiNumber) {
				UbiNumber n = (UbiNumber) obj;
				writer.write(n.getClassName());
				writer.newLine();
				writer.write(Double.toString(n.getValue()));
				writer.newLine();
				writer.flush();
			} else if (obj instanceof UbiBoolean) {
				UbiBoolean b = (UbiBoolean) obj;
				writer.write(b.getClassName());
				writer.newLine();
				writer.write(Boolean.toString(b.getValue()));
				writer.newLine();
				writer.flush();
			} else if (obj instanceof UbiString) {
				UbiString s = (UbiString) obj;
				writer.write(s.getClassName());
				writer.newLine();
				writer.write(UbiString.denormalizeString(s.getValue()));
				writer.newLine();
				writer.flush();
			} else if (obj instanceof UbiNull) {
				writer.write(obj.getClassName());
				writer.newLine();
				writer.flush();
			} else if (obj instanceof UbiUndefined) {
				writer.write(obj.getClassName());
				writer.newLine();
				writer.flush();
			} else if (obj instanceof NativeArray) {
				NativeArray arr = (NativeArray) obj;
				writer.write(arr.getClassName());
				writer.newLine();
				writer.write(Integer.toString(arr.getLength()));
				writer.newLine();
				for (int i = 0; i < arr.getLength(); i++)
					marshall(place, arr.get(i), writer, true);
				writer.flush();
			} else if (obj instanceof NativePlace) {
				NativePlace p = (NativePlace) obj;
				writer.write(p.getClassName());
				writer.newLine();
				writer.write(p.getLocation());
				writer.newLine();
				writer.write(p.getPlaceId());
				writer.newLine();
				writer.flush();
			} else if (obj instanceof UbiFunction) {
				// TODO Function은 어떻게 marshall 할 것인가?
				writer.write(obj.getClassName());
				writer.newLine();
				writer.flush();
			} else if (obj instanceof UbiObject) {
				writer.write(obj.getClassName());
				writer.newLine();
				Property[] props = obj.getProperties();
				writer.write(Integer.toString(props.length));
				writer.newLine();
				for (Property p: props) {
					writer.write(p.getName());
					writer.newLine();
					writer.write(Integer.toString(p.getAttribute()));
					writer.newLine();
					marshall(place, p.getValue(), writer, true);
				}
				writer.flush();
			}
		}
	}
	
	public static UbiObject unmarshall(Place place, BufferedReader reader) 
			throws IOException {
		Environment env = place.getInterpreter().getEnv();
		String token = reader.readLine().trim();
		if (token.equals(Constants.Id_NetRef)) {
			String location = reader.readLine().trim();
			String placeId = reader.readLine().trim();
			String refId = reader.readLine().trim();
			return env.newNetRef(location, placeId, refId);
		} else if (token.equals(Constants.Id_Number)) {
			double n = Double.parseDouble(reader.readLine().trim());
			return env.newNumber(n);
		} else if (token.equals(Constants.Id_Boolean)) {
			boolean b = Boolean.parseBoolean(reader.readLine().trim());
			return env.newBoolean(b);
		} else if (token.equals(Constants.Id_String)) {
			String s = UbiString.normalizeString(reader.readLine().trim());
			return env.newString(s);
		} else if (token.equals(Constants.Id_Null)) {
			return env.getNull();
		} else if (token.equals(Constants.Id_Undefined)) {
			return env.getUndefined();
		} else if (token.equals(Constants.Id_Array)) {
			int size = Integer.parseInt(reader.readLine().trim());
			UbiObject[] values = new UbiObject[size];
			for (int i = 0; i < size; i++)
				values[i] = unmarshall(place, reader);
			return env.newArray(size, values);
		} else if (token.equals(Constants.Id_Place)) {
			String location = reader.readLine().trim();
			String placeId = reader.readLine().trim();
			return env.newPlace(location, placeId);
		} else if (token.equals(Constants.Id_Function)) {
			// TODO Function은 어떻게 unmarshall 할 것인가?
		} else if (token.equals(Constants.Id_Object)) {
			UbiObject obj = env.newObject();
			int size = Integer.parseInt(reader.readLine().trim());
			for (int i = 0; i < size; i++) {
				String name = reader.readLine().trim();
				int attribute = Integer.parseInt(reader.readLine().trim());
				UbiObject value = unmarshall(place, reader);
				obj.put(name, value, attribute);
			}
			return obj;
		}
		return null;
	}
	
	/*
	public static void main(String[] args) {
		Place place = new Place("<test-url>", "<test-placeid>");
		try {
			StringWriter sw = new StringWriter();
			BufferedWriter writer = new BufferedWriter(sw);
			marshall(place, place.getInterpreter().getEnv().getRootScope(), writer, false);
			writer.flush();
			String r = sw.toString();
			System.out.println("--------------");
			System.out.print(r);
			System.out.println("--------------");
			
			StringReader sr = new StringReader(r);
			BufferedReader reader = new BufferedReader(sr);
			UbiObject o = unmarshall(place, reader);
			place.getInterpreter().put("TEST", o);
			
			System.out.println("finished");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
	
}
