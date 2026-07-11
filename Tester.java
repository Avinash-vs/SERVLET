package Demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/avi")
public class Tester extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException   {
		int a=Integer.parseInt(req.getParameter("a"));
		int b=Integer.parseInt(req.getParameter("b"));
		int sum=a+b;
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h2>Addition is:" + sum + "<h2>");
	}
	
}
