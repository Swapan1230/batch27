package jrout.tutorial.jdbc;

import java.sql.*;

public class JDBCProgramPreparedStmt {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "jrout";
        String password = "jrout";
        Connection connection = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        String fname = "Ramzi";

        try {
            System.out.println("Loading the class...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("class is loaded...");


            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established...");

            psmt = connection.prepareStatement("select * from employees.employees where first_name = ?");
            psmt.setString(1,fname);

            rs = psmt.executeQuery();


            while(rs.next()){
                System.out.println(rs.getInt(1) +" "+ rs.getString(3) +
                        " "+ rs.getDate(2));

                //create and object and put it in the list...
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

    }
}
