package com.android.takehomeassignment09_xiaomengz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference stringRef = database.getReference("String");
    private DatabaseReference bookRef = database.getReference("Book");
    private DatabaseReference dateRef = database.getReference("Date");

    private int stringIndex = 0;
    private int bookIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void sendAString(View view) {
        stringRef.setValue("This is string " + stringIndex);
        stringIndex++;
    }

    public void sendABook(View view) {
        bookRef.push().setValue(new Book("Book Title " + bookIndex, 2000, 12.34));
        bookIndex++;
    }

    public void sendADate(View view) {
        dateRef.setValue(new Date());
    }
}
