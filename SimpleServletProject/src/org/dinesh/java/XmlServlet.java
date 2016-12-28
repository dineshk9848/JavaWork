package org.dinesh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(request.getLocalAddr());
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("<h3>Servlet conf using web.xml or XML conf</H3>");
		out.println("HELLO from GET!"+userName);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		out.println("<h3>Servlet conf using web.xml or XML conf</H3>");
		out.println("HELLO from POST! "+userName + "Full Name="+fullName);
		out.println("Init Paramaeter DefaultUser="+ (String)this.getServletConfig().getInitParameter("defaultUser"));
		String prof = request.getParameter("prof");
		out.println("You are ="+ prof);
		//String location = request.getParameter("location");
		String [] location = request.getParameterValues("location");
		out.println("You are at ="+ location.length+"Places");
		for(int i=0;i<location.length;i++){
			out.println(location[i]);
		}
		
	}


}
