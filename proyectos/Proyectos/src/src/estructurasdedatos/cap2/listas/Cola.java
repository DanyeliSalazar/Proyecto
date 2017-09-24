/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;
import estructurasdedatos.cap2.listas.Persona;

//Leidy Danyeli Salazar

public class Cola {

    private Nodopersona dato;
    private Nodopersona limite;
    private Nodopersona ultimo;

    public void creacola() {
        limite = ultimo = null;
    }

    public boolean vacia() {
        return (this.limite == null);
    }

    public void encolar(int DocumentoDeIdentidad) {

        Nodopersona nuevo = new Nodopersona();
        nuevo.setDato(DocumentoDeIdentidad);
        if (vacia()) {
            this.limite = nuevo;
            this.ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void desencolar() {

        if (vacia()) {
            System.out.println("La Cola esta vacia");
        } else {
            limite = limite.getSiguiente();
        }
    }

    public void listar() {
        Nodopersona aux = limite;

        System.out.println("");
        int i = 0;
       
        
        while (aux != null) {
            System.out.println(i + "." + " [ " + aux.getDato().getDocumentoDeIdentidad() + " ]");
            aux = aux.getSiguiente();
            i++;
        }
    }

    public int tamaño() {

        Nodopersona aux = limite;
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    public Nodopersona getDato() {
        return dato;
    }

    public void setDato(int Documento De Identidad) {
        Nodopersona p = new Nodopersona();
        p = dato;
    }
}
