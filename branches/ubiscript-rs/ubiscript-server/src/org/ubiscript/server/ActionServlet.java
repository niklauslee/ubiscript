package org.ubiscript.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ubiscript.UbiAbstractRef;

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
			if (action.equals(UbiscriptHttpClient.Action_exec)) {
				String freeVars = req.getParameter(UbiscriptHttpClient.Param_freeVars);
				String code = req.getParameter(UbiscriptHttpClient.Param_code);
				String result = place.execute(freeVars, code);
				out.print(result);
			} else if (action.equals(UbiscriptHttpClient.Action_get)) {
				String baseId = req.getParameter(UbiscriptHttpClient.Param_baseId);
				int nameOrIndex = Integer.parseInt(
						req.getParameter(UbiscriptHttpClient.Param_nameOrIndex));
				String name = null;
				int index = -1;
				if (nameOrIndex == UbiAbstractRef.REF_BY_NAME) {
					name = req.getParameter(UbiscriptHttpClient.Param_name);
				} else {
					index = Integer.parseInt(req.getParameter(UbiscriptHttpClient.Param_index));
				}
				String result = place.get(baseId, nameOrIndex, name, index);
				out.print(result);
			} else if (action.equals(UbiscriptHttpClient.Action_put)) {
				String baseId = req.getParameter(UbiscriptHttpClient.Param_baseId);
				int nameOrIndex = Integer.parseInt(
						req.getParameter(UbiscriptHttpClient.Param_nameOrIndex));
				String name = null;
				int index = -1;
				if (nameOrIndex == UbiAbstractRef.REF_BY_NAME) {
					name = req.getParameter(UbiscriptHttpClient.Param_name);
				} else {
					index = Integer.parseInt(req.getParameter(UbiscriptHttpClient.Param_index));
				}
				String value = req.getParameter(UbiscriptHttpClient.Param_value);
				String result = place.put(baseId, nameOrIndex, name, index, value);
				out.print(result);
			} else if (action.equals(UbiscriptHttpClient.Action_call)) {
				String baseId = req.getParameter(UbiscriptHttpClient.Param_baseId);
				String args = req.getParameter(UbiscriptHttpClient.Param_args);
			} else {
				out.println("Unsupported Action: " + action);
			}
		} else {
			out.println("Action is not specified.");
		}
	}

}
