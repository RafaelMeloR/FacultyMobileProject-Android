package com.example.facultymobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class FacultyActivity extends AppCompatActivity {
    private EditText facultyID;
    private EditText facultyFName;
    private EditText facultyLName;
    private EditText facultySalary;
    private EditText facultyRateBonus;
    private static  final String EXTRA_FACULTY_ID="com.example.facultymobileproject.faculty_id";
    private static  final String EXTRA_FACULTY_FNAME="com.example.facultymobileproject.faculty_fname";
    private static  final String EXTRA_FACULTY_LNAME="com.example.facultymobileproject.faculty_lname";
    private static  final String EXTRA_FACULTY_SALARY="com.example.facultymobileproject.faculty_salary";
    private static  final String EXTRA_FACULTY_RATE_BONUS="com.example.facultymobileproject.faculty_rate_bonus";

    public static Intent newIntent(Context packageContext, int facultyId, String facultyFName,
                                   String facultyLName, double facultySalary, double facultyRateBonus)
    {
        Intent intent = new Intent(packageContext, FacultyActivity.class);
        intent.putExtra(EXTRA_FACULTY_ID, facultyId);
        intent.putExtra(EXTRA_FACULTY_FNAME, facultyFName);
        intent.putExtra(EXTRA_FACULTY_LNAME, facultyLName);
        intent.putExtra(EXTRA_FACULTY_SALARY, facultySalary);
        intent.putExtra(EXTRA_FACULTY_RATE_BONUS, facultyRateBonus);

        return  intent;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);

        //Decoding the extra data from the intent object
        int facultyIdRetrieve = getIntent().getIntExtra(EXTRA_FACULTY_ID,0);
        String facultyFNameRetrieve = getIntent().getStringExtra(EXTRA_FACULTY_FNAME);
        String facultyLNameRetrieve = getIntent().getStringExtra(EXTRA_FACULTY_LNAME);
        double facultySalaryRetrieve = getIntent().getDoubleExtra(EXTRA_FACULTY_SALARY,0);
        double facultyRateBonusRetrieve = getIntent().getIntExtra(EXTRA_FACULTY_RATE_BONUS,0);

        //Get the view of faculty_id
        facultyID= (EditText) findViewById(R.id.faculty_id_text_view_FacultyActivity);
        facultyID.setText(Integer.toString(facultyIdRetrieve));

        //Get the view of faculty_fname
        facultyFName=(EditText) findViewById(R.id.faculty_fname_text_view_FacultyActivity);
        facultyFName.setText(facultyFNameRetrieve);

        //Get the view of faculty_lname
        facultyLName=(EditText) findViewById(R.id.faculty_lname_text_view_FacultyActivity);
        facultyLName.setText(facultyLNameRetrieve);

        //Get the view of faculty_salary
        facultySalary=(EditText) findViewById(R.id.faculty_salary_text_view_FacultyActivity);
        facultySalary.setText(Double.toString( facultySalaryRetrieve));

        //Get the view of faculty_rate_bonus
        facultyRateBonus=(EditText) findViewById(R.id.faculty_bonus_text_view_FacultyActivity);
        facultyRateBonus.setText(Double.toString(facultyRateBonusRetrieve));


    }


}