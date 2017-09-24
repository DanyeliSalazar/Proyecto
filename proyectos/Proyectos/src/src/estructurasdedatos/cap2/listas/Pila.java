/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasdedatos.cap2.listas;
import estructurasdedatos.cap2.listas.Tallerpila;

//Leidy Danyeli Salazar

public class Pila {
    private Datospila dato;
    private Tallerpila tope;
    
    
    public Datospila getDato() {
        return dato;
}

    
    public void setDato(Datospila dato) {
        this.dato = dato;
}

    public Pila(){
        dato = null;  
}

    public boolean vacia(){
        return (tope == null);
}
    
       public void apilar(String nombre, String fecha, String responsable){
        Tallerpila nuevo =new Tallerpila();
        nuevo.setDato(nombre, fecha, responsable);
        if(vacia()){
            tope=nuevo;

        }
else{
        nuevo.setSiguiente(tope);
        tope = nuevo;
        }
    }
      
       public void desapilar() {
        if (vacia()) {
            System.out.println("No existen Esos Elementos En La Pila");
        } else {
            System.out.println("dato ( " + tope.getDato().getNombre() + " )" + " Eliminado");
            tope = tope.getSiguiente();
        }
    }
   
        public void listar() {

        if (!(tope == null)) {
            Tallerpila aux = tope;
            System.out.println("La Pila Es ");
            while (aux != null) {
                System.out.println("el dato :" + "[" + aux.getDato().getNombre() + "]");
                aux = aux.getSiguiente();
            }
        }
    }
}

