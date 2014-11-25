/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import java.util.*;
import model.*;
/**
 *
 * @author Rflpz
 */
public class HMPController {
    private String query;
    private Connection con;
    private Statement stm;
    public  List<String> listIdUsuario = new ArrayList<String>();
    public  List<String> listIdMateria = new ArrayList<String>();
    public  List<String> listIdHorario = new ArrayList<String>();
    public  List<String> listIdGrupo = new ArrayList<String>();
    public  List<String> listIdAula = new ArrayList<String>();
    public HMPController(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public SQLException addHMP(HMP hmp){
        SQLException e = null;
        try{
            System.out.println("Entra agregar hmp");
            query = "INSERT INTO HMP (`idUsuario`, `idMateria`, `idHorario`, `idGrupo`, `idAula`, `dia`) VALUES ('"+hmp.getIdUsuario()+"', '"+hmp.getIdMateria()+"', '"+hmp.getIdHorario()+"', '"+hmp.getIdGrupo()+"', '"+hmp.getIdAula()+"', '"+hmp.getDia()+"')";
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
    public SQLException delHMP(HMP hmp){
        SQLException e = null;
        try{
            query = "DELETE FROM HMP WHERE idHMP ="+ hmp.getIdHMP();
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
    public void LoadList(){
        try{
            query = "SELECT * FROM USUARIOS";
            System.out.println(query);
            stm = con.createStatement();
            ResultSet result = stm.executeQuery(query);
            while(result.next()) {
                String data = Integer.toString(result.getInt("idUsuario"));
                this.listIdUsuario.add(data);
            }
            
            query = "SELECT * FROM MATERIAS";
            result = stm.executeQuery(query);
            while(result.next()) {
                String data = Integer.toString(result.getInt("idMateria"));
                this.listIdMateria.add(data);
            }
            
            query = "SELECT * FROM HORARIOS";
            result = stm.executeQuery(query);
            while(result.next()) {
                String data = Integer.toString(result.getInt("idHorario"));
                this.listIdHorario.add(data);
            }
            
            query = "SELECT * FROM GRUPOS";
            result = stm.executeQuery(query);
            while(result.next()) {
                String data = Integer.toString(result.getInt("idGrupo"));
                this.listIdGrupo.add(data);
            }
            
            
            query = "SELECT * FROM AULAS";
            result = stm.executeQuery(query);
            while(result.next()) {
                String data = Integer.toString(result.getInt("idAula"));
                this.listIdAula.add(data);
            }
            
            }
            catch(SQLException exc){
                System.out.println(exc.getMessage());
            }
    }
}
