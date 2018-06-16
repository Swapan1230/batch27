package jrout.tutorial.jdbc;

import java.sql.*;

public class JDBCProgram {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "jrout";
        String password = "jrout";
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            System.out.println("Loading the class...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class is loaded...");


            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established...");

            stmt = connection.createStatement();

            rs = stmt.executeQuery("select * from employees.employees where first_name = 'Ramzi'");

            while(rs.next()){
                System.out.println(rs.getInt(1) +" "+ rs.getString(3) +
                        " "+ rs.getDate(2));

                //create and object and put it in the list...
            }
            /**
             * When you get muliple rows , for each row create a Employee Object and put it in the list..
             * and then call another method(printemployeeDetails(List<Employees> employees))
             * and this method should print each employee information...
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
            if(stmt != null){
                try {
                    stmt.close();
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

    }
}
