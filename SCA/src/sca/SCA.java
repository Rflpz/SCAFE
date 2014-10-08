/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca;
import java.sql.*;
import model.*;
import controller.Login;

/**
 *
 * @author Rflpz
 */
public class SCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        Login log = new Login();
        Usuario test = new Usuario();
        test.setIdUsuario(1);
        test.setContrasena("prueba");
        if( log.existeUsuario(test)){
            System.out.println("Existe");
        }
        else{
            System.out.println("No existe");
        }
    }   
    
}
