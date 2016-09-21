package mx.edu.utng.singletonfutbol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private Button btnCrear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNombre = (EditText)findViewById(R.id.edt_equipo);
        btnCrear = (Button)findViewById(R.id.btn_crear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EquipoFutbol equipoFutbol = EquipoFutbol.getUnicaInstancia();
                equipoFutbol.setNomEquipo(edtNombre.getText().toString());
                Toast.makeText(MainActivity.this, "El nuevo equpo de futbol se agrego", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
