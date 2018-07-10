package jrout.tutorial.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.servlet.dao.IEmployeeDAO;
import jrout.tutorial.servlet.dao.impl.EmployeeDAOImpl;

/**
 * Servlet implementation class HelloGuys
 */
@WebServlet({ "/getEmpDetailsController"})
public class EmployeeDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public EmployeeDetailsController() {
		System.out.println("EmployeeDetailsController.EmployeeDetails() :: Constructor");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("EmployeeDetailsController.init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("EmployeeDetailsController.destroy()");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmployeeDetailsController.doGet()");
		
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		String requestType = request.getParameter("requestType");
		RequestDispatcher rd = null;
		if("EmpList".equals(requestType)) {
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			
			List<String[]> empDetails = empDao.getEmployee(fname,lname);
			request.setAttribute("empDetailList",empDetails);
			rd = request.getRequestDispatcher("employeeDetailsView.jsp");
		}else {
			int empId = Integer.parseInt(request.getParameter("empId"));

			String[] employDetails = empDao.getEmployeeWithID(empId);
			request.setAttribute("empDetails", employDetails);
			rd = request.getRequestDispatcher("employeeDetails.jsp");
		}
		
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
