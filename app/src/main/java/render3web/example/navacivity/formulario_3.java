package render3web.example.navacivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import com.example.wilmarburgos.miformulario.R;

public class formulario_3 extends AppCompatActivity {

    TextView Nombre, Apellido, Identificacion, Eps, Telefono;
    String nombre, apellido, identificacion, eps, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicioformulario_3);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Nombre = (TextView)findViewById(R.id.texto2);
        Apellido = (TextView)findViewById(R.id.texto1);
        Identificacion = (TextView)findViewById(R.id.texto3);
        Eps = (TextView)findViewById(R.id.texto4);
        Telefono =(TextView)findViewById(R.id.texto5);
        Bundle bundle = this.getIntent().getExtras();
        nombre = bundle.getString("Nombre");
        apellido = bundle.getString("Apellido");
        identificacion = bundle.getString("Identificacion");
        eps = bundle.getString("Eps");
        telefono = bundle.getString("Telefono");

        Nombre.setText(nombre);
        Apellido.setText(apellido);
        Identificacion.setText(identificacion);
        Eps.setText(eps);
        Telefono.setText(telefono);





        //String nombreimportado = bundle.getString("frase");

        //String nombreexportado = nombreimportado;
        //TextView out = (TextView)findViewById(R.id.texto2);
        //out.setText(nombreexportado);


        Button btn = (Button) findViewById(R.id.bto4);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(view.getContext(), com.example.wilmarburgos.miformulario.inicioformulario.class);
                startActivityForResult(intent2, 0);



                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
