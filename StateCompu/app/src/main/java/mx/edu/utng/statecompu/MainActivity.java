package mx.edu.utng.statecompu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnSwitch;
    private LinearLayout layPrincipal;
    private Lienzo lienzo;
    private Encendido estadoInicial;
    private Computadora computadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSwitch = (ImageButton)findViewById(R.id.btn_switch);
        layPrincipal = (LinearLayout)findViewById(R.id.lay_principal);
        estadoInicial = new Encendido();
        computadora = new Computadora(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, computadora);
        layPrincipal.addView(lienzo);
        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lienzo.setEstado(computadora.getEstado());
                computadora.presionarBoton();
                lienzo.invalidate();

            }
        });

    }
}
