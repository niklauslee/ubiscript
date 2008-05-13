package org.ubiscript;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class NativeJavaClass extends NativeScriptable {

	private Class javaClass;
	
	public NativeJavaClass(Scriptable prototype, Env env, Class javaClass) {
		super(prototype, env);
		this.javaClass = javaClass;
	}
	
	public static void init(Env env) {
		Scriptable obj = new NativeJavaClass(null, env, null);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_JavaClass, obj, Property.EMPTY);
	}

	public Scriptable get(String name, Scriptable start) {
		// TODO Field 경우는 값을 직접 리턴, Method의 경우는 super를 호출
		if (javaClass != null) {
			try {
				Field f = javaClass.getField(name);
				if (Modifier.isStatic(f.getModifiers()))
					return NativeJavaObject.JavaObjectToUbiObject(env, f.get(null));
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				return new NativeScriptableFunction(this, name);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return super.get(name, start);
	}
	
	public int getAttribute(String name) {
		// TODO Field인 경우는 field의 속성을 참고, Method의 경우는 CONST를 리턴.
		return super.getAttribute(name);
	}

	public boolean has(String name) {
		// TODO Field, Method에 있는 경우만 true
		return true;
	}

	public boolean delete(String name) {
		return false;
	}
	
	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		String className = null;
		if (args.length > 0) {
			try {
				className = args[0].toString();
				Class javaClass = Class.forName(className);
				Scriptable global = env.getGlobalObject();
				Scriptable obj = new NativeJavaClass(
						global.get(Constants.Id_JavaClass, global), env, javaClass);
				return obj;
			} catch (ClassNotFoundException e) {
				UbiError.throwRuntimeError(
						eval.getCurrentNode().getLine(), eval.getCurrentNode().getCharPositionInLine(),
						"'" + className + "' class not found");
			}
		}
		return env.getUndefined();
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		Object[] paramObjects = new Object[0];
		Class[] paramTypes = new Class[0];
		// collecting parameters of method
		if (args.length > 0) {
			paramObjects = new Object[args.length];
			paramTypes = new Class[args.length];
			for (int i = 0; i < args.length; i++) {
				paramObjects[i] = NativeJavaObject.UbiObjectToJavaObject(args[i]);
				paramTypes[i] = NativeJavaObject.UbiObjectToJavaType(args[i]);
			}
		}
		// invoke the method
		try {
			Method method = NativeJavaObject.findMethod(javaClass, name, paramTypes);
			if (Modifier.isStatic(method.getModifiers())) {
				Object result = method.invoke(null, paramObjects);
				return NativeJavaObject.JavaObjectToUbiObject(env, result);
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return env.getUndefined();
	}

}
