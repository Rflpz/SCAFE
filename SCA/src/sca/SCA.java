/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sca;
import java.sql.*;



/**
 *
 * @author Rflpz
 */
public class SCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        SCAdministrador theApplet = new SCAdministrador();
        theApplet.init();   // invoke the applet's init() method
         theApplet.start();  // starts the applet
 
         // Create a window (JFrame) and make applet the content pane.
          javax.swing.JFrame window = new javax.swing.JFrame("Panel de administracion");
          window.setContentPane(theApplet);
          window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
          window.pack();          
          window.setVisible(true); 
    }   
    
}
