package com.yesimgunduz.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Text_1;
    EditText Text_2;
    TextView textView_Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Text_1=findViewById(R.id.Text_1);
         Text_2=findViewById(R.id.Text_2);
         textView_Result=findViewById(R.id.textView_Result);


    }
    public void Artı(View view){
if(Text_1.getText().toString().matches("")||Text_2.getText().toString().matches("")) {
    textView_Result.setText("numara giriniz");
}else{
    int sayı_1 = Integer.parseInt(Text_1.getText().toString());
    int sayı_2 = Integer.parseInt(Text_2.getText().toString());
    int result = sayı_1 + sayı_2;
    textView_Result.setText("Result:" + result);
}
    }
    public void Eksi(View view){
        if(Text_1.getText().toString().matches("")||Text_2.getText().toString().matches("")) {
            textView_Result.setText("numara giriniz");
        }else{
        int sayı_1= Integer.parseInt(Text_1.getText().toString());
        int sayı_2= Integer.parseInt(Text_2.getText().toString());
        int result=sayı_1-sayı_2;
        textView_Result.setText("Result:"+result);
    }}
    public void Carpma(View view){

            if (Text_1.getText().toString().matches("") || Text_2.getText().toString().matches("")) {
                textView_Result.setText("numara giriniz");
            } else {
                int sayı_1 = Integer.parseInt(Text_1.getText().toString());
                int sayı_2 = Integer.parseInt(Text_2.getText().toString());
                int result = sayı_1 * sayı_2;
                textView_Result.setText("Result:" + result);
            }}
            public void Bölme (View view){
                if (Text_1.getText().toString().matches("") || Text_2.getText().toString().matches("")) {
                    textView_Result.setText("numara giriniz");
                } else {

                    int sayı_1 = Integer.parseInt(Text_1.getText().toString());
                    int sayı_2 = Integer.parseInt(Text_2.getText().toString());
                    int result = sayı_1 / sayı_2;
                    textView_Result.setText("Result:" + result);
                }
            }
        }