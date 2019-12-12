/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscliente.bd;

import datoscliente.datos.Cliente;
import datoscliente.datos.Venta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ventasBD extends conexion{
    
    public void guardar(Venta mventa) throws SQLException{
      try{
         PreparedStatement consulta;
         
            consulta = this.connection.prepareStatement("INSERT INTO  ventas (idcliente, asiento, idruta) VALUES(?, ?, ? )");
            consulta.setString(1, mventa.getId_cliente());
            consulta.setString(2, mventa.getAsiento());
            consulta.setString(3, mventa.getId_ruta());
            
         
         
         
         
             }catch(SQLException ex){
          
         throw new SQLException(ex);
      }
    }
    
    public List<Cliente> consultar() {
		//Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM clientes ORDER BY idclientes";
		
		List<Cliente> listaCliente= new ArrayList<Cliente>();
		
		try {			
			//super.connect();
			stm=connection.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Cliente c=new Cliente();
                                c.setId_cliente(rs.getString(1));
				c.setNombre(rs.getString(2));
				c.setApellidos(rs.getString(3));			
				c.setTelefono(rs.getString(4));
				listaCliente.add(c);
			}
			stm.close();
			rs.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error: método consultar");
			e.printStackTrace();
		}
		
		return listaCliente;
	}
    public boolean modificar(Cliente cliente) {
		
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE clientes SET nombre='"+cliente.getNombre()+"', apellido='"+cliente.getApellidos()+"', telefono='"+cliente.getTelefono()+"' WHERE idcliente='"+cliente.getId_cliente()+"'";
		try {
			//super.connect();
			stm=connection.createStatement();
			stm.execute(sql);
			actualizar=true;
                        this.Desconectar();
		} catch (SQLException e) {
			System.out.println("Error: método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
 
	
	public boolean eliminar(String  id) {
		//Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM  WHERE idclientes= " + id;
		try {
			//super.connect();
			stm=connection.createStatement();
			stm.execute(sql);
			eliminar=true;
                        this.Desconectar();
		} catch (SQLException e) {
			System.out.println("Error: método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}
 
}

      
