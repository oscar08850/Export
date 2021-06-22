package com.DefaultCompany.Archer;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends Activity {

    Button button;
    int pocionRoja = 6;
    int pocionAzul = 7;
    int manzana = 10;
    int fuerza = 1000;
    int maxHealth = 130;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void archer(View view) {
        Intent intent = new Intent(this, UnityPlayerActivity.class);
        intent.putExtra("pocionRoja", pocionRoja);
        intent.putExtra("pocionAzul", pocionAzul);

        intent.putExtra("manzana", manzana);
        intent.putExtra("maxHealth", maxHealth);
        intent.putExtra("powerFlecha", fuerza);

        startActivity(intent);


    }
}