package mx.edu.utng.mementoarbol;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rgpColores;
    private RadioButton rbtRojo;
    private RadioButton rbtVerde;
    private RadioButton rbtAzul;
    private RadioButton rbtAmarillo;
    private Button btnGuardar;
    private Button btnDeshacer;
    private Button btnRehacer;
    private LinearLayout layPrincipal;
    private Lienzo lienzo;
    private Arbol arbol;
    private CareTaker careTaker;
    private int ultimo=0;
    private int actual=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgpColores = (RadioGroup) findViewById(R.id.rgb_colores);
        rbtRojo = (RadioButton) findViewById(R.id.rbt_rojo);
        rbtAmarillo = (RadioButton) findViewById(R.id.rbt_amarillo);
        rbtVerde = (RadioButton) findViewById(R.id.rbt_verde);
        rbtAzul = (RadioButton) findViewById(R.id.rbt_azul);
        btnGuardar = (Button) findViewById(R.id.btn_guardar);
        btnDeshacer = (Button) findViewById(R.id.btn_deshacer);
        btnRehacer = (Button) findViewById(R.id.btn_rehacer);
        layPrincipal = (LinearLayout) findViewById(R.id.layprincipal1);
        careTaker = new CareTaker();
        arbol = new Arbol();
        lienzo = new Lienzo(this, arbol);
        layPrincipal.addView(lienzo);
        btnDeshacer.setEnabled(false);
        btnRehacer.setEnabled(false);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (rgpColores.getCheckedRadioButtonId()) {
                    case R.id.rbt_rojo:
                        setMemento(Color.RED);
                        break;
                    case R.id.rbt_verde:
                        setMemento(Color.GREEN);
                        break;
                    case R.id.rbt_azul:
                        setMemento(Color.BLUE);
                        break;
                    case R.id.rbt_amarillo:
                        setMemento(Color.YELLOW);
                        break;
                    default:
                        break;
                }

            }
        });
    }
        public void setMemento(int color){
            arbol.setColor(color);
            lienzo.setArbol(arbol);
            lienzo.invalidate();
            careTaker.addMemento(arbol.guardarMemento());
            ultimo = careTaker.getMementos().size()-1;
            actual= ultimo;
        }

    }

