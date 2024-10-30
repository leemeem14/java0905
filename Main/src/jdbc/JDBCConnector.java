package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    private static Connection con;
    private static final String URL="jdbc:oracle:thin:@localhost:1521/xe";
    private static final String USER_NAME="c##leemeem14";
    private static final String PASSWORD="1234";



    public static Connection getConnection() {
        //JDBC DRIVER LOADING(OracleDriver 클래스의 객체생성)
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver successfully loaded!");
            //oracle DB연결
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            System.out.println("Oracle DB Connection successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found! Plz Install the Driver Or Reinstall.");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
        }
        return con;
    }
}
