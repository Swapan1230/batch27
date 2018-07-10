package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloGuys
 */
@WebServlet({ "/getEmpDetails", "/getemp" })
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public EmployeeDetails() {
		System.out.println("EmployeeDetails.EmployeeDetails() :: Constructor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("EmployeeDetails.init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("EmployeeDetails.destroy()");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmployeeDetails.doGet()");
		
		response.setContentType("text/html");
		System.out.println("EmployeeDetails.doGet() request.getRemoteHost() "+ request.getRemoteHost());
		EmployeeDAOImpl empDao = new EmployeeDAOImpl();
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
	
		String lname = request.getParameter("lname");
		if(fname == null ){
			fname = "Thomas";
		}
		List<String[]> empDetails = empDao.getEmployee(fname,lname);
		out.println("<html>");
		out.println("<body>");

		out.println("<table>");
		
		out.println("<tr>");
		out.println("<th>EmployeeID</th>");
		out.println("<th>Name</th>");
		out.println("<th>DOB</th>");
		out.println("</tr>");
		
		for(String[] empDet: empDetails){
			out.println("<tr>");
			out.println("<td>"+empDet[0]+"</td>");
			out.println("<td>"+empDet[1]+"</td>");
			out.println("<td>"+empDet[2]+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
//	@Override
//	protected void service(HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
//			throws ServletException, IOException {
//		
//		response.setContentType("text/html");
//		
//		EmployeeDAO empDao = new EmployeeDAO();
//		PrintWriter out = response.getWriter();
//		String fname = request.getParameter("fname");
//		String lname = request.getParameter("lname");
//		if(fname == null ){
//			fname = "Thomas";
//		}
//		List<String[]> empDetails = empDao.getEmployee(fname,lname);
//		out.println("<html>");
//		out.println("<body>");
//
//		out.println("<table>");
//		
//		out.println("<tr>");
//		out.println("<th>EmployeeID</th>");
//		out.println("<th>Name</th>");
//		out.println("<th>DOB</th>");
//		out.println("</tr>");
//		
//		for(String[] empDet: empDetails){
//			out.println("<tr>");
//			out.println("<td>"+empDet[0]+"</td>");
//			out.println("<td>"+empDet[1]+"</td>");
//			out.println("<td>"+empDet[2]+"</td>");
//			out.println("</tr>");
//		}
//		out.println("</table>");
//		out.println("</body>");
//		out.println("</html>");
//	}

}
