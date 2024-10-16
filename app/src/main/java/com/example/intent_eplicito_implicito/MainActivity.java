package com.example.intent_eplicito_implicito;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.net.Uri;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // intent explicito
        Button btnYouTube = findViewById(R.id.youtube);
        btnYouTube.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.youtube",
                    "com.google.android.youtube.HomeActivity");
            startActivity(intent);
        });

        // intent explicito
        Button btnFacebook = findViewById(R.id.facebook);
        btnFacebook.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.facebook.katana",
                    "com.facebook.katana.LoginActivity");
            startActivity(intent);
        });

        // intent explicito
        Button btnTwitter = findViewById(R.id.twitter);
        btnTwitter.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClassName("com.twitter.android",
                    "com.twitter.android.StartActivity");
            startActivity(intent);
        });

        // intent implicito
        Button btnTwitch = findViewById(R.id.twitch);
        btnTwitch.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.twitch.tv/"));
            startActivity(intent);
        });



        // intent implicito
        Button btnWikipedia = findViewById(R.id.wikipedia);
        btnWikipedia.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.wikipedia.org/"));
            startActivity(intent);
        });

        // intent implicito
        Button btnWhatsApp = findViewById(R.id.whatsapp);
        btnWhatsApp.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Este es un mensaje para compartir");

            startActivity(intent);
        });
    }
}