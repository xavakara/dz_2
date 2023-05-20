package com.example.dz_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameIn;
    private EditText surnameIn;
    private EditText patronymicIn;
    private EditText dateIn;
    private Button button;

    private String name;
    private String surname;
    private String patronymic;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameIn = findViewById(R.id.nameIn);
        surnameIn = findViewById(R.id.surnameIn);
        patronymicIn = findViewById(R.id.patronymicIn);
        dateIn = findViewById(R.id.dateIn);

        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            name = nameIn.getText().toString();
            surname = surnameIn.getText().toString();
            patronymic = patronymicIn.getText().toString();
            date = dateIn.getText().toString();

            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            intent.putExtra("name",name);
            intent.putExtra("surname",surname);
            intent.putExtra("patronymic",patronymic);
            intent.putExtra("date",date);


            startActivity(intent);

        }
    };
}