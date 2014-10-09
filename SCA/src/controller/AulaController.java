/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import model.*;
/**
 *
 * @author Rflpz
 */
public class AulaController {
    private String query;
    private Connection con;
    private Statement stm;
    public AulaController(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
        }
        catch(SQLException e){
        }
    }
    
    public SQLException insertAulById(Aula aul){
        SQLException e = null;
        try{
            query = "INSERT INTO AULAS (`idAula`, `nombre`, `tipo`) VALUES ('"+aul.getIdAula()+"', '"+aul.getNombre()+"', '"+aul.getTipo()+"')";
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
    public SQLException delAulById(Aula aul){
        SQLException e = null;
        try{
            query = "DELETE FROM AULAS WHERE idAula = " + aul.getIdAula();
            System.out.println(query);
            stm = con.createStatement();
            stm.execute(query);
            }
            catch(SQLException exc){
                e = exc;
            }
        return e;
    }
    public Aula searchAulById(Aula aul){
        SQLException e = null;
        try{
            query = "SELECT * FROM AULAS WHERE idAula = " + aul.getIdAula();
            System.out.println(query);
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                aul.setIdAula(rs.getInt("idAula"));
                aul.setNombre(rs.getString("nombre"));
                aul.setTipo(rs.getString("tipo"));
            }
        }
            catch(SQLException exc){
                e = exc;
            }
        return aul;
    }
        public SQLException updAulById(Aula aul){
        SQLException e = null;
        try{
            query = "UPDATE AULAS SET idAula="+aul.getIdAula()+" ,nombre='"+aul.getNombre()+"' ,tipo='"+aul.getTipo()+"'  WHERE idAula = " + aul.getIdAula();
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
