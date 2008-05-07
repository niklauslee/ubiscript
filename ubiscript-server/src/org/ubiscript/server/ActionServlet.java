package org.ubiscript.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String location = req.getScheme() + "://" + req.getServerName() + ":" +
				req.getServerPort() + req.getContextPath() + req.getServletPath();
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
				String refId = req.getParameter(UbiscriptHttpClient.Param_refId);
				String result = place.get(refId);
				out.print(result);
			} else if (action.equals(UbiscriptHttpClient.Action_put)) {
				String refId = req.getParameter(UbiscriptHttpClient.Param_refId);
				String value = req.getParameter(UbiscriptHttpClient.Param_value);
			} else if (action.equals(UbiscriptHttpClient.Action_call)) {
				String refId = req.getParameter(UbiscriptHttpClient.Param_refId);
				String args = req.getParameter(UbiscriptHttpClient.Param_args);
			} else {
				out.println("Unsupported Action: " + action);
			}
		} else {
			out.println("Action is not specified.");
		}
	}

}
