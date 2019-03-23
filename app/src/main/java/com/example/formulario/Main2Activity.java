package com.example.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.formulario.Utils.appConstant;

public class Main2Activity extends AppCompatActivity {

    private TextView mName, mLast, mAge, mGenre;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent mIntent = getIntent();

        mName = findViewById(R.id.tv_name);
        mLast = findViewById(R.id.tv_last_name);
        mAge = findViewById(R.id.tv_age);
        mGenre = findViewById(R.id.tv_genre);
        mShare = findViewById(R.id.bt_share);

        if(mIntent!= null){
            mName.setText(mIntent.getStringExtra(appConstant.TEXT_NAME));
            mLast.setText(mIntent.getStringExtra(appConstant.TEXT_LAST));
            mAge.setText(mIntent.getStringExtra(appConstant.TEXT_AGE));
            mGenre.setText(mIntent.getStringExtra(appConstant.TEXT_GENRE));

            mShare.setOnClickListener(v -> {
                String getName = mName.getText().toString();
                String getLast = mLast.getText().toString();
                String getAge = mAge.getText().toString();
                String getGenre = mGenre.getText().toString();
                Intent mIntent2 = new Intent();
                mIntent2.setType("text/plain");
                mIntent2.setAction(Intent.ACTION_SEND);
                mIntent2.putExtra(appConstant.TEXT_NAME, getName);
                mIntent2.putExtra(appConstant.TEXT_LAST, getLast);
                mIntent2.putExtra(appConstant.TEXT_AGE, getAge);
                mIntent2.putExtra(appConstant.TEXT_GENRE,getGenre);

                startActivity(mIntent2);


            });


        }



    }
}
