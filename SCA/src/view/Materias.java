/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import controller.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rflpz
 */
public class Materias extends javax.swing.JApplet {

    /**
     * Initializes the applet Materias
     */
    private DBModel modelo = new DBModel();
    private  MateriasController matController = new MateriasController();
    private Materia mat = new Materia();
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
            java.util.logging.Logger.getLogger(Materias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Materias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Materias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Materias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            Logger.getLogger(Materias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
private void loadDataToTable() throws SQLException{
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCA", "root", "");
    Statement stm = con.createStatement();  
    String query = "SELECT * FROM MATERIAS";
    ResultSet rs = stm.executeQuery(query);
    ResultSetMetaData rsMeta = rs.getMetaData();
    
    int col = rsMeta.getColumnCount();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    this.jTableMaterias.setModel(modeloTabla);
    
    for(int x = 1; x < col+1; x++){
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
    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarMateria = new javax.swing.JButton();
        btnBuscarMateria = new javax.swing.JButton();
        btnEliminarMateria = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdMateria = new javax.swing.JTextField();
        txtNombreMateria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdMateriaEditar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableMaterias);

        getContentPane().add(jScrollPane1);

        btnAgregarMateria.setText("Agregar");
        btnAgregarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMateriaMouseClicked(evt);
            }
        });
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        btnBuscarMateria.setText("Buscar");
        btnBuscarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMateriaMouseClicked(evt);
            }
        });

        btnEliminarMateria.setLabel("Eliminar");
        btnEliminarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMateriaMouseClicked(evt);
            }
        });

        txtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMateriaActionPerformed(evt);
            }
        });

        txtNombreMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMateriaActionPerformed(evt);
            }
        });

        jLabel1.setText("idMateria");

        jLabel2.setText("nombre");

        txtIdMateriaEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMateriaEditarMouseClicked(evt);
            }
        });

        jLabel4.setText("idMateria *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdMateriaEditar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdMateria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(btnBuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombreMateria, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(btnEliminarMateria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdMateriaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMateriaMouseClicked
        if(validarTxtAgregar()){
            try{
                this.matController.insertMat(this.txtIdMateria.getText(), this.txtNombreMateria.getText());
                loadDataToTable();
            }
            catch(SQLException e){ 
            }
        }
    }//GEN-LAST:event_btnAgregarMateriaMouseClicked
    private boolean validarTxtAgregar(){
        boolean status = true;
            if(txtIdMateria.getText() == null){
                status = false;
            }
            if(txtNombreMateria.getText() == null){
                status = false;
            }
        return status;
    }
    private void txtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMateriaActionPerformed

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnEliminarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMateriaMouseClicked
        if(validarTxtEdicion()){
            try{
                matController.delMat(this.txtIdMateriaEditar.getText());
                loadDataToTable();
            }
            catch(SQLException e){ 
            }
        }
    }//GEN-LAST:event_btnEliminarMateriaMouseClicked
    private boolean validarTxtEdicion(){
        boolean status = true;
        if(this.txtIdMateriaEditar == null){
            status = false;
        }
        return status;
    }
    private void txtIdMateriaEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMateriaEditarMouseClicked
        this.txtIdMateriaEditar.setText(null);
    }//GEN-LAST:event_txtIdMateriaEditarMouseClicked

    private void btnBuscarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMateriaMouseClicked
       if(!"".equals(this.txtIdMateria.getText())){
           mat = matController.serachByIdMat(this.txtIdMateria.getText());
           if(mat.getNombreMateria() != null){
               this.txtNombreMateria.setText(this.mat.getNombreMateria());
           }
           else{
               System.out.println("No existe el id");
           }
       }
       if(!"".equals(this.txtNombreMateria.getText())){
           mat = matController.serachByNameMat(this.txtNombreMateria.getText());
           if(mat.getNombreMateria() != null){
               this.txtIdMateria.setText(Integer.toString(this.mat.getIdMateria()));
           }
           else{
               System.out.println("No existe el nombre");
           }
       }
    }//GEN-LAST:event_btnBuscarMateriaMouseClicked

    private void txtNombreMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnBuscarMateria;
    private javax.swing.JButton btnEliminarMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtIdMateriaEditar;
    private javax.swing.JTextField txtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
