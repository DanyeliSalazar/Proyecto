/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasdedatos.cap2.listas;
import estructurasdedatos.cap2.listas.Persona;

//Leidy Danyeli Salazar

public class Nodopersona {
    private Persona dato;
    private Nodopersona siguiente;
    
    
    public void crearnodo(){
    siguiente=null;
    dato=null;
}
    
    public Persona getDato() {
        return dato;
    }
    
    public void setDato(int DocumentoDeIdentidad) {
        Persona p =new Persona (DocumentoDeIdentidad);
        this.dato = p;
    }
   
    public Nodopersona getSiguiente() {
        return siguiente;
    }
   
    public void setSiguiente(Nodopersona siguiente) {
        this.siguiente = siguiente;
    }   
}
