package org.ubiscript.server;

import org.ubiscript.*;

import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;

public class UbiscriptHttpClient {
	
	public static final String
			Param_action = "action",
			Param_placeId = "placeId",
			Param_encodedScope = "encodedScope",
			Param_code = "code",
			Param_exportId = "exportId",
			Param_name = "name",
			Param_index = "index",
			Param_value = "value",
			Param_args = "args",
			Param_argCount = "argCount",
			Param_thisObj = "thisObj";
	
	public static final String
			Action_execute = "execute",
			Action_getByName = "getByName",
			Action_putByName = "putByName",
			Action_delete = "delete",
			Action_getByIndex = "getByIndex",
			Action_putByIndex = "putByIndex",
			Action_call = "call",
			Action_construct = "construct";

	public UbiscriptHttpClient() {
	}
	
	public String execute(UbiPlace place, String encodedScope, String code) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(place.getLocation());
		post.addParameter(Param_action, Action_execute);
		post.addParameter(Param_placeId, place.getPlaceId());
		post.addParameter(Param_encodedScope, encodedScope);
		post.addParameter(Param_code, code);
		try {
			int statusCode = client.executeMethod(post);
			if (statusCode != HttpStatus.SC_OK)
				return "HTTP ERROR";
			String response = post.getResponseBodyAsString();
			return response;
		} catch (HttpException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {
			post.releaseConnection();
		}
	}
	
	public String get(RemoteRef remoteRef, String name) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(remoteRef.getLocation());
		post.addParameter(Param_action, Action_getByName);
		post.addParameter(Param_placeId, remoteRef.getPlaceId());
		post.addParameter(Param_exportId, Long.toString(remoteRef.getExportId()));
		post.addParameter(Param_name, name);
		try {
			int statusCode = client.executeMethod(post);
			if (statusCode != HttpStatus.SC_OK)
				return "HTTP ERROR";
			String response = post.getResponseBodyAsString();
			return response;
		} catch (HttpException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {
			post.releaseConnection();
		}
	}
	
	public String put(RemoteRef remoteRef, String name, String encodedObject) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(remoteRef.getLocation());
		post.addParameter(Param_action, Action_putByName);
		post.addParameter(Param_placeId, remoteRef.getPlaceId());
		post.addParameter(Param_exportId, Long.toString(remoteRef.getExportId()));
		post.addParameter(Param_name, name);
		post.addParameter(Param_value, encodedObject);
		try {
			int statusCode = client.executeMethod(post);
			if (statusCode != HttpStatus.SC_OK)
				return "HTTP ERROR";
			String response = post.getResponseBodyAsString();
			return response;
		} catch (HttpException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {
			post.releaseConnection();
		}
	}
	
	public String delete(RemoteRef remoteRef, String name) {
		return null;
	}
	
	public String get(RemoteRef remoteRef, int index) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(remoteRef.getLocation());
		post.addParameter(Param_action, Action_getByIndex);
		post.addParameter(Param_placeId, remoteRef.getPlaceId());
		post.addParameter(Param_exportId, Long.toString(remoteRef.getExportId()));
		post.addParameter(Param_index, Integer.toString(index));
		try {
			int statusCode = client.executeMethod(post);
			if (statusCode != HttpStatus.SC_OK)
				return "HTTP ERROR";
			String response = post.getResponseBodyAsString();
			return response;
		} catch (HttpException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {
			post.releaseConnection();
		}
	}

	public String put(RemoteRef remoteRef, int index, String encodedObject) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(remoteRef.getLocation());
		post.addParameter(Param_action, Action_putByIndex);
		post.addParameter(Param_placeId, remoteRef.getPlaceId());
		post.addParameter(Param_exportId, Long.toString(remoteRef.getExportId()));
		post.addParameter(Param_index, Integer.toString(index));
		post.addParameter(Param_value, encodedObject);
		try {
			int statusCode = client.executeMethod(post);
			if (statusCode != HttpStatus.SC_OK)
				return "HTTP ERROR";
			String response = post.getResponseBodyAsString();
			return response;
		} catch (HttpException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {
			post.releaseConnection();
		}
	}
	
	public String call(RemoteRef remoteRef, int argCount, String encodedArgs, String encodedThisObj) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(remoteRef.getLocation());
		post.addParameter(Param_action, Action_call);
		post.addParameter(Param_placeId, remoteRef.getPlaceId());
		post.addParameter(Param_exportId, Long.toString(remoteRef.getExportId()));
		post.addParameter(Param_argCount, Integer.toString(argCount));
		if (encodedArgs != null)
			post.addParameter(Param_args, encodedArgs);
		if (encodedThisObj != null)
			post.addParameter(Param_thisObj, encodedThisObj);
		try {
			int statusCode = client.executeMethod(post);
			if (statusCode != HttpStatus.SC_OK)
				return "HTTP ERROR";
			String response = post.getResponseBodyAsString();
			return response;
		} catch (HttpException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {
			post.releaseConnection();
		}
	}

	public String construct(RemoteRef remoteRef, int argCount, String encodedArgs) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(remoteRef.getLocation());
		post.addParameter(Param_action, Action_construct);
		post.addParameter(Param_placeId, remoteRef.getPlaceId());
		post.addParameter(Param_exportId, Long.toString(remoteRef.getExportId()));
		post.addParameter(Param_argCount, Integer.toString(argCount));
		if (encodedArgs != null)
			post.addParameter(Param_args, encodedArgs);
		try {
			int statusCode = client.executeMethod(post);
			if (statusCode != HttpStatus.SC_OK)
				return "HTTP ERROR";
			String response = post.getResponseBodyAsString();
			return response;
		} catch (HttpException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} finally {
			post.releaseConnection();
		}
	}

}
