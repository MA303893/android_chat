package com.myapp.manishsingh.myapplication;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    public static final String CALCULATE_SUM = "Calculate Sum";
    private static final String HALLOWEEN_ORANGE = "#FF7F27";
    TextView textView;
    EditText editText1;
    EditText editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        textView = (TextView) findViewById(R.id.greetings_text_view);
        editText1 = (EditText) findViewById(R.id.num1);
        editText2 = (EditText) findViewById(R.id.num2);
        button = (Button) findViewById(R.id.button);
        button.setText(CALCULATE_SUM);
    }

    public void calculateSum(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(FirstActivity.this);
        builder.setTitle(R.string.hello_dialog);
        try {
            int num1 = Integer.parseInt(editText1.getText().toString());
            int num2 = Integer.parseInt(editText2.getText().toString());
            int sum = num1 + num2;
            String output = "The Sum of " + num1 + " + " + num2 + " is " + sum;
            textView.setText(output);
            builder.setMessage(output);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        } catch (NumberFormatException nfe) {
            textView.setText("Please enter integers only!!");
            builder.setMessage("Please enter integers only!!");
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

    }
}
