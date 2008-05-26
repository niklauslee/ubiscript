package org.ubiscript.server;

import org.ubiscript.*;

import java.io.IOException;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;

public class UbiscriptHttpClient implements Client {
	
	public UbiscriptHttpClient() {
	}
	
	public String execute(UbiPlace place, String encodedScope, String code) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod(place.getLocation());
		post.addParameter(PARAM_ACTION, ACTION_EXECUTE);
		post.addParameter(PARAM_PLACEID, place.getPlaceId());
		post.addParameter(PARAM_ENCODEDSCOPE, encodedScope);
		post.addParameter(PARAM_CODE, code);
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
		post.addParameter(PARAM_ACTION, ACTION_GETBYNAME);
		post.addParameter(PARAM_PLACEID, remoteRef.getPlaceId());
		post.addParameter(PARAM_EXPORTID, Long.toString(remoteRef.getExportId()));
		post.addParameter(PARAM_NAME, name);
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
		post.addParameter(PARAM_ACTION, ACTION_PUTBYNAME);
		post.addParameter(PARAM_PLACEID, remoteRef.getPlaceId());
		post.addParameter(PARAM_EXPORTID, Long.toString(remoteRef.getExportId()));
		post.addParameter(PARAM_NAME, name);
		post.addParameter(PARAM_VALUE, encodedObject);
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
		post.addParameter(PARAM_ACTION, ACTION_GETBYINDEX);
		post.addParameter(PARAM_PLACEID, remoteRef.getPlaceId());
		post.addParameter(PARAM_EXPORTID, Long.toString(remoteRef.getExportId()));
		post.addParameter(PARAM_INDEX, Integer.toString(index));
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
		post.addParameter(PARAM_ACTION, ACTION_PUTBYINDEX);
		post.addParameter(PARAM_PLACEID, remoteRef.getPlaceId());
		post.addParameter(PARAM_EXPORTID, Long.toString(remoteRef.getExportId()));
		post.addParameter(PARAM_INDEX, Integer.toString(index));
		post.addParameter(PARAM_VALUE, encodedObject);
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
		post.addParameter(PARAM_ACTION, ACTION_CALL);
		post.addParameter(PARAM_PLACEID, remoteRef.getPlaceId());
		post.addParameter(PARAM_EXPORTID, Long.toString(remoteRef.getExportId()));
		post.addParameter(PARAM_ARGCOUNT, Integer.toString(argCount));
		if (encodedArgs != null)
			post.addParameter(PARAM_ARGS, encodedArgs);
		if (encodedThisObj != null)
			post.addParameter(PARAM_THISOBJ, encodedThisObj);
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
		post.addParameter(PARAM_ACTION, ACTION_CONSTRUCT);
		post.addParameter(PARAM_PLACEID, remoteRef.getPlaceId());
		post.addParameter(PARAM_EXPORTID, Long.toString(remoteRef.getExportId()));
		post.addParameter(PARAM_ARGCOUNT, Integer.toString(argCount));
		if (encodedArgs != null)
			post.addParameter(PARAM_ARGS, encodedArgs);
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
