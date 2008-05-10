package org.ubiscript.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.InetAddress;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ubiscript.*;

public class ActionServlet extends HttpServlet {
	
	private PlaceManager getPlaceManager(String location) {
		ServletContext context = getServletContext();
		PlaceManager manager = (PlaceManager) context.getAttribute("PlaceManager");
		if (manager == null) {
			manager = new PlaceManager(location);
			context.setAttribute("PlaceManager", manager);
		}
		return manager;
	}
	
	private String getLocalHost() {
		try {
			InetAddress address = InetAddress.getLocalHost();
			String host = address.getHostAddress();
			return host;
		} catch(Exception e) {
			return null;
		}
	}
	
	// TODO 자기 자신의 URL을 생성하는 것 보다는 web.xml의 설정 부분에 입력해주는 편이 좋지 않을지 검토 요망.
	private String getCurrentLocation(HttpServletRequest req) {
		
		String location = req.getScheme() + "://" + 
				getLocalHost() + ":" +	req.getServerPort() + 
				req.getContextPath() + req.getServletPath();
		return location;
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String location = getCurrentLocation(req);
		PlaceManager placeManager = getPlaceManager(location);
		String action = req.getParameter(UbiscriptHttpClient.Param_action);
		String placeId = req.getParameter(UbiscriptHttpClient.Param_placeId);
		if ((placeId == null) || (placeId.trim().equals("")))
			placeId = java.util.UUID.randomUUID().toString();
		Place place = placeManager.getPlace(placeId);
		PrintWriter out = resp.getWriter();
		if (action != null) {
			if (action.equals(UbiscriptHttpClient.Action_execute)) {
				String encodedScope = req.getParameter(UbiscriptHttpClient.Param_encodedScope);
				String code = req.getParameter(UbiscriptHttpClient.Param_code);
				String result = place.execute(encodedScope, code);
				out.print(result);
			} else if (action.equals(UbiscriptHttpClient.Action_getByName)) {
				long exportId = Long.parseLong(req.getParameter(UbiscriptHttpClient.Param_exportId));
				String name = req.getParameter(UbiscriptHttpClient.Param_name);
				Scriptable base = place.getExportedObject(exportId);
				Scriptable obj = base.get(name, base);
				StringWriter sw = new StringWriter();
				BufferedWriter writer = new BufferedWriter(sw);
				Marshaller.marshall(place, obj, writer);
				String value = sw.toString();
				writer.close();
				sw.close();
				out.print(value);
			} else if (action.equals(UbiscriptHttpClient.Action_putByName)) {
				long exportId = Long.parseLong(req.getParameter(UbiscriptHttpClient.Param_exportId));
				String name = req.getParameter(UbiscriptHttpClient.Param_name);
				String value = req.getParameter(UbiscriptHttpClient.Param_value);
				Scriptable base = place.getExportedObject(exportId);
				StringReader sr = new StringReader(value);
				BufferedReader reader = new BufferedReader(sr);
				Scriptable obj = Marshaller.unmarshall(place, reader);
				reader.close();
				sr.close();
				base.put(name, obj, Property.EMPTY);
				out.println("PUT BY NAME - OK");
			} else if (action.equals(UbiscriptHttpClient.Action_getByIndex)) {
				long exportId = Long.parseLong(req.getParameter(UbiscriptHttpClient.Param_exportId));
				int index = Integer.parseInt(req.getParameter(UbiscriptHttpClient.Param_index));
				Scriptable base = place.getExportedObject(exportId);
				Scriptable obj = base.get(index);
				StringWriter sw = new StringWriter();
				BufferedWriter writer = new BufferedWriter(sw);
				Marshaller.marshall(place, obj, writer);
				String value = sw.toString();
				writer.close();
				sw.close();
				out.print(value);
			} else if (action.equals(UbiscriptHttpClient.Action_putByIndex)) {
				long exportId = Long.parseLong(req.getParameter(UbiscriptHttpClient.Param_exportId));
				int index = Integer.parseInt(req.getParameter(UbiscriptHttpClient.Param_index));
				String value = req.getParameter(UbiscriptHttpClient.Param_value);
				Scriptable base = place.getExportedObject(exportId);
				StringReader sr = new StringReader(value);
				BufferedReader reader = new BufferedReader(sr);
				Scriptable obj = Marshaller.unmarshall(place, reader);
				reader.close();
				sr.close();
				base.put(index, obj);
				out.println("PUT BY INDEX - OK");
			} else if (action.equals(UbiscriptHttpClient.Action_call)) {
				long exportId = Long.parseLong(req.getParameter(UbiscriptHttpClient.Param_exportId));
				int argCount = Integer.parseInt(req.getParameter(UbiscriptHttpClient.Param_argCount));
				String encodedArgs = req.getParameter(UbiscriptHttpClient.Param_args);
				String encodedThisObj = req.getParameter(UbiscriptHttpClient.Param_thisObj);
				// decoding arguments
				Scriptable[] args = new Scriptable[argCount];
				if (encodedArgs != null) {
					StringReader sr = new StringReader(encodedArgs);
					BufferedReader reader = new BufferedReader(sr);
					for (int i = 0; i < argCount; i++)
						args[i] = Marshaller.unmarshall(place, reader);
					reader.close();
					sr.close();
				}
				// decoding thisObj
				Scriptable thisObj = null;
				if (encodedThisObj != null) {
					StringReader sr2 = new StringReader(encodedThisObj);
					BufferedReader reader2 = new BufferedReader(sr2);
					thisObj = Marshaller.unmarshall(place, reader2);
					reader2.close();
					sr2.close();
				}
				Scriptable base = place.getExportedObject(exportId);
				try {
					Scriptable obj = base.call(place.getInterpreter().getEnv(), 
							place.getInterpreter().getEvaluator(), args, thisObj);
					StringWriter sw = new StringWriter();
					BufferedWriter writer = new BufferedWriter(sw);
					Marshaller.marshall(place, obj, writer);
					String result = sw.toString();
					writer.close();
					sw.close();
					out.print(result);
				} catch (UbiException e) {
					e.printStackTrace();
					out.print(e.getLocalizedMessage());
				}
			} else if (action.equals(UbiscriptHttpClient.Action_construct)) {
				long exportId = Long.parseLong(req.getParameter(UbiscriptHttpClient.Param_exportId));
				int argCount = Integer.parseInt(req.getParameter(UbiscriptHttpClient.Param_argCount));
				String encodedArgs = req.getParameter(UbiscriptHttpClient.Param_args);
				// decoding arguments
				Scriptable[] args = new Scriptable[argCount];
				if (encodedArgs != null) {
					StringReader sr = new StringReader(encodedArgs);
					BufferedReader reader = new BufferedReader(sr);
					for (int i = 0; i < argCount; i++)
						args[i] = Marshaller.unmarshall(place, reader);
					reader.close();
					sr.close();
				}
				Scriptable base = place.getExportedObject(exportId);
				try {
					Scriptable obj = base.construct(place.getInterpreter().getEnv(), 
							place.getInterpreter().getEvaluator(), args);
					StringWriter sw = new StringWriter();
					BufferedWriter writer = new BufferedWriter(sw);
					Marshaller.marshall(place, obj, writer);
					out.print(sw.toString());
				} catch (UbiException e) {
					e.printStackTrace();
					out.print(e.getLocalizedMessage());
				}
			} else {
				out.println("Unsupported Action: " + action);
			}
		} else {
			out.println("Action is not specified.");
		}
		out.close();
	}

}
