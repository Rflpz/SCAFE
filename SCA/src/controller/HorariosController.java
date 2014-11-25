/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import  model.*;
import java.sql.*;
/**
 *
 * @author Rflpz
 */
public class HorariosController {
  private String query;
  private Connection con;
  private Statement stm;
  public HorariosController(){
      try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
  }
   public SQLException addHr(Horario hr){
        SQLException e = null;
        try{
            query = "INSERT INTO HORARIOS (`idHorario`, `horaInicio`, `horaTermino`) VALUES ('"+ hr.getIdHorario()+"', '"+hr.getHoraInicio()+"', '"+hr.getHoraTermino()+"')";
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
    public SQLException delHr(Horario hr){
        SQLException e = null;
        try{
            query = "DELETE FROM HORARIOS WHERE idHorario = " + hr.getIdHorario();
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
