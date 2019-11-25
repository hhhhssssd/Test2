package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Button button1=(Button)findViewById(R.id.buttonReturn);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = getIntent();
                String name=intent.getStringExtra("name");
                Integer age=intent.getIntExtra("age",20);
                intent.putExtra("result","姓名： "+name+" 年龄： "+age);
                setResult(0,intent);
                finish();
            }
        });

    }
}
