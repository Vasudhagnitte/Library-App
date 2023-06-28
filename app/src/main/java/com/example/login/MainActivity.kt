package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn: Button = findViewById(R.id.bt)
        var u: EditText = findViewById(R.id.usn)
        var p: EditText = findViewById(R.id.ps)
        var ib: ImageButton = findViewById(R.id.imb)
        btn.setOnClickListener {
            /*  if(u.text.toString()=="vasudha" && p.text.toString()=="12"||
                u.text.toString()=="shreenidhi" && p.text.toString()=="23"||
                u.text.toString()=="shruthi" && p.text.toString()=="45")
            {

                intent = Intent(this, dashboard::class.java)
                startActivity(intent)
            }
            else if(u.text.toString()=="" ||p.text.toString()=="")
            {
                Toast.makeText(applicationContext, "Enter the Credentials properly", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(applicationContext, "Login Fail", Toast.LENGTH_SHORT).show()
            }
        }



    }*/startActivity(Intent(this, Welcomepage::class.java).putExtra("username", u.text.toString()))
        }
    }
}