/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Koneksi {
    
    private static Connection conn;
    
    public static Connection getKoneksi() throws SQLException{
        if (conn == null) {
          MysqlDataSource dataSource = new MysqlDataSource();
          dataSource.setURL("jdbc:mysql://localhost:3306/sixerskostapp");
          dataSource.setUser("root");
          dataSource.setPassword("");
          conn = dataSource.getConnection();
        }
        
        return conn;
    }
}
