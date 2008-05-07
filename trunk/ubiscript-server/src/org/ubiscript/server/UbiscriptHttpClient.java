package org.ubiscript.server;

import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;

public class UbiscriptHttpClient {
	
	public static final String
			Param_action = "action",
			Param_placeId = "placeId",
			Param_freeVars = "freeVars",
			Param_code = "code",
			Param_refId = "refId",
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
	
	public void execute(String url, String placeId, String encodedVars, String code) {
		PostMethod post = new PostMethod(url);
		post.addParameter(Param_action, Action_exec);
		post.addParameter(Param_placeId, placeId);
		post.addParameter(Param_freeVars, encodedVars);
		post.addParameter(Param_code, code);
		try {
			int statusCode = client.executeMethod(post);
			
			if (statusCode != HttpStatus.SC_OK) {
				System.out.println("http error.");
			}
			
			String response = post.getResponseBodyAsString();
			System.out.println("response: " + response);
			
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			post.releaseConnection();
		}
	}
	
	public void get(String url) {
		
	}
}
