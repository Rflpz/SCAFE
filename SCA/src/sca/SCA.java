/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca;
import java.sql.*;
import model.*;


/**
 *
 * @author Rflpz
 */
public class SCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        /*Login log = new Login();
        Usuario test = new Usuario();
        test.setIdUsuario(9);
        test.setContrasena("Aliquam LLC");
        if( log.existeUsuario(test)){
            System.out.println("Existe");
        }
        else{
            System.out.println("No existe");
        }*/
        DBModel dataModel = new DBModel ();
        Materia mt = new Materia();
        mt.setIdMateria(674);
        mt.setNombre("PD");
        String result = dataModel.addClass("jdbc:mysql://localhost:3306/SCA", "root", "", mt);
        if(result != "done" ){
            System.out.println("Materia no agregada");
        }
        else{
            System.out.println("Materia agregada");
        }
    }   
    
}
