package com.example.inclassassignment03_thomass;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    long digit = 0; //set at zero
   TextView displayName;
    int num;

    // global variables to hold value in each conditional

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayName = findViewById(R.id.total_text_view); //id is called
        Toast.makeText(MainActivity.this, "Thank You, Professor Ashley!",Toast.LENGTH_LONG).show();

    }


    public void display(View view) { // method
        Button mrButton = (Button) view; // localized button

        if (mrButton.getText().equals("1")) { //if the text is 1 than this first conditional statement will be executed
            num = Integer.parseInt(displayName.getText().toString()); // The parse converts the String value from the TextView id into an integer
            digit = digit * 10 + 1; //number is zero the converted String to integer can now become 1
            displayName.setText(String.valueOf(digit)); //integer in String
            Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("2")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 2;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("3")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 3;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Three", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("4")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 4;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Four", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("5")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 5;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Five", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("6")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 6;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Six", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("7")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 7;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Seven", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("8")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 8;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Eight", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("9")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10 + 9;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Nine", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("C")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = 0;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Clear", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("delete")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit / 10;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Delete", Toast.LENGTH_SHORT).show();
        } else if (mrButton.getText().equals("0")) {
            num = Integer.parseInt(displayName.getText().toString()); //getting the text value
            digit = digit * 10;
            displayName.setText(String.valueOf(digit));
            Toast.makeText(MainActivity.this, "Zero", Toast.LENGTH_SHORT).show();
        }

    }

    //  TextView one = (TextView) findViewById(R.id.one);

    //Button result = (Button) findViewById(R.id.del);


    // if (quantityTextView.getText().equals(0));
    //  quantityTextView.setText(Integer.valueOf("" + number + quantityTextView));
    // for (int i = 0; number > 0; i++);

    //     one.setText(String.valueOf(one));


}


//TextView quantityTextView2 = (TextView) findViewById(R.id.total_text_view);
// quantityTextView2.setText(Integer.parseInt("" + number));

//  int num = Integer.parseInt(quantityTextView.getText().toString());
// quantityTextView.setText(String.valueOf(num));
//quantityTextView.setText(String.valueOf("" + number));
//  quantityTextView.setText(String.valueOf("" + num));


// TextView second = (TextView) findViewById(R.id.total_text_view);


    /*    if (quantityTextView.getText().equals("7")) {
            num = Integer.parseInt(.getText().toString());
            quantityTextView.setText(String.valueOf(num));
*/




/*

    }
        private TextView mTextView;
    private static final String TAG = "Quiz Activity";
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }



    //private Question[] mQuestionBank = new Question[] {
  // new Question
   // }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();

            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() { //parameter is View.onClickListener in the method
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show(); // THe name of the class, then .this method, string value

            }
        });

*/
