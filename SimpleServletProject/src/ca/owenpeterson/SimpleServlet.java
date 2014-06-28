package ca.owenpeterson;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServlet" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello from GET method.");
		response.setContentType("text/html");		
		PrintWriter writer = response.getWriter();
		
		String username = request.getParameter("name");
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		if (username != "" && username != null) {
			session.setAttribute("savedUsername", username);
			context.setAttribute("savedUsername", username);
		}		
		
		//session.setAttribute("savedUsername", username);
		writer.println("Hello, " + username + "<br />");
		writer.println("Request parameter has username as " + username + "<br />");
		writer.println("Session parameter has username as " + (String) session.getAttribute("savedUsername") + "<br />");
		writer.println("Context parameter has username as " + (String) context.getAttribute("savedUsername") + "<br />");
		
	}

}
