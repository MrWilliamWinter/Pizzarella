package com.example.android.pizzarella;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button phoneShop;
    Button findOnline;
    Button orderOnline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneShop = findViewById(R.id.phoneShop);

    }

    public void dialNumber (View v) {
        Intent dialDigits = new Intent(Intent.ACTION_CALL);
        dialDigits.setData(Uri.parse("tel:0164276767"));

        if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(dialDigits);

    }
    public void orderOnlineSite (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.just-eat.co.uk/restaurants-pizzarella-cleveland/menu"));
        startActivity(browserIntent);


    }
    public void findOnlineSite (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.uk/maps/place/Pizzarella/@54.5184508,-1.3189733,15z/data=!4m5!3m4!1s0x0:0xb04673563bef3902!8m2!3d54.5184508!4d-1.3189733"));
        startActivity(browserIntent);


    }


}