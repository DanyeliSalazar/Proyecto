/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasdedatos.cap2.listas;

//Leidy Danyeli Salazar

public class Persona {
    
    private String nombre;
    public int documentodeidentidad;
    private String direccion;
    private String telofono;
    
    
    public Persona(int documentodeidentidad) {
        this.documentodeidentidad = documentodeidentidad;  
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public int getDocumentodeidentidad() {
        return documentodeidentidad;
    }

    public void setDocumentodeidentidad(int documentodeidentidad) {
        this.documentodeidentidad = documentodeidentidad;
    }

    public String getDireccion() {
        return direccion;
    }
  
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    public String getTelofono() {
        return telofono;
    }
 
    public void setTelofono(String telofono) {
        this.telofono = telofono;
    } 
}
