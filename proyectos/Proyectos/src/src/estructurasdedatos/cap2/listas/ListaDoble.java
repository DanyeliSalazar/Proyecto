/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

//Leidy Danyeli Salazar

public class ListaDoble {
    private NodoListaDoble cabeza;
    private NodoListaDoble cola;
    
    public void crearListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }
 
    public void insertarOrdenado(int dato) {
        NodoListaDoble nodito = new NodoListaDoble();
        nodito.crearnodoListadoble();
        nodito.setDato(dato);
        NodoListaDoble aux = cabeza;
        if (this.cabeza == null && this.cola == null) {
            this.cabeza = nodito;
            this.cola = nodito;    
        } else if (nodito.getDato() < aux.getDato() && aux.getSiguiente() == null) {
            nodito.setSiguiente(aux);
            nodito.setAnterior(this.cabeza);
            this.cabeza =nodito;    
        }
    }

    public void listarDoble() {
        if (!(this.cabeza == null && this.cola == null)) {
            NodoListaDoble aux = cabeza;
            int i = 0;
            while (aux != null) {   
                System.out.println("El Dato :" + " " + "[" + aux.getDato() + "]" + " " + "esta en la posicion:"
                        + " " + "(" + i + ")" + "de la lista");
                aux = aux.getSiguiente();  
                i++;
            }
        }
    }

    public void eliminarDoble(int dato) {

        if (cabeza.getDato() == dato) {
            cabeza = cabeza.getSiguiente();
        } else {
            NodoListaDoble aux = cabeza;
            while (aux.getSiguiente().getDato() != dato) {
                aux = aux.getSiguiente();
            }
            NodoListaDoble siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);  
        }
    }

    public void insertarFinal(int dato) {

    NodoListaDoble nodito = new NodoListaDoble();
    nodito.crearnodoListadoble();
    nodito.setDato(dato);
    if (this.cabeza == null && this.cola == null) {
        cabeza = nodito;
        cola = nodito;
    } else {
        NodoListaDoble aux = cabeza;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();

            }
            aux.setSiguiente(nodito);  
            nodito.setAnterior(aux);
        }
    }
}
