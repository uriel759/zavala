/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datoscliente.datos;

/**
 *
 * @author DELL
 */
public class Venta {

    public String getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(String Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getId_ruta() {
        return Id_ruta;
    }

    public void setId_ruta(String Id_ruta) {
        this.Id_ruta = Id_ruta;
    }
   private String Id_cliente; 
   private String asiento;
   
   private String Id_ruta; 
   
   public Venta() {
        
    }
}
