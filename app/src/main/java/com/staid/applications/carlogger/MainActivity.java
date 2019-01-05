package com.staid.applications.carlogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "logTag";

    EditText editTextOdometer;
    Button buttonTensUp;
    Button buttonTensDown;
    Button buttonDigitsUp;
    Button buttonDigitsDown;
    Button buttonChangeVehicle;
    Button buttonChangeDriver;
    Button buttonEnterFillUpDetails;
    Button buttonFuelLog;
    Button buttonMaintenance;
    Button buttonVehicles;
    Button buttonDrivers;

    Spinner spinnerGenres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //load defaults into the database
        new LoadInitialDefaults();
        //Make Log
        Log.w(TAG, "Ran - " + TAG);
        //Set up inputs from GUI (activity_main)
        editTextOdometer = (EditText) findViewById(R.id.editTextOdometer);
        buttonTensUp = (Button) findViewById(R.id.buttonTensUp);
        buttonTensDown = (Button) findViewById(R.id.buttonTensDown);
        buttonDigitsUp = (Button) findViewById(R.id.buttonDigitsUp);
        buttonDigitsDown = (Button) findViewById(R.id.buttonDigitsDown);
        buttonChangeVehicle = (Button) findViewById(R.id.buttonChangeVehicle);
        buttonChangeDriver = (Button) findViewById(R.id.buttonChangeDriver);
        buttonEnterFillUpDetails = (Button) findViewById(R.id.buttonEnterFillUpDetails);
        buttonFuelLog = (Button) findViewById(R.id.buttonFuelLog);
        buttonMaintenance = (Button) findViewById(R.id.buttonMaintenance);
        buttonVehicles = (Button) findViewById(R.id.buttonVehicles);
        buttonDrivers = (Button) findViewById(R.id.buttonDrivers);

        //Set up actions for the buttons
        buttonTensUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int OdometerReading = Integer.parseInt((editTextOdometer.getText()).toString());
                OdometerReading += 10;
                editTextOdometer.setText(Integer.toString(OdometerReading));
                String thisButton = "buttonTensUp - " + OdometerReading;
                outputlog(thisButton);
            }
        });

        buttonTensDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int OdometerReading = Integer.parseInt((editTextOdometer.getText()).toString());
                OdometerReading -= 10;
                editTextOdometer.setText(Integer.toString(OdometerReading));
                String thisButton = "buttonTensDown - " + OdometerReading;
                outputlog(thisButton);
            }
        });

        buttonDigitsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int OdometerReading = Integer.parseInt((editTextOdometer.getText()).toString());
                OdometerReading += 1;
                editTextOdometer.setText(Integer.toString(OdometerReading));
                String thisButton = "buttonDigitsUp - " + OdometerReading;
                outputlog(thisButton);
            }
        });

        buttonDigitsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int OdometerReading = Integer.parseInt((editTextOdometer.getText()).toString());
                OdometerReading -= 1;
                editTextOdometer.setText(Integer.toString(OdometerReading));
                String thisButton = "buttonDigitsDown - " + OdometerReading;
                outputlog(thisButton);
            }
        });

        buttonChangeVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String thisButton = "buttonChangeVehicle";
                outputlog(thisButton);
            }
        });

        buttonChangeDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String thisButton = "buttonChangeDriver";
                outputlog(thisButton);
            }
        });

        buttonEnterFillUpDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String thisButton = "buttonEnterFillUpDetails";
                outputlog(thisButton);
            }
        });

        buttonFuelLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String thisButton = "buttonFuelLog";
                outputlog(thisButton);
            }
        });

        buttonMaintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String thisButton = "buttonMaintenance";
                outputlog(thisButton);
            }
        });

        buttonVehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String thisButton = "buttonVehicles";
                outputlog(thisButton);
            }
        });

        buttonDrivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String thisButton = "buttonDrivers";
                outputlog(thisButton);
            }
        });
    }

    public void enterFillUpDetails(){
        //Log.w(TAG, "Ran - enter Fill Up Details " + editTextOdometer.getText());
        Log.w(TAG, "-------------");
    };

    public void outputlog(String thisButton){
        Log.w(TAG, "Button pressed -- " + thisButton);
    };
}



/*
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import android.widget.ListView;
        import android.widget.Toast;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import java.util.ArrayList;
        import java.util.List;
        import android.content.Intent;
        import android.support.annotation.NonNull;
        import android.text.TextUtils;
        import com.google.firebase.database.ValueEventListener;
        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        */
