package mx.edu.utng.statecompu;

import android.graphics.Canvas;

/**
 * Created by LALO on 13/09/2016.
 */
public class Computadora {
    private Boton estado;
    private Canvas canvas;

    public Computadora(Boton estado){

        this.estado = estado;
    }

    public Boton getEstado()
    {

        return estado;
    }

    public void setEstado(Boton estado)
    {

        this.estado = estado;
    }

    public void presionarBoton(){

        estado.presionarSwitch(this, canvas);
    }

    public Canvas getCanvas() {

        return canvas;
    }

    public void setCanvas(Canvas canvas) {

        this.canvas = canvas;
    }

}
