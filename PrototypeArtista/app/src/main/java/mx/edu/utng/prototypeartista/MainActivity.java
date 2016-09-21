package mx.edu.utng.prototypeartista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, cancion;
    private Button btnClonar;
    private GridView grvBruno;
    private ArrayList<Bruno> brunos;
    private Bruno bruno;
    private BrunoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.edt_nombre);
        cancion = (EditText)findViewById(R.id.edt_cancion);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvBruno = (GridView)findViewById(R.id.grv_bruno);
        brunos = new ArrayList<Bruno>();
        bruno = new Bruno();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bruno.setNombre(nombre.getText().toString());
                bruno.setCancion(cancion.getText().toString());
                Bruno clon = (Bruno) bruno.clonar();
                brunos.add(clon);
                adapter=new BrunoAdapter(MainActivity.this,(ArrayList) brunos );
                grvBruno.setAdapter(adapter);
            }
        });


    }
}
