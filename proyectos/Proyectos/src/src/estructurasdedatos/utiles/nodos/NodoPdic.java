package estructurasdedatos.utiles.nodos;

 /*@author Leidy Danyeli Salazar Murillo*/
 
public class NodoPdic {
    private String Pdic;
    private String significa;
    private NodoPdic siguiente;

  
    public String getPdic() {
        return Pdic;
    }

    
    public void setPdic(String Pdic) {
        this.Pdic = Pdic;
    }

    public String getsignifica() {
        return significa;
    }


    public void setsignifica(String significa) {
        this.significa = significa;
    }

    
    public NodoPdic getsiguiente() {
        return siguiente;
    }

  
    public void setsiguiente(NodoPdic siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}


