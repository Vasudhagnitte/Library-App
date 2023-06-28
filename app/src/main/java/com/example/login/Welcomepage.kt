package com.example.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.VideoView
import com.google.android.material.chip.Chip

class Welcomepage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcomepage)
        var ch:Chip=findViewById(R.id.chip5)
        var tv:TextView=findViewById(R.id.textView2)
        val usn=intent.getStringExtra("username")
        tv.text=usn+"!!";
       ch.setOnClickListener {
           intent = Intent(this, dashboard::class.java)
           startActivity(intent)
       }


    }

    }
