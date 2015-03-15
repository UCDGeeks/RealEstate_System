/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sajeeka Mayomi
 */
public class db_connect {

    private static db_connect dbConnection;
    private Connection connection;

    private db_connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/RealEstste", "root", "");
    }

    public static db_connect getDBConnection() throws ClassNotFoundException, SQLException {
        if (dbConnection == null) {
            dbConnection = new db_connect();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }

}
