/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscliente.datos;

/**
 *
 * @author Francisco
 */
public class Cliente {
    private String Nombre;
    private String Apellidos;
    private String Telefono;
    private String Id_cliente;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    public String getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(String Id_cliente) {
        this.Id_cliente = Id_cliente;
    }    

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public Cliente() {
        
    }
    }

   
