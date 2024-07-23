package com.example.q1midterm1223124

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btadd: Button = findViewById(R.id.btadd)
        val btsub: Button = findViewById(R.id.btsubtract)
        val btdiv: Button = findViewById(R.id.btdivide)
        val btmul: Button = findViewById(R.id.btmultiply)
        val input1: EditText = findViewById(R.id.num1)
        val input2: EditText = findViewById(R.id.num2)
        val result: TextView = findViewById(R.id.resulttv)

        val btn: Button = findViewById(R.id.button5)


        fun sum(a: Int, b: Int): Int {
            return a + b;
        }

        btadd.setOnClickListener{ view ->
            var x: Int = input1.text.toString().toInt()
            var y: Int = input2.text.toString().toInt()
            result.text = sum(x,y).toString()
        }

        fun sub(a: Int, b: Int): Int {
            return a - b;

        }

        btsub.setOnClickListener{ view ->
            var x: Int = input1.text.toString().toInt()
            var y: Int = input2.text.toString().toInt()
            result.text = sub(x,y).toString()

        }

        fun div(a: Int, b: Int): Int {
            return a / b;
        }

        btdiv.setOnClickListener{ view ->
                var x: Int = input1.text.toString().toInt()
                var y: Int = input2.text.toString().toInt()
                result.text = div(x,y).toString()

        }

        fun prod(a: Int, b: Int): Int {
            return a * b;
        }

        btmul.setOnClickListener { view ->
            var x: Int = input1.text.toString().toInt()
            var y: Int = input2.text.toString().toInt()
            result.text = prod(x, y).toString()

        }
        btn.setOnClickListener{
                val intent = Intent(this,Q2::class.java)
                startActivity(intent)
        }


    }

}
