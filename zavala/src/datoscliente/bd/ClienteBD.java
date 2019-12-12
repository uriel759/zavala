/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscliente.bd;


/**
 *
 * @author Francisco
 */
import datoscliente.datos.Cliente;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteBD extends conexion{
    
    public void guardar(Cliente mcliente) throws SQLException{
      try{
         PreparedStatement consulta;
         
            consulta = this.connection.prepareStatement("INSERT INTO  clientes (nombre, apellido, telefono) VALUES(?, ?, ? )");
            consulta.setString(1, mcliente.getNombre());
            consulta.setString(2, mcliente.getApellidos());
            consulta.setString(3, mcliente.getTelefono());
    consulta.executeUpdate();
       JOptionPane.showMessageDialog(null, "Registro Guardado!...");   
         
         
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
				
		String sql="DELETE FROM clientes WHERE idclientes= " + id;
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

      