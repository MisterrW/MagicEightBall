package com.example.user.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by User on 13/12/2016.
 */
public class EightBall extends AppCompatActivity {
    EditText questionEditText;
    TextView answerText;
    Button shakeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Eightball", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = (EditText)findViewById(R.id.question_text);
        answerText = (TextView)findViewById(R.id.answer_text);
        shakeButton = (Button)findViewById(R.id.shake_button);

        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Answer answer = new Answer();
                Log.d("Eightball", "Shake button pressed");
                String question = questionEditText.getText().toString();
                Log.d("Eightball", "Question " + question);
                String randomAnswer = answer.getAnswer();
                answerText.setText(randomAnswer);
            }

        });
    }
}
