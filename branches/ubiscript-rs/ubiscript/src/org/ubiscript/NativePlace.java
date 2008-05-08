package org.ubiscript;

public class NativePlace extends NativeObject {

	private static final String DEFAULT_LOCATION = "http://127.0.0.1/";
	private String location;
	private String placeId;
	
	public NativePlace(UbiObject prototype, Environment env, String location, String placeId) {
		super(prototype, env);
		this.location = location;
		if ((placeId == null) || (placeId.trim().equals("")))
			this.placeId = java.util.UUID.randomUUID().toString();
		else
			this.placeId = placeId;
	}

	public static void init(Environment env) {
		UbiObject obj = new NativePlace(null, env, DEFAULT_LOCATION, null);
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
	
	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		String location = DEFAULT_LOCATION;
		if (args.length > 0)
			location = args[0].toString();
		return env.newPlace(location, null);
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		return env.getUndefined();
	}

}
