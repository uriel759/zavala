/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscliente.formularios;

import datoscliente.bd.ClienteBD;
import datoscliente.datos.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Angel
 */
public class ConsultaClientes extends javax.swing.JFrame {
DefaultTableModel modelo;
    /**
     * Creates new form ConsultaClientes
     */
    public ConsultaClientes() {
        initComponents();
        LimpiarTabla();
    }

  public void LimpiarTabla(){
       modelo = new DefaultTableModel ();
        modelo.addColumn("Id_cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");        
        modelo.addColumn("Telefono");        
        this.tabla.setModel(modelo);        
        this.CargarTabla(); 
  } 
  public void CargarTabla() {
   ClienteBD mclientes = new ClienteBD();
   mclientes.connect();
   List<Cliente> clientes=mclientes.consultar();
   for (Cliente mcliente: clientes){       
       modelo.addRow(new Object []{mcliente.getId_cliente(), mcliente.getNombre(), mcliente.getApellidos(), mcliente.getTelefono()});
   }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla);

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnconsultar.setText("Eliminar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btncancelar.setText("Salir");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnmodificar)
                        .addGap(27, 27, 27)
                        .addComponent(btnconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultar)
                    .addComponent(btnmodificar)
                    .addComponent(btncancelar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        int fila=tabla.getSelectedRow();
        //
        Cliente mcliente =new Cliente();
        mcliente.setId_cliente(String.valueOf(tabla.getValueAt(fila, 0)));
        //JOptionPane.showMessageDialog(this, "cliente" +mcliente.getId_cliente());
        mcliente.setNombre(String.valueOf(tabla.getValueAt(fila, 1)));
        mcliente.setApellidos(String.valueOf(tabla.getValueAt(fila, 2)));
        mcliente.setTelefono(String.valueOf(tabla.getValueAt(fila, 3)));
        //JOptionPane.showMessageDialog(this, "cliente " +mcliente.getId_cliente()+ " nombre "+mcliente.getNombre()+" apellidos "+ mcliente.getApellidos()+" telefono "+mcliente.getTelefono());
        ClienteBD mClientes=  new ClienteBD();
        mClientes.connect();
        boolean r=mClientes.modificar(mcliente);        
        if(r)
            JOptionPane.showMessageDialog(this,"Registro Modificado!");
        else
            JOptionPane.showMessageDialog(this,"Registro no Modificado!");
        this.LimpiarTabla();
         
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // TODO add your handling code here:
        int fila=tabla.getSelectedRow();
        //JOptionPane.showMessageDialog(this, "Fila " +fila);        
        String id=String.valueOf(tabla.getValueAt(fila, 0));
        ClienteBD mClientes=  new ClienteBD();
        mClientes.connect();
        boolean r=mClientes.eliminar(id);
        if(r)
            JOptionPane.showMessageDialog(this,"Registro Eliminado!");
        else
            JOptionPane.showMessageDialog(this,"Registro no Eliminado!");
        this.LimpiarTabla();
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
         ClienteJFrame datos = new ClienteJFrame();
           datos.setVisible(true); 
           this.setVisible(false) ;
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaClientes().setVisible(true);
            }
        });
         
    }
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
