package com.homework.calendarandtime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements android.app.TimePickerDialog.OnTimeSetListener {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.btn_one);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Calendar calendar = Calendar.getInstance();
                String s1 = String.valueOf(calendar.get(Calendar.DATE));
                String s2 = DateFormat.getDateInstance(DateFormat.SHORT).format(calendar.getTime());
                textView.setText(s2);*/

               DialogFragment frag = new TimePickerDialog();
                frag.show(getSupportFragmentManager(),"time picker");
            }
        });
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
        textView.setText(i+" Hour "+i1+" Minute");
    }
}