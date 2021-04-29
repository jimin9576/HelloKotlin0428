package com.example.hellokotlin0428;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickCount;
    TextView txtActivityStartTime, txtCountBtnClicks;
    Button btnClickMe;
    final long startTime = System.currentTimeMillis(); //바꾸지 않을 변수는 상수로 선언하는 것이 낫다!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartTime);
        txtCountBtnClicks = findViewById(R.id.txtCountButtonClicks);
        btnClickMe = findViewById(R.id.btnClickMe);

        clickCount = 0;
    //    startTime = System.currentTimeMillis();

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCount++;
                txtCountBtnClicks.setText("Button clicks = " + clickCount);
            }
        });
        String sTimeStamp = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + sTimeStamp);
    }
}