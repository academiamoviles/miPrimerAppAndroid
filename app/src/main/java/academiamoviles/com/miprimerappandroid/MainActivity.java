package academiamoviles.com.miprimerappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Definir variables
    EditText edt_usuario, edt_dni;
    Button btn_ingresar;

    String usuario,dni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2 inicialiamos ui
        inicializarUI();

        //3 Evento onclick
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //4. Obtenemos valores
                usuario = edt_usuario.getText().toString();
                dni = edt_dni.getText().toString();

                //5. Mostramos mensaje
                Toast.makeText(v.getContext(),usuario + " " + dni,Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void inicializarUI() {

        edt_usuario = (EditText) findViewById(R.id.edt_usuario);
        edt_dni = (EditText) findViewById(R.id.edt_dni);
        btn_ingresar = (Button) findViewById(R.id.btn_ingresar);
    }
}
