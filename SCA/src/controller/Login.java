/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import model.Usuario;
/**
 *
 * @author Rflpz
 */
public class Login {
    public Login(Usuario usuario){};
    public boolean  crearConeccion(){
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
        return true;
    }
}
