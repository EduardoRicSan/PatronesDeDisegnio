package mx.edu.utng.statecompu;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by LALO on 13/09/2016.
 */
public class Encendido extends Boton {
    public void presionarSwitch(Computadora computadora, Canvas canvas) {
        computadora.setEstado(new Apagado());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        float mitadX = canvas.getWidth();
        float mitadY = canvas.getHeight();
        float mitadA = canvas.getWidth();
        float mitadZ = canvas.getHeight();

        paint.setColor(Color.BLACK);
        canvas.drawRect(mitadX*0.1f, mitadY*0.2f,
                mitadX*0.9f, mitadY*0.5f, paint);

        paint.setColor(Color.GRAY);
        canvas.drawRect(mitadX * 0.15f, mitadY * 0.25f,
                mitadX * 0.85f, mitadY*0.45f, paint);

        paint.setColor(Color.BLACK);
        canvas.drawRect(mitadA*0.10f, mitadZ*0.25f,
                mitadA*0.60f,mitadZ*0.45f,paint);

    }

}
