/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuarios.forms;

import datoscamion.Datoscamion;
import datosusuarios.Usuarios;

import datoscamion.formularios.CamionJFrame;
import datoscliente.formularios.ClienteJFrame;
import datoscliente.formularios.FechaHora;
import datoscliente.formularios.Ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
/**
 *
 * @author Marko
 */
public class menu extends javax.swing.JFrame {

    Usuarios mod;
  
    //public static ;
    //public static ;

    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
          //FECHA DEL SISTEMA
         
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd MMMMM YYYY");
        fecha.setText(formato.format(sistFecha));
        
        //HORA DEL SISTEMA
        Timer tiempo=new Timer(100, new menu.horas());
        tiempo.start();
    
      
        }
    menu(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
       this.mod = mod;
       LBL.setText(mod.getNombre());
       LBL2.setText(mod.getNombre_tipo());
       if(mod.getIdTipo()== 1){
       
       }else if(mod.getIdTipo()== 2){
           Usuario.setVisible(false);
           
       }
       
Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd MMMMM YYYY");
        fecha.setText(formato.format(sistFecha));
        
        //HORA DEL SISTEMA
        Timer tiempo=new Timer(100, new menu.horas());
        tiempo.start();
        
    }
    class horas implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            Date sistHora=new Date();
            String pmAm="hh:mm:ss a";
            SimpleDateFormat format=new SimpleDateFormat(pmAm);
            Calendar hoy=Calendar.getInstance();
            hora.setText(String.format(format.format(sistHora),hoy));
            
        }       
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        Registro = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        LBL = new javax.swing.JLabel();
        LBL2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(229, 229, 152));

        Registro.setBackground(new java.awt.Color(193, 226, 117));
        Registro.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Registro.setText("REGISTRO DE CAMIONES");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        Ventas.setBackground(new java.awt.Color(193, 226, 117));
        Ventas.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Ventas.setText("VENTAS");
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(193, 226, 117));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jButton3.setText("CLIENTES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        LBL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        LBL2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        Usuario.setBackground(new java.awt.Color(193, 226, 117));
        Usuario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        Usuario.setText("REGISTRO DE USUARIOS");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(193, 226, 117));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel1.setText("TRANSPORTES ZAVALA");

        hora.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        hora.setText("HORA");

        fecha.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        fecha.setText("FECHA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Registro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(Usuario)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBL2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha))
                        .addGap(1, 1, 1)))
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        

            CamionJFrame frmreg = new CamionJFrame();
           frmreg.setVisible(true); 
           this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_RegistroActionPerformed
    
    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
Ventas datos = new Ventas();
           datos.setVisible(true); 
           this.setVisible(false) ;          /*if ( == null) {

            = new ();
           .setVisible(true);   // TODO add your handling code here:*/
    }//GEN-LAST:event_VentasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ClienteJFrame datos = new ClienteJFrame();
           datos.setVisible(true); 
           this.setVisible(false) ;  /*if ( == null) {

            = new ();
           .setVisible(true);    */    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
   

           registro frmReg = new registro();
            frmReg.setVisible(true);
            this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBL;
    private javax.swing.JLabel LBL2;
    private javax.swing.JButton Registro;
    private javax.swing.JButton Usuario;
    private javax.swing.JButton Ventas;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
