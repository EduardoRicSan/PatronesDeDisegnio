package mx.edu.utng.mementoarbol;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by LALO on 18/09/2016.
 */
public class Lienzo extends View{
    private Arbol arbol;

    public Lienzo(Context context, Arbol arbol){
        super(context);
        this.arbol = arbol;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(arbol!=null){
            arbol.dibujar(canvas, arbol.getColor());
        }
    }

    public Arbol getAutomovil() {
        return arbol;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }

}
