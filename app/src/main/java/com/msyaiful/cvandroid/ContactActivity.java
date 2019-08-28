package com.msyaiful.cvandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {
    CardView call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        call = findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "08996390503";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +phoneNumber));
                startActivity(dialPhone);
            }
        });
    }
}
