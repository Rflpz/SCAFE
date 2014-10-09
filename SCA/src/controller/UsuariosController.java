/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.*;
import java.sql.*;
/**
 *
 * @author Rflpz
 */
public class UsuariosController {
    private String query;
    private Connection con;
    private Statement stm;
    public UsuariosController(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
        }
        catch(SQLException e){
        }
    }
    //INSERT INTO `SCA`.`Usuarios` (`idUsuario`, `nombre`, `apellidoP`, `apellidoM`, `contrasena`, `tipo`, `cargo`, `privilegios`, `correo`) VALUES ('110', 'test', 'test', 'test', 'test', '3', 'test', '2', 'test@ucol.mx');
    public SQLException insertUsrById(Usuario usr){
        SQLException e = null;
        try{
            query = "INSERT INTO `SCA`.`Usuarios` (`idUsuario`, `nombre`, `apellidoP`, `apellidoM`, `contrasena`, `tipo`, `cargo`, `privilegios`, `correo`,`fotografia`) VALUES ('"+usr.getIdUsuario()+"', '"+usr.getNombre()+"', '"+usr.getApellidoP()+"', '"+usr.getApellidoM()+"', '"+usr.getContrasena()+"', '"+usr.getTipo()+"', '"+usr.getCargo()+"', '"+usr.getprivilegios()+"', '"+usr.getCorreo()+"', '"+usr.getFotografia()+"')";
            System.out.println(query);
            stm = con.createStatement();
            stm.execute(query);
            }
            catch(SQLException exc){
                e = exc;
                System.out.println(e.getMessage());
            }
        return e;
    }
    public SQLException delUsrById(Usuario usr){
        SQLException e = null;
        try{
            query = "DELETE FROM USUARIOS WHERE idUsuario = " + usr.getIdUsuario();
            System.out.println(query);
            stm = con.createStatement();
            stm.execute(query);
            }
            catch(SQLException exc){
                e = exc;
            }
        return e;
    }
    public Usuario searchUsrById(Usuario usr){
        SQLException e = null;
        try{
            query = "SELECT * FROM USUARIOS WHERE idUsuario = " + usr.getIdUsuario();
            System.out.println(query);
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                usr.setApellidoM(rs.getString("apellidoM"));
                usr.setApellidoP(rs.getString("apellidoP"));
                usr.setCargo(rs.getString("cargo"));
                usr.setContrasena(rs.getString("contrasena"));
                usr.setCorreo(rs.getString("correo"));
                usr.setFotografia(rs.getBlob("fotografia"));
                usr.setIdUsuario(rs.getInt("idUsuario"));
                usr.setNombre(rs.getString("nombre"));
                usr.setPrivilegios(rs.getInt("privilegios"));
                usr.setTipo(rs.getInt("tipo"));
            }
        }
            catch(SQLException exc){
                e = exc;
            }
        return usr;
    }
    //UPDATE USUARIOS SET `idUsuario`=999,`nombre`="TEST",`apellidoP`="TEST",`apellidoM`="TEST",`contrasena`="TEST",`tipo`=2,`cargo`="TEST",`privilegios`=3,`correo`="TEST",`fotografia`= null WHERE idUsuario = 1
        public SQLException updUsrById(Usuario usr){
        SQLException e = null;
        try{
            query = "UPDATE USUARIOS SET idUsuario="+usr.getIdUsuario()+" ,nombre='"+usr.getNombre()+"' ,apellidoP='"+usr.getApellidoP()+"' ,apellidoM='"+usr.getApellidoM()+"' ,contrasena='"+usr.getContrasena()+"' ,tipo="+usr.getTipo()+" ,cargo='"+usr.getCargo()+"' ,privilegios= "+usr.getprivilegios()+" ,correo='"+usr.getCorreo()+"' ,fotografia= "+usr.getFotografia()+"  WHERE idUsuario = " + usr.getIdUsuario();
            System.out.println(query);
            stm = con.createStatement();
            stm.execute(query);
            }
            catch(SQLException exc){
                e = exc;
            }
        return e;
    }
}
