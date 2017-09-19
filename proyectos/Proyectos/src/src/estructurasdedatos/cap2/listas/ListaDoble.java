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
        NodoListaDoble nod = new NodoListaDoble();
        nod.crearnodoListadoble();
        nod.setDato(dato);
        NodoListaDoble aux = cabeza;
        if (this.cabeza == null && this.cola == null) {
            this.cabeza = nod;
            this.cola = nod;    
        } else if (nod.getDato() < aux.getDato() && aux.getSiguiente() == null) {
            nod.setSiguiente(aux);
            nod.setAnterior(this.cabeza);
            this.cabeza =nod;    
        }
    }
    
    public void listar (){
        if (!(this.cabeza == null && this.cola ==null)){
            NodoListaDoble aux = cabeza
        }}
}
