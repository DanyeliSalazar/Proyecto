/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

//Leidy Danyeli Salazar
public class Nodo {

    private Nodo siguiente;
    private int dato;

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void crearnodo() {
        this.siguiente = null;
        this.dato = 0;

    }
}
