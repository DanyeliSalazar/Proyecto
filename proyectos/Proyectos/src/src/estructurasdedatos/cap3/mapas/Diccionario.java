package estructurasdedatos.cap3.mapas;


import estructurasdedatos.utiles.nodos.NodoPdic;

/*@author Leidy Danyeli Salazar Murillo*/
public class Diccionario {

    NodoPdic cabeza;
    NodoPdic cola;

    public Diccionario() {
        cabeza = null;
        cola = null;
    }

    
    public void ingresarPdic(String Pdic, String significa) {
        NodoPdic nuevaPdic = new NodoPdic();
        nuevaPdic.setPdic(Pdic);
        nuevaPdic.setsignifica(significa);

        
        if (cabeza == null) {
            cabeza = nuevaPdic;
            cabeza.setsignifica(null);
            cola = cabeza;

            
        } else {
            cola.setsiguiente(nuevaPdic);
            nuevaPdic.setsignifica(null);
            cola = nuevaPdic;
        }
        
    }

    
    
    public void verPdic() {
        NodoPdic palabra = new NodoPdic();
        palabra = cabeza;
        while (palabra!= null) {
            System.out.println(palabra.getPdic() + " " + palabra.getsignifica());
            palabra = palabra.getsiguiente();
        }
        System.out.println("");
        
    }

    
    public void modificarpaldicc(String pal, String nuevosignifica) {
        NodoPdic palabra  = new NodoPdic();
       palabra  = cabeza;
        int estado = 0;
        while (palabra  != null) {
            if (palabra .getPdic().equals(pal) == true) {

                palabra .setsignifica(nuevosignifica);
                estado = 1;

            }
            palabra  = palabra .getsiguiente();
        }
        if (estado == 0) {
            System.out.println("No esta en el diccionario");
        }
    }

    
    
    public void borrarPdic(String pal) {
        NodoPdic palabra = new NodoPdic();
        NodoPdic anterior = new NodoPdic();
         palabra = cabeza;
        anterior = null;
        int ban = 0;
        while (palabra!= null) {
            if (palabra.getPdic().equals(pal) == true) {
                ban = 1;
                if (palabra == cabeza) {
                    cabeza = cabeza.getsiguiente();
                } else {
                    anterior.setsiguiente(palabra.getsiguiente());
          
                
                }

            }
            anterior = palabra;
           palabra = palabra.getsiguiente();
        }
        if (ban == 0) {
            System.out.println("No esta en el diccionario");
        }
    }

}
