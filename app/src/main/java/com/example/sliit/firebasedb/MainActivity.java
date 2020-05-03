package com.example.sliit.firebasedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    EditText txtName;
    Spinner SpinnerCourse;

    DatabaseReference dbStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.btnClick);
        txtName = (EditText)findViewById(R.id.txtName);
        SpinnerCourse = (Spinner) findViewById(R.id.spinnerCourse);

        dbStudent = FirebaseDatabase.getInstance().getReference().child("Student");

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addData();
            }
        });


    }

    private void addData()
    {
        String arrName = txtName.getText().toString().trim();
        String course = SpinnerCourse.getSelectedItem().toString();

        if(!TextUtils.isEmpty(arrName)){

            Student student= new Student("1",arrName,course);
            dbStudent.push().setValue(student);



          // dbStudent.child(id).setValue(student);

           Toast.makeText(this,"Data Enterred !!!",Toast.LENGTH_LONG).show();

        }
        else {
            Toast.makeText(this,"Name is Empty",Toast.LENGTH_LONG).show();
        }
    }


}
