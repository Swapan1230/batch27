package jrout.tutorial.servlet.dao;

import java.util.List;

public interface IEmployeeDAO {
	public List<String[]> getEmployee(String fname,String lname);
	
	public String[] getEmployeeWithID(int empId);

}
