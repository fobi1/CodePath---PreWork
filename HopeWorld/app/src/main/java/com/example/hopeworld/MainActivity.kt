package com.example.hopeworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


// This is a Kotlin file (.kt)
//This is what we're going to use to handle user interaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //this line shows us the layout file activity_main
        //this is how the activity_main.xml and the MainActivity.kt kotlin file are connected
        setContentView(R.layout.activity_main)

        //Display customized text to show 'Hello from {name}'
        //Change background color
        //Implement feature that allows user to tap button to change color of text
            //1. Add button to our layout
            //2. Set up logic to know when user has tapped button

        //gets reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Anything that we write within these brackets is what is going
            //to happen once the button is clicked
            //We want to change the color of the text when the button is tapped
            Log.i("Faith","Tapped on Button")
            //2.1 Change color of text when they have tapped button
                //Get reference to the text view
                //Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_500))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("FMO", "Tapped on button2")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.teal_700))

        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("FMOB", "Tapped on button3")
            val simpleEditText = findViewById<EditText>(R.id.et_simple)
            val strValue = simpleEditText.getText().toString();
            findViewById<TextView>(R.id.textView).text = strValue
        }

        }
}