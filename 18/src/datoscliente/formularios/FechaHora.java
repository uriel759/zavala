package datoscliente.formularios;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;


public class FechaHora extends javax.swing.JFrame {

    /**
     * Creates new form FechaHora
     */
    public FechaHora() {
        initComponents();
        Juanis.setText("**** LA QUIERO JUANIS ****");
        this.setLocationRelativeTo(null);
        
        //FECHA DEL SISTEMA
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd MMMMM YYYY");
        fecha.setText(formato.format(sistFecha));
        
        //HORA DEL SISTEMA
        Timer tiempo=new Timer(100, new FechaHora.horas());
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

        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Juanis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hora.setText("HORA");

        fecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fecha.setText("FECHA");

        Juanis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(Juanis, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(hora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(fecha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(fecha)
                .addGap(52, 52, 52)
                .addComponent(hora)
                .addGap(50, 50, 50)
                .addComponent(Juanis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FechaHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FechaHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FechaHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FechaHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FechaHora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Juanis;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    // End of variables declaration//GEN-END:variables
}
