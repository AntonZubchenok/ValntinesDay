package com.zubchenok.valntinesday.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zubchenok.valntinesday.R;

public class HashtagActivity extends AppCompatActivity {

    private Button okButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashtag);

        okButton = findViewById(R.id.hashtag_button);
        editText = findViewById(R.id.hashtag_edit_text);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().trim().equalsIgnoreCase("#ЧеловекКитаец")) {
                    startNextActivity();
                } else {
                    Toast.makeText(HashtagActivity.this, "Неа", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void startNextActivity() {
        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
    }
}
