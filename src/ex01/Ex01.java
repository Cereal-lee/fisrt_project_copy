package ex01;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WerbServlet;

@WebServlet(urlPatterns = "/ex01/ex01")

public class Ex01 extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ex01</title>");
		out.println("</head>");
		out.println("<body>ex01</body>");
		out.println("</html>");		
	}
}
