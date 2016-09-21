package mx.edu.utng.statecompu;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by LALO on 13/09/2016.
 */
public class Lienzo extends View {
    private Boton estado;
    private Computadora computadora;

    public Lienzo(Context context, Boton estado, Computadora computadora){
        super(context);
        this.estado = estado;
        this.computadora = computadora;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado!=null&&computadora!=null){
            computadora.setCanvas(canvas);
            estado.presionarSwitch(computadora, canvas);
        }
    }

    public Boton getEstado() {
        return estado;
    }

    public void setEstado(Boton estado) {
        this.estado = estado;
    }
}
