/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sidekick
 */
public class Koneksi {

    private static Connection mysqlconfig;

    public static Connection KoneksiDB() throws SQLException {
        try {
            String databaseUser = "root";
            String databasePassword = "";
            String connLink = "jdbc:mysql://localhost:3306/mhs";
            
            mysqlconfig = DriverManager.getConnection(connLink, databaseUser, databasePassword);
        } catch (SQLException ex) {
            System.err.println("Error : " + ex.getMessage());
        }
        return mysqlconfig;
    }
}
