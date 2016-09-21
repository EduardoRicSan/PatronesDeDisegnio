package mx.edu.utng.singletonfutbol;

/**
 * Created by LALO on 13/09/2016.
 */
public class EquipoFutbol {
    private static EquipoFutbol unicaInstancia;
    private String nomEquipo;

    private EquipoFutbol() {
        this.nomEquipo = "";

    }
    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public String getNomEquipo() {
        return nomEquipo;
    }

    public static EquipoFutbol getUnicaInstancia() {
        if (unicaInstancia == null) {
            unicaInstancia = new EquipoFutbol();

        }
        return unicaInstancia;
    }

}
