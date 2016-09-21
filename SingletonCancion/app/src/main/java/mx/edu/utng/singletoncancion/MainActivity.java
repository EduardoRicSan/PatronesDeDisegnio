package mx.edu.utng.singletoncancion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtCancion, edtArtista;
    private Button btnCrear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCancion = (EditText)findViewById(R.id.edt_cancion);
        edtArtista = (EditText)findViewById(R.id.edt_artista);
        btnCrear = (Button)findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cancion cancion = Cancion.getUnicaInstancia();
                cancion.setNomCancion(edtCancion.getText().toString());
                cancion.setArtista(edtArtista.getText().toString());
                Toast.makeText(MainActivity.this, edtCancion.getText().toString() + "Se ha agregado a la playlist", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
