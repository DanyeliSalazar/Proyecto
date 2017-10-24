/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.utiles.nodos;

/**
 *
 * @author Leidy Danyeli Salazar
 */
public class NodoArbolBinario {
    
    private int dato;    
    private NodoArbolBinario nodoDer;    
    private NodoArbolBinario nodoIzq;
    
    public void NodoArbolBinario(int dato) { 
        this.dato = dato;}
    
    public int getDato() {
        return dato;}
    
    public void setDato(int dato) { 
        this.dato = dato;}
    
    public NodoArbolBinario getnodoDer() { 
        return nodoDer; }
    
    public void setnodoDer (NodoArbolBinario nodoDer) {   
        this.nodoDer = nodoDer;}
    
        public NodoArbolBinario getnodoIzq() {      
        return nodoIzq;}
    
    public void setnodoIzq (NodoArbolBinario nodoIzq) { 
        this.nodoIzq = nodoIzq;
    }
}
