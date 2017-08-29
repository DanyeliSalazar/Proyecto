import java.lang.Math; // headers MUST be above the first class


// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
   	Persona danye = new Persona();
    danye.setNombre(" Danyeli");
    System.out.println("soy yo" + danye.getNombre());
     
  }
}

//Danyeli Salazar

public class Persona{
    
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    
    
//return the nombre
    
    public String getNombre(){
        return nombre;
    }
  
//param nombre the nombre to set
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
  
//return the cedula
    
    public String getCedula(){
        return cedula;
    }

//param cedula the cedula to set
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }

//return the direccion
     
    public String getDireccion(){
        return direccion;
    }
    
//param direccion the direccion to set
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

//return the telefono
    
    public String getTelefono(){
       return telefono;
    }

//param telefono the telefono to set
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    } 
}
