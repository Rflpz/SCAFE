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
public class GrupoController {
    private String query;
    private Connection con;
    private Statement stm;
    public GrupoController(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
        }
        catch(SQLException e){
        }
    }
    
    public SQLException insertGrpById(Grupo grp){
        SQLException e = null;
        try{
            query = "INSERT INTO GRUPOS (`idGrupo`, `nombreGrupo`, `grado`, `carrera`) VALUES ('"+grp.getIdGrupo()+"', '"+grp.getNombre()+"', '"+grp.getGrado()+"', '"+grp.getCarrera()+"')";
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
    public SQLException delGrpById(Grupo grp){
        SQLException e = null;
        try{
            query = "DELETE FROM GRUPOS WHERE idGrupo = " + grp.getIdGrupo();
            System.out.println(query);
            stm = con.createStatement();
            stm.execute(query);
            }
            catch(SQLException exc){
                e = exc;
            }
        return e;
    }
    public Grupo searchGrpById(Grupo grp){
        SQLException e = null;
        try{
            query = "SELECT * FROM GRUPOS WHERE idGrupo = " + grp.getIdGrupo();
            System.out.println(query);
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                grp.setIdGrupo(rs.getInt("idGrupo"));
                grp.setNombreGrupo(rs.getString("nombreGrupo"));
                grp.setGrado(rs.getString("grado"));
                grp.setCarrera(rs.getString("Carrera"));
            }
        }
            catch(SQLException exc){
                e = exc;
            }
        return grp;
    }
    //UPDATE USUARIOS SET `idUsuario`=999,`nombre`="TEST",`apellidoP`="TEST",`apellidoM`="TEST",`contrasena`="TEST",`tipo`=2,`cargo`="TEST",`privilegios`=3,`correo`="TEST",`fotografia`= null WHERE idUsuario = 1
        public SQLException updGrpById(Grupo grp){
        SQLException e = null;
        try{
            query = "UPDATE GRUPOS SET idGrupo="+grp.getIdGrupo()+" ,nombreGrupo='"+grp.getNombre()+"' ,grado='"+grp.getGrado()+"' ,carrera='"+grp.getCarrera()+"'  WHERE idGrupo = " + grp.getIdGrupo();
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
