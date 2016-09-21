package mx.edu.utng.mementoarbol;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by LALO on 18/09/2016.
 */
public class Arbol {
private int color;

    public Arbol( ){}

    public void dibujar(Canvas canvas, int color) {
        Paint paint = new Paint();
        Paint paint2 = new Paint();
        paint2.setColor(Color.GRAY);
        paint2.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();
        Path pared = new Path();

        float ancho = canvas.getWidth()/2;
        float alto = canvas.getHeight()/2;

        path.moveTo(ancho-200, alto);
        path.lineTo(ancho-200, alto);
        path.lineTo(ancho+200, alto);
        path.lineTo(ancho, alto-120);
        path.close();

        path.moveTo(ancho-150, alto-80);
        path.lineTo(ancho+150, alto-80);
        path.lineTo(ancho, alto-200);
        path.close();

        path.moveTo(ancho-100, alto-160);
        path.lineTo(ancho+100, alto-160);
        path.lineTo(ancho, alto-280);
        path.close();

        pared.moveTo(ancho-50, alto);
        pared.lineTo(ancho-50, alto);
        pared.lineTo(ancho+50, alto);
        pared.lineTo(ancho+50, alto+150);
        pared.lineTo(ancho-50, alto+150);
        pared.close();

        canvas.drawPath(path,paint);
        canvas.drawPath(pared,paint2);


    }
    public Memento guardarMemento(){
        return new Memento(color);
    }

    public void restaurarMemento(Memento m){
        color = m.getColor();
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }


}
