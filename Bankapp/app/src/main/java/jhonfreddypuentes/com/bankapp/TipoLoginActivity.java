package jhonfreddypuentes.com.bankapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipoLoginActivity extends AppCompatActivity {

    Button buttonClientee;
    Button buttonInvitadoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_login);

        getSupportActionBar().hide();

        buttonClientee = (Button)findViewById(R.id.buttonCliente);
        buttonInvitadoo = (Button)findViewById(R.id.buttonInvitado);

        buttonClientee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                irALogin();
            }
        });

        buttonInvitadoo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                irARegistro();
            }
        });

    }

    private void irALogin(){
        Intent intent = new Intent(this, LoginClienteActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    private void irARegistro(){
        Intent intent = new Intent(this, RegistroClienteActivity.class);
        startActivity(intent);
    }
}
