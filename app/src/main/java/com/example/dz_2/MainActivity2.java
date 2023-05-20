package com.example.dz_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button button;
    private TextView textView_1;

    private String name;
    private String surname;
    private String patronymic;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView_1 = findViewById(R.id.textView_1);
        button = findViewById(R.id.button);

        Bundle bundleIntent = getIntent().getExtras();

        name = bundleIntent.get(name).toString();
        surname = bundleIntent.get(surname).toString();
        patronymic = bundleIntent.get(patronymic).toString();
        date = bundleIntent.get(date).toString();

        textView_1.setText("имя" + name + "\n" + "фамилия" + surname + "\n" + "отчество" + patronymic + "\n" + "дата" + date + "\n");

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);

        }
    };
}