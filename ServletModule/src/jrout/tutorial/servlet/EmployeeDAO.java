package jrout.tutorial.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public List<String[]> getEmployee(String fname,String lname){
		List<String[]> empDetails = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "jrout";
        String password = "jrout";
        Connection connection = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            System.out.println("Loading the class...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class is loaded...");


            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established...");

            psmt = connection.prepareStatement("select * from employees.employees where first_name = ? and last_name = ?");
            psmt.setString(1,fname);
            psmt.setString(2,lname);
            
            rs = psmt.executeQuery();
            while(rs.next()){
            		empDetails.add(new String[]{String.valueOf(rs.getInt(1)),rs.getString(3),String.valueOf(rs.getDate(2))});
            }
            /**
             * Try query using dates...
             */

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println("Connection Closed...");
            }
            if(psmt != null){
                try {
                    psmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Program is complete..");
        return empDetails;
	}
}
