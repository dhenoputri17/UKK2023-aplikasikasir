/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class koneksi {
public static Connection getConnection(){
    Connection conn = null;
    String url = "jdbc:mysql://localhost/d_dheno_d";
    String user = "root";
    String password = "";
    try{
        conn = DriverManager.getConnection(url,user,password);
    }catch(SQLException e){
        System.out.println(e);
    }
    return conn;
    
}
   
    public static void main(String[] args) {
       try{
           Connection c = koneksi.getConnection();
           System.out.println(String.format("menyambungkan database %s "+"berhasil.", c.getCatalog()));
       }catch(SQLException e){
           System.out.println(e);
       }
    }
    
}
