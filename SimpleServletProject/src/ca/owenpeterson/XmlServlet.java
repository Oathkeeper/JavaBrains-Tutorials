package ca.owenpeterson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("XML Servlet Called!");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userid = request.getParameter("userid");
		out.println("Hello " + userName + "! Your userid is: " + userid);
		out.println("Hello from the GET method " + userName + "!");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.println("XML Servlet Called!");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String userName = request.getParameter("userName");
			String userid = request.getParameter("userid");
			String fullName = request.getParameter("fullName");
			//out.println("Hello " + userName + "! Your userid is: " + userid);
			out.println("Hello from the POST method " + userName + "!" + "<br>");
			out.println("We know your full name is: " + fullName + "<br>");
			
			String prof = request.getParameter("prof");
			out.println("You are a " + prof + "<br>");
			
			String[] location = request.getParameterValues("location");
			out.println("You are at " + location.length + "places" + "<br>");
			
			for (int i=0; i < location.length; i++)
			{
				out.println(location[i] + "<br>");
			}
		}
	
}
