/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca;
import java.sql.*;
import model.*;

/**
 *
 * @author Rflpz
 */
public class SCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario test = new Usuario();
        try{
            String host = "jdbc:mysql://localhost:3306/SCA";
            String username = "root";
            String password = "";
                Connection con = DriverManager.getConnection( host, username, password );
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT nombre, apellidoP, apellidoM FROM USUARIOS");
                while (rs.next()) {
                    test.setNombre(rs.getString("nombre"));
                    test.setApellidoP(rs.getString("apellidoP"));
                    test.setApellidoM(rs.getString("apellidoM"));
                    System.out.println(test.toString());
                }                
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }
    
}