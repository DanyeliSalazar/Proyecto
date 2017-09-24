/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package estructurasdedatos.cap2.listas;
import estructurasdedatos.cap2.listas.Datospila;

//Leidy Danyeli Salazar

public class TareaPila {
    
    Datospila dato;
    TareaPila siguiente;

    public void crearnodo(){
        
        this.dato = null;
        siguiente=null; 
    }
   
    public Datospila getDato() {
        return dato;
    }
 
    public void setDato(String nombre, String fecha, String responsable ) {
        Datospila a= new Datospila(nombre, fecha, responsable);
        this.dato = a;
    }
   
    public TareaPila getSiguiente() {
        return siguiente;
    }
   
    public void setSiguiente(TareaPila siguiente) {
        this.siguiente = siguiente;
    } 
}
