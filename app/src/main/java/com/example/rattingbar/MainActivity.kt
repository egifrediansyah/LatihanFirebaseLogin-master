package com.example.rattingbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn1 : Button
    lateinit var ratingBar: RatingBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1) as Button
        ratingBar = findViewById(R.id.ratingbar) as RatingBar
    }
    fun click(view: View){
        val ratingvalue = ratingBar.rating
        Toast.makeText(this, "Oke Lah Bisa" + ratingvalue,Toast.LENGTH_LONG).show()
    }
}
