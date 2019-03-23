package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.formulario.Utils.appConstant;

public class MainActivity extends AppCompatActivity {

    private EditText mName, mLastName, mAge, mGenre;
    private Button mSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = findViewById(R.id.et_name);
        mLastName = findViewById(R.id.et_last_name);
        mAge = findViewById(R.id.et_age);
        mGenre = findViewById(R.id.et_genre);
        mSend = findViewById(R.id.bt_send);

        mSend.setOnClickListener( v -> {
            String textName = mName.getText().toString();
            String textLastName = mLastName.getText().toString();
            String textAge = mAge.getText().toString();
            String textGenre = mGenre.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra(appConstant.TEXT_NAME, textName);
            mIntent.putExtra(appConstant.TEXT_AGE, textAge);
            mIntent.putExtra(appConstant.TEXT_LAST, textLastName);
            mIntent.putExtra(appConstant.TEXT_GENRE, textGenre);
            startActivity(mIntent);
        });

    }
}
