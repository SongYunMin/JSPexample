package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloWorld {
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException {
        String a = "com.mysql.jdbc.Driver";
        String db = "jdbc:mysql:// localhost:3306/";

        String name = "test";
        String user = "root";
        String pass = "";


        // Init
        Class.forName(a);
        Connection con = DriverManager.getConnection(db + name, user, pass);



        return con;
    }
}
