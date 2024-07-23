package com.example.q1midterm1223124

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_q2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var flag: String = "Select"

        val btn: Button = findViewById(R.id.button)

        val spinner : Spinner = findViewById(R.id.spinner)
        val options = arrayOf("Select","Create Account","Log In")
        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long
            ) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        btn.setOnClickListener{

            if (flag=="Create Account") {
                val intent = Intent(this,CreateAccount::class.java)
                startActivity(intent)

            }
            else if(flag=="Log In"){
                val intent = Intent (this,LogIn::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }

    }
}