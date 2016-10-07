package com.interior.action;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForntController")
public class FrontController extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
  private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		
		if (command.equals("/mainpage.html")) {
		  forward = new ActionForward();
		  forward.setRedirect(false);
		  forward.setPath("./page/mainpage.jsp");

		} else if (command.equals("/noti_list.html")) {
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./noti/noti_list.jsp");
		
		} else if (command.equals("/catalogue.html")) {
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./catalogue/catalogue.jsp");
		
		} else if (command.equals("/product_list.html")) {
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./product/product_list.jsp");
		
		} else if (command.equals("/review_list.html")) {
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./review/review_list.jsp");
		
		} else if (command.equals("/qna_list.html")) {
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./qnaboard/qna_list.jsp");
		
		} else if (command.equals("/advice_request.html")) {
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("./advice/advice_request.jsp");
		
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
	  System.out.println("get방식");
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  System.out.println("post방식");
		doProcess(request, response);
	}

}
