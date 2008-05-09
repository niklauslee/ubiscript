package org.ubiscript;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("unchecked")
public class NativeJavaObject extends NativeScriptable {

	private Object javaObject;
	
	public NativeJavaObject(Scriptable prototype, Env env, Object javaObject) {
		super(prototype, env);
		this.javaObject = javaObject;
	}

	public static void init(Env env) {
		Scriptable obj = new NativeJavaObject(null, env, null);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_JavaObject, obj, Property.EMPTY);
	}

	public Object getJavaObject() {
		return javaObject;
	}

	public Scriptable get(String name, Scriptable start) {
		// TODO Field 경우는 값을 직접 리턴, Method의 경우는 super를 호출
		if (javaObject != null) {
			Class c = javaObject.getClass();
			try {
				Field f = c.getField(name);
				return JavaObjectToUbiObject(env, f.get(javaObject));
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
		Object[] paramObjects = null;
		Class[] paramTypes = null;
		NativeJavaObject ubiObject = null;
		// collecting parameters of constructor
		if (args.length > 0) {
			className = args[0].toString();
			paramObjects = new Object[args.length - 1];
			paramTypes = new Class[args.length - 1];
			for (int i = 1; i < args.length; i++) {
				paramObjects[i - 1] = UbiObjectToJavaObject(args[i]);
				paramTypes[i - 1] = UbiObjectToJavaType(args[i]);
			}
		}
		// instantiate a Java object
		try {
			Class javaClass = Class.forName(className);
			Constructor ctor = findConstructor(javaClass, paramTypes); 
			Object javaObject = ctor.newInstance(paramObjects);
			Scriptable root = env.getRootScope();
			ubiObject = new NativeJavaObject(
					root.get(Constants.Id_JavaObject, root), env, javaObject);
		} catch(ClassNotFoundException e) {
			UbiError.throwRuntimeError(
					eval.getCurrentNode().getLine(), eval.getCurrentNode().getCharPositionInLine(),
					"'" + className + "' class not found");
		} catch (NoSuchMethodException e) {
			UbiError.throwRuntimeError(
					eval.getCurrentNode().getLine(), eval.getCurrentNode().getCharPositionInLine(),
					"no such method");
		} catch (IllegalArgumentException e) {
			UbiError.throwRuntimeError(
					eval.getCurrentNode().getLine(), eval.getCurrentNode().getCharPositionInLine(),
					"illegal arguments");
		} catch (InstantiationException e) {
			UbiError.throwRuntimeError(
					eval.getCurrentNode().getLine(), eval.getCurrentNode().getCharPositionInLine(),
					"instantiation failed");
		} catch (IllegalAccessException e) {
			UbiError.throwRuntimeError(
					eval.getCurrentNode().getLine(), eval.getCurrentNode().getCharPositionInLine(),
					"illegal access");
		} catch (InvocationTargetException e) {
			UbiError.throwRuntimeError(
					eval.getCurrentNode().getLine(), eval.getCurrentNode().getCharPositionInLine(),
					"invocation target error");
		}
		return ubiObject;
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		Class clazz = javaObject.getClass();
		Object[] paramObjects = new Object[0];
		Class[] paramTypes = new Class[0];
		// collecting parameters of constructor
		if (args.length > 0) {
			paramObjects = new Object[args.length];
			paramTypes = new Class[args.length];
			for (int i = 0; i < args.length; i++) {
				paramObjects[i] = UbiObjectToJavaObject(args[i]);
				paramTypes[i] = UbiObjectToJavaType(args[i]);
			}
		}
		// invoke the method
		try {
			Method method = findMethod(clazz, name, paramTypes);
			Object result = method.invoke(javaObject, paramObjects);
			return JavaObjectToUbiObject(env, result);
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
	
	public static Object UbiObjectToJavaObject(Scriptable o) {
		if (o instanceof UbiNumber) {
			UbiNumber n = (UbiNumber) o;
			if (n.isInt()) {
				return new Integer(n.toInt());
			} else {
				return new Float(n.getValue());
			}
		} else if (o instanceof UbiBoolean) {
			UbiBoolean b = (UbiBoolean) o;
			return new Boolean(b.getValue());
		} else if (o instanceof UbiString) {
			UbiString s = (UbiString) o;
			return s.getValue();
		} else if (o instanceof NativeJavaObject) {
			NativeJavaObject j = (NativeJavaObject) o;
			return j.getJavaObject();
		} else if (o instanceof UbiNull) {
			return null;
		}
		return null;
	}
	
	public static Class UbiObjectToJavaType(Scriptable o) {
		if (o instanceof UbiNumber) {
			if (((UbiNumber) o).isInt()) {
				return Integer.TYPE;
			} else {
				return Float.TYPE;
			}
		} else if (o instanceof UbiBoolean) {
			return Boolean.TYPE;
		} else if (o instanceof UbiString) {
			return java.lang.String.class;
		} else if (o instanceof NativeJavaObject) {
			return ((NativeJavaObject) o).getJavaObject().getClass();
		} else if ((o instanceof UbiNull) || (o == null)) {
			return null;
		} else {
			return java.lang.Object.class;
		}
	}
	
	public static Scriptable JavaObjectToUbiObject(Env env, Object o) {
		if (o == null) {
			return env.getNull();
		} else if (o instanceof Integer) {
			return env.newNumber(((Integer) o).intValue());
		} else if (o instanceof Long) {
			return env.newNumber(((Long) o).doubleValue());
		} else if (o instanceof Float) {
			return env.newNumber(((Float) o).doubleValue());
		} else if (o instanceof Double) {
			return env.newNumber(((Double) o).doubleValue());
		} else if (o instanceof Boolean) {
			return env.newBoolean(((Boolean) o).booleanValue());
		} else if (o instanceof String) {
			return env.newString((String) o);
		} else if (o instanceof Object[]) {
			Object[] array = (Object[]) o;
			Scriptable[] ubiArray = new Scriptable[array.length];
			for (int i = 0; i < array.length; i++) {
				ubiArray[i] = JavaObjectToUbiObject(env, array[i]);
			}
			return env.newArray(ubiArray.length, ubiArray);
		} else {
			Scriptable root = env.getRootScope();
			return new NativeJavaObject(root.get(Constants.Id_JavaObject, root), env, o);
		}
	}
	
	public static boolean isAssignableType(Class c1, Class c2) {
		if (c1.isPrimitive()) {
			if (c1 == short.class) {
				return (c2 == short.class);
			} else if (c1 == int.class) {
				return ((c2 == short.class) || (c2 == int.class));
			} else if (c1 == long.class) {
				return ((c2 == short.class) || (c2 == int.class) || (c2 == long.class));
			} else if (c1 == float.class) {
				return (c2 == float.class);
			} else if (c1 == double.class) {
				return ((c2 == float.class) || (c2 == double.class));
			} else {
				return (c1 == c2);
			}
		} else {
			if (c2 == null)
				return true;
			else
				return (c1.isAssignableFrom(c2));
		}
	}

	public static boolean isAssignableParameters(Class[] p1, Class[] p2) {
		if (p1.length == p2.length) {
			for (int i = 0; i < p1.length; i++) {
				if (!isAssignableType(p1[i], p2[i]))
					return false;
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static Method findMethod(Class c, String methodName, Class[] partypes) throws java.lang.NoSuchMethodException {
		Method methods[] = c.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			if (m.getName().equals(methodName) && isAssignableParameters(m.getParameterTypes(), partypes)) {
				return m;
			}
		}
		throw new NoSuchMethodException(methodName + partypes.length);
	}
	
	public static Constructor findConstructor(Class c, Class[] partypes) throws java.lang.NoSuchMethodException {
		Constructor cons[] = c.getConstructors();
		for (int i = 0; i < cons.length; i++) {
			Constructor ctr = cons[i];
			if (isAssignableParameters(ctr.getParameterTypes(), partypes)) {
				return ctr;
			}
		}
		throw new NoSuchMethodException();
	}
}
