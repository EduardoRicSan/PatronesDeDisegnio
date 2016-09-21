package mx.edu.utng.prototypeeduardo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, sexo;
    private Button btnClonar;
    private GridView grvNaruto;
    private ArrayList<Naruto>narutos;
    private Naruto naruto;
    private NarutoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.edt_nombre);
        sexo = (EditText)findViewById(R.id.edt_sexo);
        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvNaruto = (GridView)findViewById(R.id.grv_naruto);
        narutos = new ArrayList<Naruto>();
        naruto = new Naruto();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naruto.setNombre(nombre.getText().toString());
                naruto.setSexo(sexo.getText().toString());
                Naruto clon = (Naruto) naruto.clonar();
                narutos.add(clon);
                adapter=new NarutoAdapter(MainActivity.this,(ArrayList) narutos );
                grvNaruto.setAdapter(adapter);
            }
        });


    }
}
