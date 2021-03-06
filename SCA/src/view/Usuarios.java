/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Rflpz
 */
import java.sql.*;
import model.*;
import controller.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Usuarios extends javax.swing.JApplet {

    
    /**
     * Initializes the applet Usuarios
     */
    private DBModel modelo = new DBModel();
    private  UsuariosController usrController = new UsuariosController();
    @Override
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            loadDataToTable();
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarUsuario = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnActualizarUsuario = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JTextField();
        txtCargoUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCorreoUsuario = new javax.swing.JTextField();
        txtPrivilegiosUsuario = new javax.swing.JTextField();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableUsuarios);

        getContentPane().add(jScrollPane1);

        btnAgregarUsuario.setText("Agregar");
        btnAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarUsuarioMouseClicked(evt);
            }
        });

        btnBuscarUsuario.setLabel("Buscar");
        btnBuscarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarUsuarioMouseClicked(evt);
            }
        });

        btnEliminarUsuario.setLabel("Eliminar");
        btnEliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarUsuarioMouseClicked(evt);
            }
        });

        btnActualizarUsuario.setText("Actualizar");
        btnActualizarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarUsuarioMouseClicked(evt);
            }
        });

        txtNombreUsuario.setText("test");
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        txtApellidoP.setText("test");
        txtApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPActionPerformed(evt);
            }
        });

        jLabel4.setText("Paterno");

        jLabel6.setText("Materno");

        txtApellidoM.setText("test");
        txtApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos");

        txtContrasena.setText("test");
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });

        jLabel7.setText("Contraseña");

        jLabel5.setText("ID Usuario");

        txtIdUsuario.setText("1");
        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo");

        txtTipoUsuario.setText("1");
        txtTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoUsuarioActionPerformed(evt);
            }
        });

        txtCargoUsuario.setText("test");
        txtCargoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoUsuarioActionPerformed(evt);
            }
        });

        jLabel9.setText("Cargo");

        jLabel12.setText("Privilegios");

        jLabel13.setText("Correo");

        txtCorreoUsuario.setText("text@ucol.mx");
        txtCorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUsuarioActionPerformed(evt);
            }
        });

        txtPrivilegiosUsuario.setText("3");
        txtPrivilegiosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrivilegiosUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena)
                            .addComponent(txtApellidoP)
                            .addComponent(txtApellidoM)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdUsuario)
                            .addComponent(txtNombreUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCargoUsuario)
                            .addComponent(txtTipoUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreoUsuario)
                            .addComponent(txtPrivilegiosUsuario))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPrivilegiosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    private void loadDataToTable()throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
    Statement stm = con.createStatement();  
    String query = "SELECT * FROM USUARIOS";
    ResultSet rs = stm.executeQuery(query);
    ResultSetMetaData rsMeta = rs.getMetaData();
    
    int col = rsMeta.getColumnCount();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    this.jTableUsuarios.setModel(modeloTabla);
    
    for(int x = 1; x < col; x++){
        modeloTabla.addColumn(rsMeta.getColumnLabel(x));
    }
    
    while(rs.next()){
        Object[] fila = new Object[col];
        
        for(int y = 0; y < col; y++){
            fila[y] = rs.getObject(y+1);
        }
        modeloTabla.addRow(fila);
    }
    }
    private void txtCargoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoUsuarioActionPerformed

    private void txtTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoUsuarioActionPerformed

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMActionPerformed

    private void txtApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtCorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoUsuarioActionPerformed

    private void txtPrivilegiosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrivilegiosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrivilegiosUsuarioActionPerformed

    private void btnAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioMouseClicked
        
        Usuario gUsuario = new Usuario();
        gUsuario = setDataToUsr(gUsuario);
        try{
                this.usrController.insertUsrById(gUsuario);
                loadDataToTable();
            }
            catch(SQLException e){ 
            }
    }//GEN-LAST:event_btnAgregarUsuarioMouseClicked

    private void btnEliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioMouseClicked
        Usuario gUsuario = new Usuario();
        gUsuario.setIdUsuario(Integer.parseInt(this.txtIdUsuario.getText()));
        try{
                this.usrController.delUsrById(gUsuario);
                loadDataToTable();
            }
            catch(SQLException e){ 
            }
    }//GEN-LAST:event_btnEliminarUsuarioMouseClicked

    private void btnBuscarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioMouseClicked
        Usuario gUsuario = new Usuario();
        gUsuario.setIdUsuario(Integer.parseInt(this.txtIdUsuario.getText()));
        gUsuario = this.usrController.searchUsrById(gUsuario);
        setInfoViewFromUsr(gUsuario);
    }//GEN-LAST:event_btnBuscarUsuarioMouseClicked

    private void btnActualizarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioMouseClicked
        Usuario gUsuario = new Usuario();
        gUsuario = setDataToUsr(gUsuario);
        try{
                this.usrController.updUsrById(gUsuario);
                loadDataToTable();
            }
            catch(SQLException e){ 
            }
    }//GEN-LAST:event_btnActualizarUsuarioMouseClicked
    private Usuario setDataToUsr(Usuario usr){
        usr.setIdUsuario(Integer.parseInt(this.txtIdUsuario.getText()));
        usr.setNombre(this.txtNombreUsuario.getText());
        usr.setApellidoP(this.txtApellidoP.getText());
        usr.setApellidoM(this.txtApellidoM.getText());
        usr.setCargo(this.txtCargoUsuario.getText());
        usr.setContrasena(this.txtContrasena.getText());
        usr.setPrivilegios(Integer.parseInt(this.txtPrivilegiosUsuario.getText()));
        usr.setTipo(Integer.parseInt(this.txtTipoUsuario.getText()));
        usr.setCorreo(this.txtCorreoUsuario.getText());
        usr.setFotografia(null);
        return usr;
    }
    private void setInfoViewFromUsr(Usuario usr){
        this.txtApellidoM.setText(usr.getApellidoM());
        this.txtApellidoP.setText(usr.getApellidoP());
        this.txtCargoUsuario.setText(usr.getCargo());
        this.txtContrasena.setText(usr.getContrasena());
        this.txtCorreoUsuario.setText(usr.getCorreo());
        this.txtIdUsuario.setText(Integer.toString(usr.getIdUsuario()));
        this.txtNombreUsuario.setText(usr.getNombre());
        this.txtPrivilegiosUsuario.setText(Integer.toString(usr.getprivilegios()));
        this.txtTipoUsuario.setText(Integer.toString(usr.getTipo()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCargoUsuario;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreoUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPrivilegiosUsuario;
    private javax.swing.JTextField txtTipoUsuario;
    // End of variables declaration//GEN-END:variables
}
