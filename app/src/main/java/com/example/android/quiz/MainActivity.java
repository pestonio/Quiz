package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton QuestionEightOne, QuestionEightTwo, QuestionEightThree, QuestionEightFour;
    RadioButton QuestionSixOne, QuestionSixTwo, QuestionSixThree, QuestionSixFour;
    RadioButton QuestionThreeOne, QuestionThreeTwo, QuestionThreeThree, QuestionThreeFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RadioGroups will not work with the nested layouts. Define each button
        // and set their status independently.
        QuestionThreeOne = (RadioButton) findViewById(R.id.Q3_1);
        QuestionThreeTwo = (RadioButton) findViewById(R.id.Q3_2);
        QuestionThreeThree = (RadioButton) findViewById(R.id.Q3_3);
        QuestionThreeFour = (RadioButton) findViewById(R.id.Q3_4);
        QuestionSixOne = (RadioButton) findViewById(R.id.Q6_1);
        QuestionSixTwo = (RadioButton) findViewById(R.id.Q6_2);
        QuestionSixThree = (RadioButton) findViewById(R.id.Q6_3);
        QuestionSixFour = (RadioButton) findViewById(R.id.Q6_4);
        QuestionEightOne = (RadioButton) findViewById(R.id.Q8_1);
        QuestionEightTwo = (RadioButton) findViewById(R.id.Q8_2);
        QuestionEightThree = (RadioButton) findViewById(R.id.Q8_3);
        QuestionEightFour = (RadioButton) findViewById(R.id.Q8_4);

        //Question 3
        //Status on button 1 being clicked
        QuestionThreeOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                QuestionThreeOne.setChecked(true);
                QuestionThreeTwo.setChecked(false);
                QuestionThreeThree.setChecked(false);
                QuestionThreeFour.setChecked(false);
            }
        });
        //Question 3
        //Status on button 2 being clicked
        QuestionThreeTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                QuestionThreeOne.setChecked(false);
                QuestionThreeTwo.setChecked(true);
                QuestionThreeThree.setChecked(false);
                QuestionThreeFour.setChecked(false);
            }
        });
        //Question 3
        //Status on button 3 being clicked
        QuestionThreeThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionThreeOne.setChecked(false);
                QuestionThreeTwo.setChecked(false);
                QuestionThreeThree.setChecked(true);
                QuestionThreeFour.setChecked(false);
            }
        });
        //Question 3
        //Status on button 4 being clicked
        QuestionThreeFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionThreeOne.setChecked(false);
                QuestionThreeTwo.setChecked(false);
                QuestionThreeThree.setChecked(false);
                QuestionThreeFour.setChecked(true);
            }
        });
        //Question 6
        //Status on button 1 being clicked
        QuestionSixOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionSixOne.setChecked(true);
                QuestionSixTwo.setChecked(false);
                QuestionSixThree.setChecked(false);
                QuestionSixFour.setChecked(false);
            }
        });
        //Question 6
        //Status on button 2 being clicked
        QuestionSixTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionSixOne.setChecked(false);
                QuestionSixTwo.setChecked(true);
                QuestionSixThree.setChecked(false);
                QuestionSixFour.setChecked(false);
            }
        });
        //Question 6
        //Status on button 3 being clicked
        QuestionSixThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionSixOne.setChecked(false);
                QuestionSixTwo.setChecked(false);
                QuestionSixThree.setChecked(true);
                QuestionSixFour.setChecked(false);
            }
        });
        //Question 6
        //Status on button 4 being clicked
        QuestionSixFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionSixOne.setChecked(false);
                QuestionSixTwo.setChecked(false);
                QuestionSixThree.setChecked(false);
                QuestionSixFour.setChecked(true);
            }
        });
        //Question 8
        //Status on button 1 being clicked
        QuestionEightOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionEightOne.setChecked(true);
                QuestionEightTwo.setChecked(false);
                QuestionEightThree.setChecked(false);
                QuestionEightFour.setChecked(false);
            }
        });
        //Question 8
        //Status on button 2 being clicked
        QuestionEightTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionEightOne.setChecked(false);
                QuestionEightTwo.setChecked(true);
                QuestionEightThree.setChecked(false);
                QuestionEightFour.setChecked(false);
            }
        });
        //Question 8
        //Status on button 3 being clicked
        QuestionEightThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionEightOne.setChecked(false);
                QuestionEightTwo.setChecked(false);
                QuestionEightThree.setChecked(true);
                QuestionEightFour.setChecked(false);
            }
        });
        //Question 8
        //Status on button 4 being clicked
        QuestionEightFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                QuestionEightOne.setChecked(false);
                QuestionEightTwo.setChecked(false);
                QuestionEightThree.setChecked(false);
                QuestionEightFour.setChecked(true);
            }
        });
        //Question 4 spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.King_Pirate, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    //Pressing the Submit button runs this method, comparing all entries to the correct answers and
    //totalling points.
    public void checkResult(View view) {
        int totalScore = 0;
        //Question 1 answer method
        String[] q1Answers = getResources().getStringArray(R.array.AnswersQ1);
        EditText question1Answer = (EditText) findViewById(R.id.Q1_A);
        for (String string1Answers : q1Answers)
            if (question1Answer.getText().toString().equals(string1Answers))
                totalScore += +1;

        //Question 2 answer method and checkbox limit
        int limit = 0;
        CheckBox q2_1AnswersShips = (CheckBox) findViewById(R.id.Q2_1);
        if (q2_1AnswersShips.isChecked())
            limit += +1;
        CheckBox q2_2AnswersShips = (CheckBox) findViewById(R.id.Q2_2);
        if (q2_2AnswersShips.isChecked())
            limit += +1;
        CheckBox q2_3AnswersShips = (CheckBox) findViewById(R.id.Q2_3);
        if (q2_3AnswersShips.isChecked())
            limit += +1;
        CheckBox q2_4AnswersShips = (CheckBox) findViewById(R.id.Q2_4);
        if (q2_4AnswersShips.isChecked())
            limit += +1;
        CheckBox q2_5AnswersName = (CheckBox) findViewById(R.id.Q2_5);
        if (q2_5AnswersName.isChecked())
            limit += +1;
        CheckBox q2_6AnswersName = (CheckBox) findViewById(R.id.Q2_6);
        if (q2_6AnswersName.isChecked())
            limit += +1;
        CheckBox q2_7AnswersName = (CheckBox) findViewById(R.id.Q2_7);
        if (q2_7AnswersName.isChecked())
            limit += +1;
        CheckBox q2_8AnswersName = (CheckBox) findViewById(R.id.Q2_8);
        if (q2_8AnswersName.isChecked())
            limit += +1;
        if (limit == 2) {

            if (q2_4AnswersShips.isChecked() && q2_6AnswersName.isChecked() && !q2_1AnswersShips.isChecked() && !q2_2AnswersShips.isChecked() && !q2_3AnswersShips.isChecked() && !q2_5AnswersName.isChecked() && !q2_7AnswersName.isChecked() && !q2_8AnswersName.isChecked())
                totalScore += +1;
        } else if (limit >= 3) {
            Toast toast = Toast.makeText(getApplicationContext(), "That's Cheating! Question 2 can only have 2 answers!", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        //Question 3 answer method
        RadioButton q3Answer = (RadioButton) findViewById(R.id.Q3_1);
        boolean question3Answer = q3Answer.isChecked();
        if (question3Answer)
            totalScore += +1;

        //Question 4 answer method
        Spinner q4Answer = (Spinner) findViewById(R.id.spinner);
        String question4Answer = q4Answer.getSelectedItem().toString();
        if (question4Answer.equals("Henry Every"))
            totalScore += +1;

        //Question 5 answer method
        String[] q5Answers = getResources().getStringArray(R.array.AnswersQ5);
        EditText question5Answer = (EditText) findViewById(R.id.Q5_A);
        for (String string5Answers : q5Answers)
            if (question5Answer.getText().toString().equals(string5Answers))
                totalScore += +1;

        //Question 6 answer method
        RadioButton q6Answer = (RadioButton) findViewById(R.id.Q6_3);
        boolean question6Answer = q6Answer.isChecked();
        if (question6Answer)
            totalScore += +1;

        //Question 7 answer method
        String[] q7Answers = getResources().getStringArray(R.array.AnswersQ7);
        EditText question7Answer = (EditText) findViewById(R.id.Q7_A);
        for (String string7Answers : q7Answers)
            if (question7Answer.getText().toString().equals(string7Answers))
                totalScore += +1;

        //Question 8 answer method
        RadioButton q8Answer = (RadioButton) findViewById(R.id.Q8_3);
        boolean question8Answer = q8Answer.isChecked();
        if (question8Answer)
            totalScore += +1;

        //Displays the total score
        if ((totalScore > 6) && (totalScore < 8)) {
            Toast toast = Toast.makeText(getApplicationContext(), (getString(R.string.more_Than_6_Points)) + " " + totalScore + " out of 8", Toast.LENGTH_LONG);
            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        }
        if (totalScore < 6) {
            Toast toast = Toast.makeText(getApplicationContext(), (getString(R.string.less_Than_6_Points)) + " " + totalScore + " out of 8", Toast.LENGTH_LONG);
            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        }
        if (totalScore == 8) {
            Toast toast = Toast.makeText(getApplicationContext(), (getString(R.string.perfect_Score)) + " " + totalScore + " out of 8. " + (getString(R.string.perfect_Score_Suffix)), Toast.LENGTH_LONG);
            toast.show();
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        }
    }

    //Resets all user entries and view to top.
    public void clearAnswers(View view) {
        QuestionThreeOne.setChecked(false);
        QuestionThreeTwo.setChecked(false);
        QuestionThreeThree.setChecked(false);
        QuestionThreeFour.setChecked(false);
        QuestionSixOne.setChecked(false);
        QuestionSixTwo.setChecked(false);
        QuestionSixThree.setChecked(false);
        QuestionSixFour.setChecked(false);
        QuestionEightOne.setChecked(false);
        QuestionEightTwo.setChecked(false);
        QuestionEightThree.setChecked(false);
        QuestionEightFour.setChecked(false);
        CheckBox q2_1AnswersShips = (CheckBox) findViewById(R.id.Q2_1);
        q2_1AnswersShips.setChecked(false);
        CheckBox q2_2AnswersShips = (CheckBox) findViewById(R.id.Q2_2);
        q2_2AnswersShips.setChecked(false);
        CheckBox q2_3AnswersShips = (CheckBox) findViewById(R.id.Q2_3);
        q2_3AnswersShips.setChecked(false);
        CheckBox q2_4AnswersShips = (CheckBox) findViewById(R.id.Q2_4);
        q2_4AnswersShips.setChecked(false);
        CheckBox q2_5AnswersName = (CheckBox) findViewById(R.id.Q2_5);
        q2_5AnswersName.setChecked(false);
        CheckBox q2_6AnswersName = (CheckBox) findViewById(R.id.Q2_6);
        q2_6AnswersName.setChecked(false);
        CheckBox q2_7AnswersName = (CheckBox) findViewById(R.id.Q2_7);
        q2_7AnswersName.setChecked(false);
        CheckBox q2_8AnswersName = (CheckBox) findViewById(R.id.Q2_8);
        q2_8AnswersName.setChecked(false);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setSelection(0);
        EditText question1 = (EditText) findViewById(R.id.Q1_A);
        question1.setText("");
        EditText question5 = (EditText) findViewById(R.id.Q5_A);
        question5.setText("");
        EditText question7 = (EditText) findViewById(R.id.Q7_A);
        question7.setText("");
        ScrollView sView = (ScrollView) findViewById(R.id.scrollView1);
        sView.fullScroll(ScrollView.FOCUS_UP);


    }
}


