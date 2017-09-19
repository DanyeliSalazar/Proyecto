/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodos;

// Leidy Danyeli Salazar 

public class ListaSimple {

    private Nodo cabeza;
    private Nodo cola;
    
    public void CrearListaSimple() {

        this.cabeza = null;
        this.cola = null;
    }


    public void insertar(int dato) {
        Nodo nod = new Nodo();
        nod.crearnodo();
        nod.setDato(dato);

        if (this.cabeza == null && this.cola == null) {

            this.cabeza = nod;
            this.cola = nod;

        } 
        else {
            cola.setSiguiente(nod);
            this.cola = nod;

        }
    }

    public void eliminar(int dato) {

        if (cabeza.getDato() == dato) {
            cabeza =cabeza.getSiguiente();
        } else {
            Nodo aux = cabeza;
            while (aux.getSiguiente().getDato() != dato) {
                aux = aux.getSiguiente();
            }
            Nodo siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
        }
    }

    public void listar() {

        if (!(this.cabeza == null && this.cola == null)) {

            Nodo aux = cabeza;
            int i = 0;
            while (aux != null) {
                System.out.println("el dato :"  + "[" + aux.getDato() + "]" + " " + "Estas en la Posicion"
                        + "(" + i + ")" + "de la Lista");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
