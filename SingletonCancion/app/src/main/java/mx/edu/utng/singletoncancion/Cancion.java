package mx.edu.utng.singletoncancion;

/**
 * Created by LALO on 13/09/2016.
 */
public class Cancion {
    private static Cancion unicaInstancia;
    private String nomCancion;
    private String artista;

    public void setNomCancion(String nomCancion) {
        this.nomCancion = nomCancion;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public String getNomCancion() {
        return nomCancion;
    }

    public static Cancion getUnicaInstancia() {
        if (unicaInstancia == null) {
            unicaInstancia = new Cancion();

        }
        return unicaInstancia;
    }

}
