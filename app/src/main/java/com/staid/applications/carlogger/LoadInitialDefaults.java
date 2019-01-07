package com.staid.applications.carlogger;

import android.util.Log;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class LoadInitialDefaults {
    final String TAG = "logTag";
    DatabaseReference myRef;// = FirebaseDatabase.getInstance().getReference("Driver");
    FirebaseFirestore db;

    public LoadInitialDefaults() {
        MakeDefaultDriver();
        MakeDefaultVehicle();
        //FireStoreTest();
    }

    public void FireStoreTest(){
        String NAME_KEY = "Name";
        String EMAIL_KEY = "Email";
        String PHONE_KEY = "Phone";

        Map<String, Object> newContact = new HashMap<>();
        newContact.put(NAME_KEY, "John");
        newContact.put(EMAIL_KEY, "john@gmail.com");
        newContact.put(PHONE_KEY, "080-0808-009");
        db.collection("PhoneBook").document("Contacts").set(newContact);
    }

    public void MakeDefaultDriver() {
        String randoString = "------MakeDefaultDriver--------";
        Log.w(TAG, "Ran - " + randoString);

        //database access
        //DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Driver");
        myRef = FirebaseDatabase.getInstance().getReference("Driver");
        String id = myRef.push().getKey();
        //driver
        final String DEFAULT_DRIVER_FIRST_NAME = "HEW";
        final String DEFAULT_DRIVER_LAST_NAME  = "----";
        final String NICKNAME = "HEW";
        final String LICENCE_EXPIRY_DATE_STRING ="31/12/2019";
        Driver driver = new Driver(DEFAULT_DRIVER_FIRST_NAME,DEFAULT_DRIVER_LAST_NAME,NICKNAME,LICENCE_EXPIRY_DATE_STRING);
        //myRef.child(id).setValue(driver);

        db = FirebaseFirestore.getInstance();
        String FIRST_NAME_KEY = "FirstName";
        String LAST_NAME_KEY  = "LastName";
        String NICKNAME_KEY = "Nickname";
        String LICENCE_EXPIRY_DATE_KEY = "LicenceExpiryDate";
        Map<String, Object> newDriver = new HashMap<>();
        newDriver.put(FIRST_NAME_KEY, DEFAULT_DRIVER_FIRST_NAME);
        newDriver.put(LAST_NAME_KEY, DEFAULT_DRIVER_LAST_NAME);
        newDriver.put(NICKNAME_KEY, NICKNAME);
        newDriver.put(LICENCE_EXPIRY_DATE_KEY, LICENCE_EXPIRY_DATE_STRING);
        db.collection("Drivers").document("Details").set(newDriver);
        return;
    }

    public void MakeDefaultVehicle() {
        String randoString = "-------MakeDefaultVehicle--------";
        Log.w(TAG, "Ran - " + randoString);

        //database access
        //DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Vehicle");
        myRef = FirebaseDatabase.getInstance().getReference("Vehicle");
        String id = myRef.push().getKey();
        //vehicle
        final String CAR_NAME = "AMY";
        final String OWNER = "HEW";
        final String LICENCE_PLATE = "------";
        final String MAKE = "HONDA";
        final String MODEL = "CIVIC";
        final String COLOUR = "RED";
        final int YEAR_MADE = 1999;
        final String REGISTRATION_EXPIRY = "01/08/2019";
        Vehicle vehicle = new Vehicle (CAR_NAME,OWNER,LICENCE_PLATE,MAKE,MODEL,COLOUR,YEAR_MADE,REGISTRATION_EXPIRY);
        myRef.child(id).setValue(vehicle);
        return;
    }



//import java.text.ParseException;
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.Date;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.ValueEventListener;
//import android.widget.Toast;
//import android.icu.text.SimpleDateFormat;
    /*
    //database access
    DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Driver");;
    DatabaseReference myRef2 = FirebaseDatabase.getInstance().getReference("Vehicle");;

    //driver
    final String DEFAULT_DRIVER_FIRST_NAME = "HEW";
    final String DEFAULT_DRIVER_LAST_NAME  = "----";
    final String NICKNAME = "HEW";
    String LICENCE_EXPIRY_DATE_STRING ="31/12/2019";


    //vehicle
    final String CAR_NAME = "AMY";
    final String OWNER = NICKNAME;
    final String LICENCE_PLATE = "------";
    final String MAKE = "HONDA";
    final String MODEL = "CIVIC";
    final String COLOUR = "RED";
    final String YEAR_MADE = "1999";
    final String REGISTRATION_EXPIRY = "01/08/2019";

    public LoadInitialDefaults(){

        //logging
        final String TAG = "logTag";
        LocalDate  localDate = LocalDate.now();
        LocalTime now = LocalTime.now();
        String Date_Time = localDate.toString() + " " + now.toString();
        Log.w(TAG,"Ran - " + Date_Time);

        //set up database connection
        String id = myRef.push().getKey();
        String id2 = myRef2.push().getKey();

        //enter driver
        Driver driver = new Driver(DEFAULT_DRIVER_FIRST_NAME,DEFAULT_DRIVER_LAST_NAME,NICKNAME,LICENCE_EXPIRY_DATE_STRING);
        //String outstring = driver.getFirstName() + " - " + driver.getLastName()  + " - " + driver.getNickName();
        //Log.w(TAG,"Driver " + outstring);
        myRef.child(id).setValue(driver);

        //enter vehicle
        Vehicle vehicle = new Vehicle (CAR_NAME,OWNER,LICENCE_PLATE,MAKE,MODEL,COLOUR,YEAR_MADE,REGISTRATION_EXPIRY);
        myRef2.child(id2).setValue(vehicle);*/

}


//final LocalDate LICENCE_EXPIRY = LocalDate.parse("2019-12-01");
//Date date = new Date();
//final Date LICENCE_EXPIRY_DATE = new Date(date.getTime() + (604800000L * 2) + (24 * 60 * 60));
/*
    Date LICENCE_EXPIRY_DATE;
    {
        try {
            LICENCE_EXPIRY_DATE = new SimpleDateFormat("dd/MM/yyyy").parse(LICENCE_EXPIRY_DATE_STRING);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    final String LICENCE_EXPIRY = sdf.format(LICENCE_EXPIRY_DATE);
*/

//Date aDate = new Date();
//myRef.child(id).setValue(aDate.toString("mm/dd/yyyy"));
        /*
        try {
            Date date = new Date();
            Date newDate = new Date(date.getTime() + (604800000L * 2) + (24 * 60 * 60));
            SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
            String stringdate = dt.format(newDate);

            System.out.println("Submission Date: " + stringdate);

            myRef.child("init_date").setValue(stringdate);

        } catch (Exception e) {
            e.printStackTrace();
        }*/
//DatabaseReference mRef2 =  FirebaseDatabase.getInstance().getReference().child("Users").child("testing");
//String id = myRef.push().getKey();
//myRef.child(id).setValue(driver);
//mRef2.setValue("blahzzzz");
//Toast.makeText(this, "Driver added", Toast.LENGTH_LONG).show();
