package org.ubiscript;

public class NativePlace extends NativeObject {

	private static final String DEFAULT_LOCATION = "http://127.0.0.1/";
	private String location;
	private String placeId;
	
	public NativePlace(UbiObject prototype, Environment env, String location) {
		super(prototype, env);
		this.location = location;
		this.placeId = java.util.UUID.randomUUID().toString();
	}

	public static void init(Environment env) {
		UbiObject obj = new NativePlace(null, env, DEFAULT_LOCATION);
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
		UbiObject obj = new NativePlace(env.getRootScope().get(Constants.Id_Place), 
				env, location);
		return obj;
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		return env.getUndefined();
	}

}
