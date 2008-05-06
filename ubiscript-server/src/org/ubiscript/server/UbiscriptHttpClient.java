package org.ubiscript.server;

import java.io.IOException;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;

public class UbiscriptHttpClient {
	
	private HttpClient client;
	
	public UbiscriptHttpClient() {
		client = new HttpClient();
	}
	
	public void execute(String url, String encodedVars, String code) {
		PostMethod post = new PostMethod();
		post.addParameter("action", "EXEC");
		post.addParameter("interpreterId", "");
		post.addParameter("freeVars", encodedVars);
		post.addParameter("code", code);
		try {
			int statusCode = client.executeMethod(post);
			
			if (statusCode != HttpStatus.SC_OK) {
				System.out.println("http error.");
			}
			
			String response = post.getResponseBodyAsString();
			System.out.println("response: " + response);
			
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			post.releaseConnection();
		}
		
	}
}
