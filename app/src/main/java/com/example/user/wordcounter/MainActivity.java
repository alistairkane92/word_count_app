package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText userInput;
    private Button calculateWordCount;
    private TextView displayWordCount;
    private TextView displayWordFrequencies;

    private WordCountCalculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new WordCountCalculator();

        userInput = (EditText) findViewById(R.id.userInput);
        calculateWordCount = (Button) findViewById(R.id.calculateWordCount);
        displayWordCount = (TextView) findViewById(R.id.displayWordCount);
        displayWordFrequencies = (TextView) findViewById(R.id.displayWordFrequencies);
    }

    public void onClickCalculateWords(View button){
        String wordTyped = userInput.getText().toString();
        Log.d(getClass().toString(), wordTyped);

        calculator.separateWords(wordTyped);

        String wordCountString = calculator.toString(calculator.getWordCountSize());
        displayWordCount.setText(wordCountString + " words in the sentence");

        String frequenciesString = calculator.wordFrequencies().toString();
        displayWordFrequencies.setText(frequenciesString);



        calculator.clear();
    }


}
