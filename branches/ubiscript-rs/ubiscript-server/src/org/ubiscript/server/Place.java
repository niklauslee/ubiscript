package org.ubiscript.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;
import org.ubiscript.*;

/**
 * A Place. 
 * A place is responsible for managing remote references, provides delegate handler,
 * and serialize and de-serialize objects via network.
 * @author niklaus
 */
public class Place {
	
	private String location;
	private String placeId;
	private Interpreter interpreter;
	private UbiscriptHttpClient client;
	private long exportCount;
	private Hashtable<Long, Scriptable> exportedObjects;
	
	public Place(String location, String placeId) {
		this.location = location;
		this.placeId = placeId;
		interpreter = new Interpreter();
		client = new UbiscriptHttpClient();
		interpreter.setEvaluatorDelegate(new EvaluatorDelegateImpl());
		interpreter.setProxyDelegate(new ProxyDelegateImpl());
		exportedObjects = new Hashtable<Long, Scriptable>();
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getPlaceId() {
		return placeId;
	}
	
	public Interpreter getInterpreter() {
		return interpreter;
	}

	public long exportObject(Scriptable obj) {
		exportCount++;
		exportedObjects.put(exportCount, obj);
		return exportCount;
	}
	
	public Scriptable getExportedObject(long exportId) {
		return exportedObjects.get(exportId);
	}

	public String execute(String encodedRemoteScope, String code) {
		try {
			Scriptable remoteScope = null;
			if (encodedRemoteScope != null) {
				StringReader sw = new StringReader(encodedRemoteScope);
				BufferedReader reader = new BufferedReader(sw);
				try {
					remoteScope = Marshaller.unmarshall(this, reader);
				} catch (IOException e) {
					e.printStackTrace();
					return "Unmarshalling remote scope failed.";
				}
			}
			Env env = interpreter.getEnv();
			env.pushScope();
			if (remoteScope != null)
				env.pushRootScope(remoteScope);
			interpreter.execute(code);
			if (remoteScope != null)
				env.popRootScope();
			env.popScope();
			return "OK";
		} catch (UbiException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		}
	}
		
	private class EvaluatorDelegateImpl implements EvaluatorDelegate {
		public void execute(UbiPlace place, String code) {
			Env env = getInterpreter().getEnv();
			StringWriter sw = new StringWriter();
			BufferedWriter writer = new BufferedWriter(sw);
			try {
				Marshaller.marshall(Place.this, env.getCurrentScope(), writer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			String result = client.execute(place, sw.toString(), code);			
		}
	}
	
	private class ProxyDelegateImpl implements ProxyDelegate {

		// for Object
		public Scriptable get(RemoteRef remoteRef, String name) {
			String result = client.get(remoteRef, name);
			try {
				StringReader sr = new StringReader(result);
				BufferedReader reader = new BufferedReader(sr);
				Scriptable obj = Marshaller.unmarshall(Place.this, reader);
				reader.close();
				sr.close();
				return obj;
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		public void put(RemoteRef remoteRef, String name, Scriptable obj) {
			try {
				StringWriter sw = new StringWriter();
				BufferedWriter writer = new BufferedWriter(sw);
				Marshaller.marshall(Place.this, obj, writer);
				writer.close();
				sw.close();
				String encodedObject = sw.toString();
				client.put(remoteRef, name, encodedObject);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public boolean delete(RemoteRef remoteRef, String name) {
			return false;
		}

		// for Array
		public Scriptable get(RemoteRef remoteRef, int index) {
			String result = client.get(remoteRef, index);
			try {
				StringReader sr = new StringReader(result);
				BufferedReader reader = new BufferedReader(sr);
				Scriptable obj = Marshaller.unmarshall(Place.this, reader);
				reader.close();
				sr.close();
				return obj;
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		public void put(RemoteRef remoteRef, int index, Scriptable obj) {
			try {
				StringWriter sw = new StringWriter();
				BufferedWriter writer = new BufferedWriter(sw);
				Marshaller.marshall(Place.this, obj, writer);
				String encodedObject = sw.toString();
				writer.close();
				sw.close();
				client.put(remoteRef, index, encodedObject);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// for Function
		public Scriptable call(RemoteRef remoteRef, Scriptable[] args, Scriptable thisObj) {
			try {
				// encoding arguments
				String encodedArgs = null;
				if (args != null) {
					StringWriter sw = new StringWriter();
					BufferedWriter writer = new BufferedWriter(sw);
					for (int i = 0; i < args.length; i++)
						Marshaller.marshall(Place.this, args[i], writer);
					encodedArgs = sw.toString();
					writer.close();
					sw.close();
				}
				// encoding thisObj
				String encodedThisObj = null;
				if (thisObj != null) {
					StringWriter sw2 = new StringWriter();
					BufferedWriter writer2 = new BufferedWriter(sw2);
					Marshaller.marshall(Place.this, thisObj, writer2);
					encodedThisObj = sw2.toString();
					writer2.close();
					sw2.close();
				}
				String result = client.call(remoteRef, args.length, encodedArgs, encodedThisObj);
				StringReader sr = new StringReader(result);
				BufferedReader reader = new BufferedReader(sr);
				Scriptable obj = Marshaller.unmarshall(Place.this, reader);
				reader.close();
				sr.close();
				return obj;
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		public Scriptable construct(RemoteRef remoteRef, Scriptable[] args) {
			try {
				// encoding arguments
				String encodedArgs = null;
				if (args != null) {
					StringWriter sw = new StringWriter();
					BufferedWriter writer = new BufferedWriter(sw);
					for (int i = 0; i < args.length; i++)
						Marshaller.marshall(Place.this, args[i], writer);
					encodedArgs = sw.toString();
					writer.close();
					sw.close();
				}
				String result = client.construct(remoteRef, args.length, encodedArgs);
				StringReader sr = new StringReader(result);
				BufferedReader reader = new BufferedReader(sr);
				Scriptable obj = Marshaller.unmarshall(Place.this, reader);
				reader.close();
				sr.close();
				return obj;
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		
	}
}
