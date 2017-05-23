package jhonfreddypuentes.com.bankapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CategoriaActivity extends AppCompatActivity {

    Button bTarjetaCredito;
    Button bTarjetaDebito;
    Button bCreditos;
    Button bCuentaAhorros;
    Button bCuentaCorriente;
    Button bTransferencias;
    Button bPreguntasFrecuentes;
    Button bContactenos;

    private int categoriaSeleccionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_categoria);
        getSupportActionBar().hide();

        bTarjetaCredito      = (Button) findViewById(R.id.buttonTarjetaCredito);
        bTarjetaDebito       = (Button) findViewById(R.id.buttonTarjetaDebito);
        bCreditos            = (Button) findViewById(R.id.buttonCreditos);
        bCuentaAhorros       = (Button) findViewById(R.id.buttonCuentaAhorros);
        bCuentaCorriente     = (Button) findViewById(R.id.buttonCuentaCorriente);
        bTransferencias      = (Button) findViewById(R.id.buttontransferencias);
        bPreguntasFrecuentes = (Button) findViewById(R.id.buttonPreguntasFrecuentes);
        bContactenos         = (Button) findViewById(R.id.buttonContactenos);

        bTarjetaCredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 1;
                verTipoLogin();
            }
        });

        bTarjetaDebito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 2;
                verTipoLogin();
            }
        });

        bCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 3;
                verTipoLogin();
            }
        });

        bTarjetaCredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 4;
                verTipoLogin();
            }
        });

        bCuentaAhorros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 5;
                verTipoLogin();
            }
        });

        bCuentaCorriente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 6;
                verTipoLogin();
            }
        });

        bTransferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 7;
                verTipoLogin();
            }
        });

        bPreguntasFrecuentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 8;
                verTipoLogin();
            }
        });

        bContactenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                categoriaSeleccionada = 8;
                verPantallaContacto();
            }
        });

    }

    private void verTipoLogin(){
        Intent intent = new Intent(this, TipoLoginActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    private void verPantallaContacto(){
        Intent intent = new Intent(this, ContactoActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
