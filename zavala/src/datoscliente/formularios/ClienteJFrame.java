/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscliente.formularios;


import datoscliente.bd.ClienteBD;
import javax.swing.JOptionPane;
import datoscliente.datos.Cliente;
import datosusuarios.forms.menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import static sun.util.calendar.CalendarUtils.mod;
        
        
       
/**
 *
 * @author Francisco
 */
public class ClienteJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form CamionJFrame
     */
   public ClienteJFrame() {
        initComponents();
        this.setSize(550, 550);
    }
   public class Inicio extends javax.swing.JFrame {

   }
PreparedStatement ps;
    ResultSet rs;
   
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttelefono = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtapellidos = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        LimpiarCajas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BotonCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtnombre = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N

        jScrollPane2.setViewportView(txttelefono);

        jScrollPane3.setViewportView(txtapellidos);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel3.setText("Telefono");

        BotonGuardar.setBackground(new java.awt.Color(162, 162, 240));
        BotonGuardar.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        LimpiarCajas.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        LimpiarCajas.setText("Limpiar");
        LimpiarCajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarCajasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel7.setText("Registro de CLIENTES");

        BotonCancelar.setBackground(new java.awt.Color(162, 162, 240));
        BotonCancelar.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        BotonCancelar.setText("Salir");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel5.setText("Apellidos");

        jScrollPane7.setViewportView(txtnombre);

        jButton1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Ventas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LimpiarCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LimpiarCajas))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarCajasActionPerformed
    txtnombre.setText(" ");    
    txtapellidos.setText(" ");
    txttelefono.setText(" ");
    
    //textpanelidruta.setText(" ");
    }//GEN-LAST:event_LimpiarCajasActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
           
           menu datos = new menu();
           datos.setVisible(true); 
           this.setVisible(false) ;
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private int validacion (){
        int i=1;
        if (txtnombre.getText().equals(""))
            i=0;
        if (txtapellidos.getText().equals(""))
            i=0;
        
            
        if(txttelefono.getText().equals(""))
            i=0;
        return i;
        
    }
   /* pool metodospool = new Pool();    

public void Actualizar(String Nombre, String Apellidos, String Id_cliente, String Telefono){

int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");

if(confirmar == JOptionPane.YES_OPTION){

    Connection conexion = null;
    
    try {
    
        conexion = metodospool.dataSource.getConnection();
        
        String Ssql = "UPDATE clientes SET Nombre=?, Apellido=?, Id_cliente=?, Telefono=? "
                    + "WHERE id_clienes=?";
        
        PreparedStatement prest = conexion.prepareStatement(Ssql);
        
        prest.setString(1, Nombre);
        prest.setString(2, Apellidos);
        prest.setString(3, Id_cliente);
        prest.setString(4, Telefono);
        
        
        if(prest.executeUpdate() > 0){
        
            JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", 
                                          JOptionPane.INFORMATION_MESSAGE);
            
        }else{
        
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.", "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
        
        }
        
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.\n"
                                          + "Error: "+e, "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
    
    }finally{
    
        if(conexion!=null){
        
            try {
                
                conexion.close();
            
            } catch (SQLException e) {
            
                JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión."
                                          + "Error: "+e, "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
                
            }
            
        }
           
    }
    

}

}*/

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed

        if(this.validacion()==0)
            JOptionPane.showMessageDialog(null, "Campos incompletos!...");
        
        else{
            
            try{Cliente mcliente = new Cliente();
                mcliente.setNombre(this.txtnombre.getText());
                mcliente.setApellidos(this.txtapellidos.getText());
              
                mcliente.setTelefono(this.txttelefono.getText());
                
                ClienteBD mclientes = new ClienteBD();
                mclientes.connect();
                try {
                    mclientes.guardar(mcliente);   
                    mclientes.Desconectar();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            catch(Exception ex){
                 JOptionPane.showMessageDialog(null, "");
            }   
            
            
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ConsultaClientes datos = new ConsultaClientes();
           datos.setVisible(true); 
           this.setVisible(false) ;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Ventas datos = new Ventas();
           datos.setVisible(true); 
           this.setVisible(false) ;          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton LimpiarCajas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane txtapellidos;
    private javax.swing.JTextPane txtnombre;
    private javax.swing.JTextPane txttelefono;
    // End of variables declaration//GEN-END:variables
}