package JBDC.DAY01;

import java.sql.*;

public class JBDC_DAY01 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ec2-54-147-179-30.compute-1.amazonaws.com:1521:XE","hr","hr");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from employees");

        resultSet.next();
        resultSet.next();
        resultSet.next();
        resultSet.next();
        resultSet.next();
        for (int i = 1; i <12 ; i++) {
            System.out.println(resultSet.getString(i));
        }
    }

}
