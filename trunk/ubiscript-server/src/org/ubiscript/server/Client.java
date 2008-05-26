package org.ubiscript.server;

import org.ubiscript.RemoteRef;
import org.ubiscript.UbiPlace;

public interface Client {

	public static final String
			PARAM_ACTION = "ACTION",
			PARAM_PLACEID = "PLACEID",
			PARAM_ENCODEDSCOPE = "ENCODEDSCOPE",
			PARAM_CODE = "CODE",
			PARAM_EXPORTID = "EXPORTID",
			PARAM_NAME = "NAME",
			PARAM_INDEX = "INDEX",
			PARAM_VALUE = "VALUE",
			PARAM_ARGS = "ARGS",
			PARAM_ARGCOUNT = "ARGCOUNT",
			PARAM_THISOBJ = "THISOBJ";

	public static final String
			ACTION_EXECUTE = "EXECUTE",
			ACTION_GETBYNAME = "GETBYNAME",
			ACTION_PUTBYNAME = "PUTBYNAME",
			ACTION_DELETE = "DELETE",
			ACTION_GETBYINDEX = "GETBYINDEX",
			ACTION_PUTBYINDEX = "PUTBYINDEX",
			ACTION_CALL = "CALL",
			ACTION_CONSTRUCT = "CONSTRUCT";

	public abstract String execute(UbiPlace place, String encodedScope,
			String code);

	public abstract String get(RemoteRef remoteRef, String name);

	public abstract String put(RemoteRef remoteRef, String name,
			String encodedObject);

	public abstract String delete(RemoteRef remoteRef, String name);

	public abstract String get(RemoteRef remoteRef, int index);

	public abstract String put(RemoteRef remoteRef, int index,
			String encodedObject);

	public abstract String call(RemoteRef remoteRef, int argCount,
			String encodedArgs, String encodedThisObj);

	public abstract String construct(RemoteRef remoteRef, int argCount,
			String encodedArgs);

}