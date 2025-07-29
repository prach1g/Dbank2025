package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyClient {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //step1  ---- connect to the DB server
        //1.  load the Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. create a JDBC URL
        String jdbcUrl = "jdbc:mysql://localhost:3306/alpha";
        String uname = "root";
        String pwd= "mysql";

        //3. call the getCOnnection method
        Connection con =  DriverManager.getConnection(jdbcUrl,uname,pwd);

        System.out.println("Connection Established .."+con);


        String query = "insert into book values(12,'enter the dragon')";

       // Statement stmt = con.createStatement();
        //stmt.executeUpdate(query);


    }

}
