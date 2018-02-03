package com.zubchenok.valntinesday.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zubchenok.valntinesday.R;

public class MainActivity extends AppCompatActivity {

    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = findViewById(R.id.main_next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startNextActivity();
            }
        });
    }

    private void startNextActivity() {
        Intent intent = new Intent(this, HashtagActivity.class);
        startActivity(intent);
    }
}
