package org.ubiscript.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {
	
	private PlaceManager getPlaceManager(String url) {
		ServletContext context = getServletContext();
		PlaceManager manager = (PlaceManager) context.getAttribute("PlaceManager");
		if (manager == null) {
			manager = new PlaceManager(url);
			context.setAttribute("PlaceManager", manager);
		}
		return manager;
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String url = req.getScheme() + "://" + req.getServerName() + ":" +
				req.getServerPort() + req.getContextPath() + req.getServletPath();
		PlaceManager placeManager = getPlaceManager(url);
		String action = req.getParameter(UbiscriptHttpClient.Param_action);
		String placeId = req.getParameter(UbiscriptHttpClient.Param_placeId);
		Place place = placeManager.getPlace(placeId);
		if (action != null) {
			if (action.equals(UbiscriptHttpClient.Action_exec)) {
				executeAction(place, req, resp);
			} else if (action.equals(UbiscriptHttpClient.Action_get)) {
				getAction(place, req, resp);
			} else if (action.equals(UbiscriptHttpClient.Action_put)) {
				putAction(place, req, resp);
			} else if (action.equals(UbiscriptHttpClient.Action_call)) {
				callAction(place, req, resp);
			} else {
				PrintWriter out = resp.getWriter();
				out.println("Unsupported Action: " + action);
			}
		} else {
			PrintWriter out = resp.getWriter();
			out.println("Action is not specified.");
		}
	}

	private void executeAction(Place place, HttpServletRequest req, HttpServletResponse resp) {
		String placeId = req.getParameter(UbiscriptHttpClient.Param_placeId);
		String freeVars = req.getParameter(UbiscriptHttpClient.Param_freeVars);
		String code = req.getParameter(UbiscriptHttpClient.Param_code);
		place.execute(freeVars, code);
	}
	
	private void getAction(Place place, HttpServletRequest req, HttpServletResponse resp) {
		String placeId = req.getParameter(UbiscriptHttpClient.Param_placeId);
		String refId = req.getParameter(UbiscriptHttpClient.Param_refId);
		
	}

	private void putAction(Place place, HttpServletRequest req, HttpServletResponse resp) {
		String placeId = req.getParameter(UbiscriptHttpClient.Param_placeId);
		String refId = req.getParameter(UbiscriptHttpClient.Param_refId);
		String value = req.getParameter(UbiscriptHttpClient.Param_value);
		
	}
	
	private void callAction(Place place, HttpServletRequest req, HttpServletResponse resp) {
		String placeId = req.getParameter(UbiscriptHttpClient.Param_placeId);
		String refId = req.getParameter(UbiscriptHttpClient.Param_refId);
		String args = req.getParameter(UbiscriptHttpClient.Param_args);
		
	}
}
