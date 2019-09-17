package com.ejemplo.webservices.appescuelaitorientacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.webkit.WebView;

public class SecondActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        checkPermission();

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("https://gearsofwar.com/es-mx");
        webView.getSettings().setJavaScriptEnabled(true);
    }

    private void checkPermission() {

       if (ContextCompat.checkSelfPermission(this,
              Manifest.permission.INTERNET)
              != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                  Manifest.permission.INTERNET)) {

            } else {

               ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.INTERNET},
                        3);
            }
        }
    }
}
