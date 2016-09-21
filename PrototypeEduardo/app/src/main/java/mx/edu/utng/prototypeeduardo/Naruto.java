package mx.edu.utng.prototypeeduardo;

/**
 * Created by LALO on 08/09/2016.
 */
public class Naruto implements Clonable {
private String nombre, sexo;

    public Naruto(){
        this.nombre="";
        this.sexo="";
    }
    public Naruto (String nombre, String sexo){
        this.nombre=nombre;
        this.sexo=sexo;
    }

    public Clonable clonar(){
        Naruto clon = new Naruto();
        clon.nombre = nombre;
        clon.sexo=sexo;
        return clon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
}


