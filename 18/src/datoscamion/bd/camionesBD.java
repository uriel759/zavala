/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscamion.bd;


/**
 *
 * @author Francisco
 */
import datoscamion.datos.camion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class camionesBD extends conexion{
    public void guardar(camion mcamion) throws SQLException{
      try{
         PreparedStatement consulta;
         
            consulta = this.con.prepareStatement("INSERT INTO  camiones  (origen, destino, hora_salida, precio) VALUES(?, ?, ?, ?)");
            consulta.setString(1, mcamion.getOrigen());
            consulta.setString(2, mcamion.getDestino());
            consulta.setString(3, mcamion.getHora());
            consulta.setFloat(4, mcamion.getPrecio());
         
         consulta.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Registro guardado!...");
         
         
      }catch(SQLException ex){
          
         throw new SQLException(ex);
      }
   }
}
