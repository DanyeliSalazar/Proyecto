/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
 
public class NodoListaDoble {
    private int dato;
    private NodoListaDoble anterior;
    private NodoListaDoble siguiente;

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public NodoListaDoble getAnterior() {
        return anterior;
    }
    public void setAnterior(NodoListaDoble anterior){
        this.anterior = anterior;
    }
         public NodoListaDoble getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }
    public void crearnodoListadoble (){
        
        this.siguiente=null;
        this.anterior=null;
        this.dato=0;
        
    }
}
