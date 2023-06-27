package JBDC.DAY01;

import java.sql.*;

public class JDBC_02 {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@ec2-54-147-179-30.compute-1.amazonaws.com:1521:XE";
        String userName = "hr";
        String passWord = "hr";

        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url,userName,passWord);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees");

            System.out.println("Connection established");
        }catch (SQLException s){
            s.printStackTrace();
            System.out.println("Connection Failed");
        }



    }


}
