package mx.edu.utng.prototypeartista;

/**
 * Created by LALO on 13/09/2016.
 */
public class Bruno implements Clonable {
    private String nombre, cancion;

    public Bruno(){
        this.nombre="";
        this.cancion="";
    }
    public Bruno (String nombre, String cancion){
        this.nombre=nombre;
        this.cancion=cancion;
    }
    public Clonable clonar(){
        Bruno clon = new Bruno();
        clon.nombre = nombre;
        clon.cancion=cancion;
        return clon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getCancion() {
        return cancion;
    }

}
