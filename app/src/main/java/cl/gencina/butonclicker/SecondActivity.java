package cl.gencina.butonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initListeners();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart2", "paaaaartiendooo casi lista");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume2", "casi casi (hay musica o animaciones por aca???)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause2", "pausando (necesitas detener algo o guardar algo? es aca!!!! si hay poca memoria puedo saltarme el onStop() y el OnDestroy())");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop2", "deteniendo, nos vemos en un rato pero estare por aca en tu memoria xD");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart2", "Reinciando de cero!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy2", "Hasta pronto, app querida xD");
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    private void initListeners() {
        Button volver = findViewById(R.id.btn_volver);
        Button mostrar = findViewById(R.id.btn_go_to2);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        mostrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(intent);
            }
        });
    }
}