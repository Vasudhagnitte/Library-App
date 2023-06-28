package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class rating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
        val rBar = findViewById<RatingBar>(R.id.rBar)
        val rBar2=findViewById<RatingBar>(R.id.ratingBar2)
        if (rBar != null) {
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                val msg = rBar.rating.toString()
                Toast.makeText(this@rating, "Rating is: "+msg, Toast.LENGTH_SHORT).show()
            }
        }
        if (rBar2 != null) {
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                val msg = rBar.rating.toString()
                Toast.makeText(this@rating, "Rating is: "+msg, Toast.LENGTH_SHORT).show()
            }
        }

    }
}