package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloGuys
 */
@WebServlet({ "/HelloGuys", "/helloguys" })
public class HelloGuys extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HelloGuys() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		System.out.println("Helo Guys");
		PrintWriter out = response.getWriter();
		// out.println("Hello Guys today's topic is Servlet/Tomcat");
		// out.println("Time is"+ new java.util.Date());
		// RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		// rd.include(request,response);

		out.println("<html>");
		out.println("<body>");

		out.println("<table>");
		out.println("<tr>");
		out.println("<th>Company</th>");
		out.println("<th>Contact</th>");
		out.println("<th>Country</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Alfreds Futterkiste</td>");
		out.println("<td>Maria Anders</td>");
		out.println("<td>Germany</td>");
		out.println("</tr>");
		out.println("</table>");

		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
