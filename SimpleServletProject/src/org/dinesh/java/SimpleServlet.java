package org.dinesh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.authenticator.SavedRequest;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(urlPatterns={"/SimpleServletPath"}, initParams = {@WebInitParam(name="defaultUser", value="John Doe")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SimpleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(request.getLocalAddr());
		response.getWriter().print("response get writer method test ");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("name");
		/*sessions are used to save the parameter values in the servlets/ its a way to let the servlet remember the data values
		Sessions mainly can be used in use cases where we want to remember the user data or data values 
		Remember the user data i.e. for eg. userId data to customize the user experience by not asking userId every time
		Browsing appn diff features of appn. 
		*/
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != "null"){
		
			session.setAttribute("saveduserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		out.println("Request Paramaeter Username="+userName);
		out.println("Session Paramaeter Username="+ (String) session.getAttribute("saveduserName"));
		out.println("Context Paramaeter Username="+ (String) context.getAttribute("saveduserName"));
		out.println("Init Paramaeter DefaultUser="+ (String)this.getServletConfig().getInitParameter("defaultUser"));
	}

}
