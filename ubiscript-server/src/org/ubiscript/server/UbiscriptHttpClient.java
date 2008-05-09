package org.ubiscript.server;

import org.ubiscript.*;
import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;

public class UbiscriptHttpClient {
	
	public static final String
			Param_action = "action",
			Param_placeId = "placeId",
			Param_freeVars = "freeVars",
			Param_code = "code",
			Param_baseId = "baseId",
			Param_nameOrIndex = "nameOrIndex",
			Param_name = "name",
			Param_index = "index",
			Param_value = "value",
			Param_args = "args";

	public static final String
			Action_exec = "EXEC",
			Action_get = "GET",
			Action_put = "PUT",
			Action_call = "CALL";

	private HttpClient client;
	
	public UbiscriptHttpClient() {
		client = new HttpClient();
	}
	
	public String execute(String location, String placeId, String encodedVars, String code) {
		PostMethod post = new PostMethod(location);
		post.addParameter(Param_action, Action_exec);
		post.addParameter(Param_placeId, placeId);
		post.addParameter(Param_freeVars, encodedVars);
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
	
	public String get(String location, String placeId, String baseId,
			int nameOrIndex, String name, int index) {
		PostMethod post = new PostMethod(location);
		post.addParameter(Param_action, Action_get);
		post.addParameter(Param_placeId, placeId);
		post.addParameter(Param_baseId, baseId);
		post.addParameter(Param_nameOrIndex, Integer.toString(nameOrIndex));
		if (nameOrIndex == UbiAbstractRef.REF_BY_NAME)
			post.addParameter(Param_name, name);
		else
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
	
	public String put(String location, String placeId, 
			String baseId, int nameOrIndex, String name, int index, 
			String encodedValue) {
		PostMethod post = new PostMethod(location);
		post.addParameter(Param_action, Action_put);
		post.addParameter(Param_placeId, placeId);
		post.addParameter(Param_baseId, baseId);
		post.addParameter(Param_nameOrIndex, Integer.toString(nameOrIndex));
		if (nameOrIndex == UbiAbstractRef.REF_BY_NAME)
			post.addParameter(Param_name, name);
		else
			post.addParameter(Param_index, Integer.toString(index));
		post.addParameter(Param_value, encodedValue);
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
