package jhonfreddypuentes.com.bankapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewUno;
    ImageView imageViewDos;
    ImageView imageViewTres;
    ImageView imageViewCuatro;
    ImageView imageViewCinco;
    ImageView imageViewSeis;
    ImageView imageViewSiete;
    ImageView imageViewOcho;
    ImageView imageViewNueve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().hide();
        getSupportActionBar().hide();

        imageViewUno = (ImageView) findViewById(R.id.imageView1);
        imageViewDos = (ImageView) findViewById(R.id.imageView2);
        imageViewTres = (ImageView) findViewById(R.id.imageView3);
        imageViewCuatro = (ImageView) findViewById(R.id.imageView4);
        imageViewCinco = (ImageView) findViewById(R.id.imageView5);
        imageViewSeis = (ImageView) findViewById(R.id.imageView6);
        imageViewSiete = (ImageView) findViewById(R.id.imageView7);
        imageViewOcho = (ImageView) findViewById(R.id.imageView8);
        imageViewNueve = (ImageView) findViewById(R.id.imageView9);

        imageViewUno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewDos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewTres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewCuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewCinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewSeis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewSiete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewOcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
        imageViewNueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                verCategorias();
            }
        });
    }

    private void verCategorias(){
        Intent intent = new Intent(this, CategoriaActivity.class);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
