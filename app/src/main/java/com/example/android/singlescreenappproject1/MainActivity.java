package com.example.android.singlescreenappproject1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Display discount information on the screen
    public void sendButton(View view) {
        String discountMessage = "Congratulations!!! You won 10% discount on the product you choose." + "\nVisit our shop and show this message and get the discount." + "\nHappy shopping!!!" + "\nMikronis Team";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Congratulations!!! You won 10% discount!!!");
        intent.putExtra(Intent.EXTRA_TEXT, discountMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
        startActivity(intent);
    }


    }
}







