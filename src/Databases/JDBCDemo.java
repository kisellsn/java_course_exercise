package Databases;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1434;databaseName=demo;encrypt=true;trustServerCertificate=true;";
        int rowsAffected;
        try {
            Connection conn = DriverManager.getConnection(url, "sa", "123");
            Statement statement = conn.createStatement();

//            rowsAffected = statement.executeUpdate("insert into employee (name, dept, salary) values('Roma', 'Paper', 23890)");
//            rowsAffected = statement.executeUpdate("delete from employee WHERE name ='Roma'");
            rowsAffected = statement.executeUpdate("update employee set salary=100 WHERE name ='Rory'");
            ResultSet resultSet = statement.executeQuery("select * from employee");

            while(resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
            System.out.println("Rows affected: "+ rowsAffected);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

