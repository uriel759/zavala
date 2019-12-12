package datoscliente.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco
 */
public class conexion {
     
    private String url = "jdbc:mysql://localhost:3306/zavala";
    private String user = "root";
    private String pass = "admin";
    protected  Connection connection = null;

  public void connect(){

        System.out.println("Conectando…");
        try{
        connection = DriverManager.getConnection(url, user,pass);
        System.out.println("Conectado!!");

        }catch(SQLException e){
        System.out.println(e.getMessage());

        }
   }
   public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(datoscamion.bd.conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return connection ;  
    }
  public void Desconectar() throws SQLException{
      connection.close();
  }
}
