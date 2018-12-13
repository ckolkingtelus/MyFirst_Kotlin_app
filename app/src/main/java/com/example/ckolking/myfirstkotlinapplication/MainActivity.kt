package com.example.ckolking.myfirstkotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    TextView textView = new TextView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Numbers = listOf( 1, 3, 4)
        println( "CEK - These are my numbers: " + Numbers.toString() )

//        TextView tvOne = new TextView()
        Log.d("CEK", "failed to do it: Created new TextView 'tvOne'")
    }
}
