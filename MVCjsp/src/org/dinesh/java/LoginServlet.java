package org.dinesh.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dinesh.java.dto.User;
import org.dinesh.java.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String userId, password;
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		LoginService loginservice1 = new LoginService();
		boolean result = loginservice1.authenticate(userId, password);
		
		if(result){
			User user = loginservice1.getUserDetails(userId);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("success.jsp");
			return;
		}
		else{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
