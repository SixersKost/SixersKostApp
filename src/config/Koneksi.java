/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Koneksi {
    
    public Connection conn;
    
    public  Connection getKoneksi() throws SQLException{
        try {
            conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_kostsixersapp","root","");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return conn;
    }
}
