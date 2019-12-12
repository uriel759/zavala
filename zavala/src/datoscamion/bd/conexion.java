package datoscamion.bd;

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
    protected  Connection con = null;

  public void connect(){

        System.out.println("Conectando…");
        try{
        con = DriverManager.getConnection(url, user,pass);
        System.out.println("Conectado!!");

        }catch(SQLException e){
        System.out.println(e.getMessage());

        }
   }
  
  public void Desconectar() throws SQLException{
      con.close();
  }
  public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }
}
