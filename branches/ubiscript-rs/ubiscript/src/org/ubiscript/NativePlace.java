package org.ubiscript;

public class NativePlace extends NativeObject {

	private static final String DEFAULT_LOCATION = "http://127.0.0.1/";
	private String location;
	private String placeId;
	
	public NativePlace(Scriptable prototype, Environment env, String location, String placeId) {
		super(prototype, env);
		this.location = location;
		if ((placeId == null) || (placeId.trim().equals("")))
			this.placeId = java.util.UUID.randomUUID().toString();
		else
			this.placeId = placeId;
	}

	public static void init(Environment env) {
		Scriptable obj = new NativePlace(null, env, DEFAULT_LOCATION, null);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Place, obj, Property.CONST);
	}

	public String getLocation() {
		return location;
	}
	
	public String getPlaceId() {
		return placeId;
	}
	
	public String toString() {
		return "<PLACE:" + location + "#" + placeId + ">";
	}
	
	public Scriptable construct(Environment env, Evaluator eval, Scriptable[] args) throws UbiException {
		String location = DEFAULT_LOCATION;
		if (args.length > 0)
			location = args[0].toString();
		return env.newPlace(location, null);
	}

	public Scriptable invoke(Environment env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return env.getUndefined();
	}

}
