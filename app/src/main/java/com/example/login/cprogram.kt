package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class cprogram : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cprogram)
        var t1:ImageButton=findViewById(R.id.imageButton);
        t1.setOnClickListener {
            intent = Intent(this,cbookmain::class.java)
            startActivity(intent)
        }


    }
}