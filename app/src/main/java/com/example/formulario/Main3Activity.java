package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.formulario.Utils.appConstant;

public class Main3Activity extends AppCompatActivity {

    private TextView mName, mLast, mAge, mGenre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent mIntent = getIntent();
        mName=findViewById(R.id.tv_name);
        mLast=findViewById(R.id.tv_last_name);
        mAge=findViewById(R.id.tv_age);
        mGenre=findViewById(R.id.tv_genre);

        if(mIntent!=null){
            mName.setText(mIntent.getStringExtra(appConstant.TEXT_NAME));
            mLast.setText(mIntent.getStringExtra(appConstant.TEXT_LAST));
            mAge.setText(mIntent.getStringExtra(appConstant.TEXT_AGE));
            mGenre.setText(mIntent.getStringExtra(appConstant.TEXT_GENRE));
        }
    }
}
