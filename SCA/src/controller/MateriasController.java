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
public class MateriasController {
    private String query;
    private Connection con;
    private Statement stm;
    public MateriasController(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
        }
        catch(SQLException e){
        }
    }
    
    public SQLException insertMat(String idMateria, String nombre){
        SQLException e = null;
        try{
            query = "INSERT Materias (idMateria, nombre) VALUES ('"+ idMateria +"','"+ nombre +"')";
            System.out.println(query);
            stm = con.createStatement();
            stm.execute(query);
            }
            catch(SQLException exc){
                e = exc;
            }
        return e;
    }
    public SQLException delMat(String idMateria){
        SQLException e = null;
        try{
            query = "DELETE FROM MATERIAS WHERE idMateria = " + idMateria;
            System.out.println(query);
            stm = con.createStatement();
            stm.execute(query);
            }
            catch(SQLException exc){
                e = exc;
            }
        return e;
    }
    public Materia serachByIdMat(String idMateria){
        Materia mat = new Materia();
        try{
            query = "SELECT * FROM MATERIAS WHERE idMateria ="+ idMateria;
            System.out.println(query);
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
            }
        }
        catch(SQLException e){
            
        }
        return mat;
    }
    public Materia serachByNameMat(String nombre){
        Materia mat = new Materia();
        try{
            query = "SELECT * FROM MATERIAS WHERE nombre = '"+ nombre+"'";
            System.out.println(query);
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
            }
        }
        catch(SQLException e){
            
        }
        return mat;
    }
    
}
