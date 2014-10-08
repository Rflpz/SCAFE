/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import model.Usuario;
/**
 *
 * @author Rflpz
 */
public class DBModel {
    public DBModel(){}
    
    public Usuario buscarUsuario(String host, String username, String password, Usuario fUsuario) throws SQLException{
        Usuario res = new Usuario();
        String idUsuario = Integer.toString(fUsuario.getIdUsuario());
        String contrasena = fUsuario.getContrasena();
        String query = "SELECT * FROM USUARIOS WHERE idUsuario = " + idUsuario + " and contrasena = '" + contrasena + "'";
        System.out.println(query);
        Connection con = DriverManager.getConnection(host, username, password);
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(query);
        
        res = cargarInfoUsr(rs, res);
        return res;
    }
    private Usuario cargarInfoUsr(ResultSet rs,Usuario usr) throws SQLException{
        while (rs.next()) {
                    usr.setNombre(rs.getString("nombre"));
                    usr.setApellidoP(rs.getString("apellidoP"));
                    usr.setApellidoM(rs.getString("apellidoM"));
                    usr.setCargo(rs.getString("cargo"));
                    usr.setCorreo(rs.getString("correo"));
                    usr.setFotografia(rs.getBlob("fotografia"));
                    usr.setPrivilegios(rs.getInt("privilegios"));
                    usr.setTipo(rs.getInt("tipo"));
                    usr.setContrasena(rs.getString("contrasena"));
                    usr.setIdUsuario(rs.getInt("idUsuario"));
                } 
        return usr;
    }
    
}
