/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap4.arboles;

/**
 *
 * @author tusk
 */
public class ArbolBinario {
    
    public int dato;
    public NodoArbolB raiz;
 
    public void insertarNodo(int dato) {
 
        NodoArbolB nuevoNodo = new NodoArbolB();
        NodoArbolB cont;
        nuevoNodo.setDato(dato);
        cont = raiz;
        int a = 0;
 
        if (raiz == null) {
            raiz = nuevoNodo;
            System.out.println("Se inserto en el nodo raiz" + raiz.getDato());
 
        } else {
            while (a == 0) {
                if (nuevoNodo.getDato() > cont.getDato()) {
                    if (cont.getNodoDer() == null) {
                        cont.setNodoDer(nuevoNodo);
                        System.out.println("Se inserto el nodo "
                                + nuevoNodo.getDato() + " a la derecha de "
                                + cont.getDato());
                        a++;
                    } else {
                        cont = cont.getNodoDer();
                    }
                } else if (cont.getNodoIzq() == null) {
                    cont.setNodoIzq(nuevoNodo);
                    System.out.println("Se inserto el nodo "
                            + nuevoNodo.getDato() + " a la izquierda de "
                            + cont.getDato());
                    a++;
                } else {
                    cont = cont.getNodoIzq();
                }
            }
        }
    }
 
    public void buscarDato(NodoArbolB raiz, int dato) {
        NodoArbolB datico = new NodoArbolB();
        NodoArbolB cont;
        datico.setDato(dato);
        cont = raiz;
        int a = 0;
 
        if (datico.getDato() == cont.getDato()) {
            System.out.println("El número " + dato + " está en el arbol");
        } else {
            while (a == 0) {
                if (datico.getDato() > cont.getDato()) {
                    if (cont.getNodoDer() == null) {
                        System.out.println("No se encontró el número " + dato);
                        a++;
                    } else if (cont.getNodoDer().getDato() == datico.getDato()) {
                        System.out.println("El número " + dato + " está en el arbol");
                        a++;
                    } else {
                        cont = cont.getNodoDer();
                    }
                } else if (cont.getNodoIzq() == null) {
                    System.out.println("No se encontró el número " + dato);
                    a++;
                } else if (cont.getNodoIzq().getDato() == datico.getDato()) {
                    System.out.println("El número " + dato + " está en el arbol");
                    a++;
                } else {
                    cont = cont.getNodoIzq();
                }
            }
        }
    }
 
    public void preOrden(NodoArbolB raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + " - ");
            preOrden(raiz.getNodoIzq());
            preOrden(raiz.getNodoDer());
        }
    }
 
    public void Orden(NodoArbolBraiz) {
        if (raiz != null) {
            preOrden(raiz.getNodoIzq());
            System.out.print(raiz.getDato() + " - ");
            preOrden(raiz.getNodoDer());
        }
    }
 
    public void postOrden(NodoArbolBraiz) {
        if (raiz != null) {
            preOrden(raiz.getNodoIzq());
            preOrden(raiz.getNodoDer());
            System.out.print(raiz.getDato() + " - ");
        }
    }
}
