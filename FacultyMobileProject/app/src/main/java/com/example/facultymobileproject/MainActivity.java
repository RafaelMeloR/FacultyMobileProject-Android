package com.example.facultymobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView facultyIdText_View;
    private TextView facultyLnameText_View;
    private TextView facultyFnameText_View;
    private TextView facultySalaryText_View;
    private TextView facultyBonusText_View;
    private TextView bonusText_View;
    private Button NextButton;
    private Button PrevButton;
    private Button CalculateBonusButton;
    private int currentIndex=0;
    public static String TAG="Course Project";
    public static String KEY_INDEX = "index";

    Faculty faculty1 = new Faculty(101, "Robertson", "Myra", 60000.00, 2.50);
    Faculty faculty2 = new Faculty(212, "Smith", "Neal", 40000.00, 3.00);
    Faculty faculty3 = new Faculty(315, "Arlec", "Lisa", 55000.00, 1.50);
    Faculty faculty4 = new Faculty(857, "Fillipo", "Paul", 30000.00, 5.00);
    Faculty faculty5 = new Faculty(370, "Denkan", "Anais", 95000.00, 1.50);

    public Faculty [] all_faculty=new Faculty[]{faculty1,faculty2,faculty3,faculty4,faculty5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null)
        {
            currentIndex=savedInstanceState.getInt(KEY_INDEX);
        }

        //Get the view of faculty_id_text_view
        facultyIdText_View=(TextView) findViewById(R.id.faculty_id_text_view);
        facultyIdText_View.setText(Integer.toString(all_faculty[currentIndex].getF_id()));

        //Get the view of faculty_lname_text_view
        facultyLnameText_View=(TextView) findViewById(R.id.faculty_lname_text_view);
        facultyLnameText_View.setText(all_faculty[currentIndex].getF_Lname());

        //Get the view of faculty_fname_text_view
        facultyFnameText_View=(TextView) findViewById(R.id.faculty_fname_text_view);
        facultyFnameText_View.setText(all_faculty[currentIndex].getF_Fname());

        //Get the view of faculty_salary_text_view
        facultySalaryText_View=(TextView) findViewById(R.id.faculty_salary_text_view);
        facultySalaryText_View.setText(Double.toString(all_faculty[currentIndex].getF_Salary()));

        //Get the view of faculty_bonus_text_view
        facultyBonusText_View=(TextView) findViewById(R.id.faculty_bonus_text_view);
        facultyBonusText_View.setText(Double.toString(all_faculty[currentIndex].getF_bonus()));

        //Get the view of bonus_text_view
        bonusText_View=(TextView) findViewById(R.id.bonus_text_view);


        //Get the view of bonus_text_view
        CalculateBonusButton=(Button) findViewById(R.id.display_bonus_button);
        CalculateBonusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bonusText_View.setText(Double.toString(all_faculty[currentIndex].calculate_Bonus()));
            }
        });
        //Get the view of next_faculty_button
        NextButton=(Button) findViewById(R.id.next_faculty_button);
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex=(currentIndex+1)%all_faculty.length;
                facultyIdText_View.setText(Integer.toString(all_faculty[currentIndex].getF_id()));
                facultyLnameText_View.setText(all_faculty[currentIndex].getF_Lname());
                facultyFnameText_View.setText(all_faculty[currentIndex].getF_Fname());
                facultySalaryText_View.setText(Double.toString(all_faculty[currentIndex].getF_Salary()));

            }
        });
        //Get the view of prev_faculty_button
        PrevButton=(Button) findViewById(R.id.prev_faculty_button);
        PrevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex - 1 + all_faculty.length) % all_faculty.length;
                facultyIdText_View.setText(Integer.toString(all_faculty[currentIndex].getF_id()));
                facultyLnameText_View.setText(all_faculty[currentIndex].getF_Lname());
                facultyFnameText_View.setText(all_faculty[currentIndex].getF_Fname());
                facultySalaryText_View.setText(Double.toString(all_faculty[currentIndex].getF_Salary()));
                facultyBonusText_View.setText(Double.toString(all_faculty[currentIndex].getF_bonus()));
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "onSaveInstanceState: called");
        savedInstanceState.putInt(KEY_INDEX,currentIndex);
    }
}