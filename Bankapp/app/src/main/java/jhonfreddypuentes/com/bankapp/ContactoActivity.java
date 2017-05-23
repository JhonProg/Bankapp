package jhonfreddypuentes.com.bankapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactoActivity extends AppCompatActivity {

    EditText etNombre;
    EditText etCorreo;
    EditText etTelefono;
    EditText etMensaje;
    Button bEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        getSupportActionBar().hide();

        etNombre = (EditText) findViewById(R.id.editTextNombre);
        etCorreo= (EditText) findViewById(R.id.editTextCorreo);
        etTelefono= (EditText) findViewById(R.id.editTextTelefono);
        etMensaje= (EditText) findViewById(R.id.editTextMensaje);
        bEnviar  = (Button) findViewById(R.id.buttonEnviar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regresar();
            }
        });

    }

    private void regresar(){
        Toast.makeText(this,"Mensaje enviado con exito. Gracias !!!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
