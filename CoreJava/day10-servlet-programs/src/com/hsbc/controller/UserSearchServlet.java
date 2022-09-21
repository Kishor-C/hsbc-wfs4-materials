package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.model.beans.User;
import com.hsbc.model.service.UserService;

/**
 * Servlet implementation class UserSearchServlet
 */
@WebServlet("/UserSearchServlet")
public class UserSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// needs to read user id
		int id = Integer.parseInt(request.getParameter("userId"));
		// we must use factory pattern to get the service object
		UserService service = new UserService();
		User user = service.fetchUser(id);
		// instead of if else it must try-catch if user throws exception
		if(user != null) {
			request.setAttribute("userObj", user);
			RequestDispatcher rd = request
					.getRequestDispatcher("info.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("error", "Sorry user "+id+" not found");
			RequestDispatcher rd = request
					.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}

}
