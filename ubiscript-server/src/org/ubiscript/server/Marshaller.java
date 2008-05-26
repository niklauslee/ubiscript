package org.ubiscript.server;

import java.io.*;
import org.ubiscript.*;

public class Marshaller {

	public static void marshall(Place place, Scriptable obj, BufferedWriter writer) 
			throws IOException {
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
		} else if (obj instanceof UbiPlace) {
			UbiPlace p = (UbiPlace) obj;
			writer.write(p.getLocation());
			writer.newLine();
			writer.write(p.getPlaceId());
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
		} else if (obj instanceof ObjectProxy) {
			ObjectProxy proxy = (ObjectProxy) obj;
			writer.write(Constants.Id_ObjectProxy);
			writer.newLine();
			writer.write(proxy.getClassName());
			writer.newLine();
			writer.write(proxy.getRemoteRef().getLocation());
			writer.newLine();
			writer.write(proxy.getRemoteRef().getPlaceId());
			writer.newLine();
			writer.write(Long.toString(proxy.getRemoteRef().getExportId()));
			writer.newLine();
			writer.flush();
		} else if (obj instanceof Scriptable) {
			long exportId = place.exportObject(obj);
			writer.write(obj.getClassName());
			writer.newLine();
			writer.write(place.getLocation());
			writer.newLine();
			writer.write(place.getPlaceId());
			writer.newLine();
			writer.write(Long.toString(exportId));
			writer.newLine();
			writer.flush();
		}
	}
	
	public static Scriptable unmarshall(Place place, BufferedReader reader) 
			throws IOException {
		Env env = place.getInterpreter().getEnv();
		String token = reader.readLine().trim();
		if (token.equals(Constants.Id_Number)) {
			double n = Double.parseDouble(reader.readLine().trim());
			return env.newNumber(n);
		} else if (token.equals(Constants.Id_Boolean)) {
			boolean b = Boolean.parseBoolean(reader.readLine().trim());
			return env.newBoolean(b);
		} else if (token.equals(Constants.Id_String)) {
			String s = UbiString.normalizeString(reader.readLine().trim());
			return env.newString(s);
		} else if (token.equals(Constants.Id_Place)) {
			String location =  reader.readLine().trim();
			String placeId = reader.readLine().trim();
			return env.newPlace(location, placeId);
		} else if (token.equals(Constants.Id_Null)) {
			return env.getNull();
		} else if (token.equals(Constants.Id_Undefined)) {
			return env.getUndefined();
		} else if (token.equals(Constants.Id_ObjectProxy)) {
			String className = reader.readLine().trim();
			String location = reader.readLine().trim();
			String placeId = reader.readLine().trim();
			long exportId = Long.parseLong(reader.readLine().trim());
			if (placeId.equals(place.getPlaceId())) {
				return place.getExportedObject(exportId);
			} else {
				Scriptable obj = env.newObjectProxy(className, 
						new RemoteRef(location, placeId, exportId));
				return obj;
			}
		} else {
			String location = reader.readLine().trim();
			String placeId = reader.readLine().trim();
			long exportId = Long.parseLong(reader.readLine().trim());
			RemoteRef remoteRef = new RemoteRef(location, placeId, exportId);
			Scriptable obj = env.newObjectProxy(token, remoteRef);
			return obj;
		}
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
