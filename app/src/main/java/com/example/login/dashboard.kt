package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView



class dashboard : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)




        val drawerLayout:DrawerLayout=findViewById(R.id.dl)
        val navView:NavigationView=findViewById(R.id.nav_view)

        toggle= ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.home -> startActivity(Intent(this ,Welcomepage::class.java))
                R.id.login ->  startActivity(Intent(this ,MainActivity::class.java))
                R.id.Bookmarks -> Log.d("hello", "Bookmarks ")
                R.id.Settings -> Log.d("hello", "Settings")
                R.id.Ratings-> startActivity(Intent(this ,rating::class.java))
                R.id.Logout -> Log.d("hello", "Logout")
            }
            true
        }
        val cd1:CardView = findViewById(R.id.c1)
        cd1.setOnClickListener{
            intent = Intent(this, cprogram::class.java)
            startActivity(intent)
        }
        val cd2:CardView = findViewById(R.id.fic)
        cd2.setOnClickListener{
            //Toast.makeText(this,"clicked it ",Toast.LENGTH_SHORT).show()
            Log.d("hello", "fiction working")
        }
        val cd3:CardView = findViewById(R.id.bio)
        cd3.setOnClickListener{
            //Toast.makeText(this,"clicked it ",Toast.LENGTH_SHORT).show()
            Log.d("hello", "bio working")
        }
        val cd4:CardView = findViewById(R.id.stov)
        cd4.setOnClickListener{
            //Toast.makeText(this,"clicked it ",Toast.LENGTH_SHORT).show()
            Log.d("hello", "stories working")
        }
        val cd5:CardView = findViewById(R.id.mann)
        cd5.setOnClickListener{
            //Toast.makeText(this,"clicked it ",Toast.LENGTH_SHORT).show()
            Log.d("hello", "manga working")
        }
        val cd6:CardView = findViewById(R.id.nov)
        cd6.setOnClickListener{
            //Toast.makeText(this,"clicked it ",Toast.LENGTH_SHORT).show()
            Log.d("hello", "novel working")
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}