package com.example.lecture2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var city: EditText
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var showButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById(R.id.name)
        age=findViewById(R.id.age)
        city=findViewById(R.id.city)
        username=findViewById(R.id.username)
        password=findViewById(R.id.pass)
        showButton=findViewById(R.id.button)

        val email = intent.getStringExtra("email")
        val pass = intent.getStringExtra("password")

        username.setText(email)
        password.setText(pass)

        showButton.setOnClickListener {
            val nameText = name.text.toString()
            val ageText = age.text.toString()
            val cityText = city.text.toString()
            val usernameText = username.text.toString()
            val passwordText = password.text.toString()

            val myIntent = Intent(this@MainActivity,MainActivity2::class.java)
            myIntent.putExtra("name", nameText)
            myIntent.putExtra("age", ageText)
            myIntent.putExtra("city", cityText)
            myIntent.putExtra("username", usernameText)
            myIntent.putExtra("password", passwordText)

            startActivity(myIntent)
            finish()
        }
    }
}