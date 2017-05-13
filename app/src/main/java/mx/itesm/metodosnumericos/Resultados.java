package mx.itesm.metodosnumericos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Resultados extends Activity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        resultado = (TextView) findViewById(R.id.resultado);
        ImageButton back = (ImageButton) findViewById(R.id.back);

        Bundle b = getIntent().getExtras();
        String value = "El resultado de la operacion es\n";
        if(b != null)
            value = b.getString("key");

        resultado.setText(value);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), PrimerPantalla.class);
                startActivity(inti);
            }
        });
    }
}
