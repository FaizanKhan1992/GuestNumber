package com.example.hp.guestnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    Button checkno;
    TextView ed1, ed2;
    EditText gustno;
int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (TextView) findViewById(R.id.n1);
        ed2 = (TextView) findViewById(R.id.n2);
        gustno = (EditText) findViewById(R.id.gust);
        checkno = (Button) findViewById(R.id.check);




    }
    public void Random(){
        a= r.nextInt(10);
        b = r.nextInt(10);
        ed1.setText(String.valueOf(a));
        ed2.setText(String.valueOf(b));

    }


    public void OnAns(View view) {


        if ((a + b) == Integer.parseInt(String.valueOf(gustno.getText()))) {
            Toast.makeText(this,"Rigth Anwser",Toast.LENGTH_LONG).show();
            Random();
        }

        else{
            Toast.makeText(this,"Wrong Anwser",Toast.LENGTH_LONG).show();
            Random();
        }


    }
}

