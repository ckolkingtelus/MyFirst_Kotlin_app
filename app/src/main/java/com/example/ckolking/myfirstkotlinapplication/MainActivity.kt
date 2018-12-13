package com.example.ckolking.myfirstkotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

//    TextView textView = new TextView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Numbers = listOf( 1, 3, 4)
        println( "CEK - These are my numbers: " + Numbers.toString() )
    }
}
