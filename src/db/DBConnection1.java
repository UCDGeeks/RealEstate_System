/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sajeeka Mayomi
 */
public class DBConnection1 {

    private static DBConnection1 dbConnection;
    private Connection connection;

    private DBConnection1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/RealEstste", "root", "");
    }

    public static DBConnection1 getDBConnection() throws ClassNotFoundException, SQLException {
        if (dbConnection == null) {
            dbConnection = new DBConnection1();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }

}
