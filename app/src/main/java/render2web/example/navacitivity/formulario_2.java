package render2web.example.navacitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wilmarburgos.miformulario.R;


public class formulario_2 extends AppCompatActivity {

    EditText Nombre, Apellido, Identificacion, Eps, Telefono;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicioformulario_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Nombre = (EditText)findViewById(R.id.editText1);
        Apellido = (EditText)findViewById(R.id.editText2);
        Identificacion = (EditText)findViewById(R.id.editText3);
        Eps = (EditText)findViewById(R.id.editText4);
        Telefono = (EditText)findViewById(R.id.editText5);
        btn = (Button) findViewById(R.id.bto2);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {

                enviardatos();

                //Intent intent = new Intent(view.getContext(), render3web.example.navacivity.formulario_3.class);

                //intent.putExtra("Nombre", nombreaexportar.getText().toString());
                //startActivityForResult(intent, 0);



                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void enviardatos (){

        String nombre, apellido, identificacion, eps, telefono;
        nombre = Nombre.getText().toString();
        apellido = Apellido.getText().toString();
        identificacion = Identificacion.getText().toString();
        eps = Eps.getText().toString();
        telefono = Telefono.getText().toString();
        Intent intent = new Intent(formulario_2.this, render3web.example.navacivity.formulario_3.class);
        intent.putExtra("Nombre", nombre);
        intent.putExtra("Apellido", apellido);
        intent.putExtra("Identificacion", identificacion);
        intent.putExtra("Eps", eps);
        intent.putExtra("Telefono", telefono);
        startActivity(intent);




    }

}
