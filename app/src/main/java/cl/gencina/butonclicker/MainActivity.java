package cl.gencina.butonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate", "creando");

        initListeners();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "paaaaartiendooo casi lista");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "casi casi (hay musica o animaciones por aca???)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "pausando (necesitas detener algo o guardar algo? es aca!!!! si hay poca memoria puedo saltarme el onStop() y el OnDestroy())");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "deteniendo, nos vemos en un rato pero estare por aca en tu memoria xD");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "Reinciando de cero!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "Hasta pronto, app querida xD");
    }

    private void initListeners() {
        Button cambiarActividad = findViewById(R.id.btn_go_to);
        Button salir = findViewById(R.id.btn_close);

        cambiarActividad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        salir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}