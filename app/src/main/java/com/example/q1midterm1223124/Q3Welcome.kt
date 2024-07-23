package com.example.q1midterm1223124

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Q3Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_q3_welcome)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1: Button = findViewById(R.id.homebtn)

        val bundle: Bundle?=intent.extras

        bundle?.let{
            val message = bundle.getString("key")
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()
        }


        btn1.setOnClickListener{
            val intent = Intent(this,Q2::class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.calcbtn)


        btn2.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}