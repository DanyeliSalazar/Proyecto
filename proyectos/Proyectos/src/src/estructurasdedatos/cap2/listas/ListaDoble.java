/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

//Leidy Danyeli Salazar
public class Listadoble {
    private NodoListaDoble cabeza;
    private NodoListaDoble cola;
    
    public void crearListaDoble() {
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
    
    public void listar (){
        if (!(this.cabeza == null && this.cola ==null)){
            NodoListaDoble aux = cabeza;
            
        }
    }
}
