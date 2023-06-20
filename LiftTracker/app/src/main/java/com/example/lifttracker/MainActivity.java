package com.example.lifttracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // Handle the selected date here
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(MainActivity.this, "Selected Date: " + selectedDate, Toast.LENGTH_SHORT).show();
            }
        });

    }
    private boolean isValidCredentials(String username, String password) {
        // Add logic to validate the username and password
        // For simplicity, this example always returns true
        return true;
    }
}