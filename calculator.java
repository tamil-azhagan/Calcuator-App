package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input1, input2;
    private Button addbutton,subbutton,mulbutton,divbutton, modbutton;

    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=(EditText)findViewById(R.id.ip1);
        input2=(EditText)findViewById(R.id.ip2);

        addbutton=(Button)findViewById(R.id.addbtn);
        subbutton=(Button)findViewById(R.id.subbtn);
        mulbutton=(Button)findViewById(R.id.mulbtn);
        divbutton=(Button)findViewById(R.id.divbtn);
        modbutton=(Button)findViewById(R.id.modbtn);

        result=(TextView)findViewById(R.id.ans);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double ex1=Double.parseDouble(input1.getText().toString());
                    double ex2=Double.parseDouble(input2.getText().toString());
                    double ans1=ex1+ex2;
                    result.setText("The Answer is: "+Double.toString(ans1));
                }
                catch(Exception e)
                {
                    {}
                }
            }
        });

        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double ex1=Double.parseDouble(input1.getText().toString());
                    double ex2=Double.parseDouble(input2.getText().toString());
                    double ans1=ex1-ex2;
                    result.setText("The Answer is: "+Double.toString(ans1));
                }
                catch(Exception e)
                {
                    {}
                }
            }
        });

        mulbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double ex1=Double.parseDouble(input1.getText().toString());
                    double ex2=Double.parseDouble(input2.getText().toString());
                    double ans1=ex1*ex2;
                    result.setText("The Answer is: "+Double.toString(ans1));
                }
                catch(Exception e)
                {
                    {}
                }
            }
        });
        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double ex1=Double.parseDouble(input1.getText().toString());
                    double ex2=Double.parseDouble(input2.getText().toString());
                    double ans1=ex1/ex2;
                    result.setText("The Answer is: "+Double.toString(ans1));
                }
                catch(Exception e)
                {
                    {result.setText("Denominator can't be zero");}
                }
            }
        });

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double ex1=Double.parseDouble(input1.getText().toString());
                    double ex2=Double.parseDouble(input2.getText().toString());
                    double ans1=(ex1%ex2)*100;
                    result.setText("The Answer is: "+Double.toString(ans1)+"%");
                }
                catch(Exception e)
                {
                    {}
                }
            }
        });
    }
}
