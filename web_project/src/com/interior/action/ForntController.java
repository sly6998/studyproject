package com.interior.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForntController")
public class ForntController extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  
	  System.out.println("3");

		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		
		System.out.println("4");
		if (command.equals("/MainPage.html")) {
		  System.out.println("5");
		  forward = new ActionForward();
      forward.setRedirect(false);
      forward.setPath("./mainpage.jsp");

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		} else if (command.equals("")) {

		}

		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  System.out.println("1");
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  System.out.println("2");
		doProcess(request, response);
	}

}
