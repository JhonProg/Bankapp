package jhonfreddypuentes.com.bankapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroClienteActivity extends AppCompatActivity {

    private Button botonRegistroContinuar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cliente);

        getSupportActionBar().hide();

        botonRegistroContinuar = (Button)findViewById(R.id.buttonRegistroContinuar);

        botonRegistroContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAlChat();
            }
        });

    }

    private void irAlChat(){
        Intent intent = new Intent(this, ChatActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
