/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import model.Aula;
import model.Usuario;
import model.DBModel;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import model.HMP;
import model.Horario;
/**
 *
 * @author Rflpz
 */
public class LoginController {
    private DBModel modelo = new DBModel();
    private Connection con;
    private Statement stm;
    public String quePasa;
    public Usuario usr;
    public LoginController(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
        }
        catch(SQLException e){
        }
        this.quePasa = "No hay horas para asistencia";
    }; 
    public boolean verificarUsuario(Usuario usr){
        usr  = searchUsrById(usr);
        this.usr = usr;
        System.out.println(usr.getApellidoM());
        if((usr.getApellidoM() != null ) && (usr.getApellidoP() != null)){
            return true;
        }
        else{
            System.out.println("Entra");
            return false;
        }   
    }
    public void generarAsistencia(Usuario usr){
        DateFormat hora = new SimpleDateFormat("HH");
        DateFormat horaRegistrar = new SimpleDateFormat("HH:mm:ss");
         DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Calendar diaNumeroSemana = Calendar.getInstance();
        //diaNumeroSemana.get(Calendar.DAY_OF_WEEK)
        //hora.format(date)
        System.out.println(diaNumeroSemana.get(Calendar.DAY_OF_WEEK));
        String query;
        try{
            query = "SELECT * FROM HMP WHERE idUsuario = " + usr.getIdUsuario() + " AND dia = " + diaNumeroSemana.get(Calendar.DAY_OF_WEEK) ;
            System.out.println(query);
            stm = con.createStatement();
            HMP horario = new HMP();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                horario.setDia(rs.getInt("dia"));
                horario.setIdHorario(rs.getInt("idHorario"));
                horario.setIdHMP(rs.getInt("idHMP"));
            }
            System.out.println(horario.getIdHMP());
            query = "SELECT * FROM HORARIOS WHERE idHorario = " + horario.getIdHorario();
            System.out.println(query);
            rs = stm.executeQuery(query);
            Horario h = new Horario();
            while(rs.next()){
                h.setHoraInicio(Integer.toString(rs.getInt("horaInicio")));
                h.setHoraTermino(Integer.toString(rs.getInt("horaTermino")));
            }
            System.out.println(h.getHoraTermino());
            int horaSistema = Integer.parseInt(hora.format(date));
            int horaAvalibleUno = Integer.parseInt(h.getHoraInicio())-1;
            int horaAvalibleDos = Integer.parseInt(h.getHoraInicio());
            int horaAvalibleTres = Integer.parseInt(h.getHoraInicio())+1;
            System.out.println("Hora : " + horaAvalibleUno + " hora2 : " +horaAvalibleDos + " hora3 :" + horaAvalibleTres);
            
            if(horaSistema == horaAvalibleUno || horaSistema == horaAvalibleDos || horaSistema == horaAvalibleTres){
                query  = "INSERT INTO Asistencias (idHMP, fecha, hora) VALUES " + "("+horario.getIdHMP()+", '"+fecha.format(date)+"', '"+horaRegistrar.format(date)+"')";
                stm.execute(query);
                this.quePasa = "Se a tomado su asistencia";
                System.out.println(query);
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    private Usuario searchUsrById(Usuario usr){
        String query = null;
        try{
            query = "SELECT * FROM Usuarios WHERE idUsuario = " + usr.getIdUsuario() + " AND contrasena = '"+ usr.getContrasena() + "'";
            System.out.println(query);
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                usr.setNombre(rs.getString("nombre"));
                usr.setApellidoP(rs.getString("apellidoP"));
                usr.setApellidoM(rs.getString("apellidoM"));
            }
        }
            catch(SQLException e){
                e = e;
            }
        return usr;
    }
}
