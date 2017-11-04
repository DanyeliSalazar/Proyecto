/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap5.grafos;

import java.util.List;

/**
* 
* @author Leidy Danyeli Salazar M 
*/
        
        public class Grafo {
            
                List<Vertice> vertices;    
                List<ArcoNoDirigido> matrizadyacensia;
            
        public void insertarVertice(String dato) {
                Vertice vertice = new Vertice();
                    vertice.setDato(dato);    
            }
       
            
            public void insertarArco(Vertice v1, Vertice v2) {
                    ArcoNoDirigido Nuevoarco = new ArcoNoDirigido();       
                    Nuevoarco.setV1(v1);        
                    Nuevoarco.setV2(v2);        
                    matrizadyacensia.add(Nuevoarco);
            }        
            
            public void eliminarvertice(String dato){        
                for (Vertice verticeactual : vertices) {
                    if (verticeactual.getDato().compareTo(dato)==0)                
                        vertices.remove(verticeactual);                               
                }    
            }
        }
