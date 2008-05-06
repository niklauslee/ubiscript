package org.ubiscript.server;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.ubiscript.Interpreter;
import org.ubiscript.UbiException;

public class ActionServlet extends HttpServlet {

	private static final String
		Param_action = "action",
		Param_interpreterId = "interpreterId",
		Param_freeVars = "freeVars",
		Param_code = "code",
		Param_referenceId = "referenceId",
		Param_value = "value",
		Param_arguments = "arguments";

	private static final String
		Action_exec = "EXEC",
		Action_get = "GET",
		Action_put = "PUT",
		Action_call = "CALL";
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String action = req.getParameter(Param_action);
		if (action != null) {
			if (action.equals(Action_exec)) {
				executeAction(req, resp);
			} else if (action.equals(Action_get)) {
				getAction(req, resp);
			} else if (action.equals(Action_put)) {
				putAction(req, resp);
			} else if (action.equals(Action_call)) {
				callAction(req, resp);
			} else {
				PrintWriter out = resp.getWriter();
				out.println("Unsupported Action: " + action);
			}
		} else {
			PrintWriter out = resp.getWriter();
			out.println("Action is not specified.");
		}
	}

	private void executeAction(HttpServletRequest req, HttpServletResponse resp) {
		String interpreterId = req.getParameter(Param_interpreterId);
		String freeVars = req.getParameter(Param_freeVars);
		// freeVars = <url, id, referenceId>*
		String code = req.getParameter(Param_code);
		Interpreter interp = new Interpreter();
		try {
			interp.execute(code);
		} catch (UbiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void getAction(HttpServletRequest req, HttpServletResponse resp) {
		String interpreterId = req.getParameter(Param_interpreterId);
		String referenceId = req.getParameter(Param_referenceId);
		
	}

	private void putAction(HttpServletRequest req, HttpServletResponse resp) {
		String interpreterId = req.getParameter(Param_interpreterId);
		String referenceId = req.getParameter(Param_referenceId);
		String value = req.getParameter(Param_value);
		
	}
	
	private void callAction(HttpServletRequest req, HttpServletResponse resp) {
		String interpreterId = req.getParameter(Param_interpreterId);
		String referenceId = req.getParameter(Param_referenceId);
		String arguments = req.getParameter(Param_arguments);
		
	}
}
