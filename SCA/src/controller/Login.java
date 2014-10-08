/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import model.Usuario;
import model.DBModel;
/**
 *
 * @author Rflpz
 */
public class Login {
    private DBModel modelo = new DBModel();
    public Login(){};
    public boolean existeUsuario(Usuario usr) throws SQLException{
        usr = modelo.buscarUsuario("jdbc:mysql://localhost:3306/SCA", "root", "", usr);
        System.out.println(usr.toString());
        if(usr.getNombre() != null){
            return true;
        }
        else{
            return false;
        }
    }
}
