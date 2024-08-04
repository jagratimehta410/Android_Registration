package com.example.lecture2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
     lateinit var welcomeTextView: TextView
     lateinit var nameTextView: TextView
     lateinit var ageTextView: TextView
    lateinit var cityTextView: TextView
     lateinit var usernameTextView: TextView
     lateinit var passwordTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        welcomeTextView = findViewById(R.id.welcometext)
        nameTextView = findViewById(R.id.name)
        ageTextView = findViewById(R.id.age)
        cityTextView = findViewById(R.id.city)
        usernameTextView = findViewById(R.id.username)
        passwordTextView = findViewById(R.id.pass)

        val password = intent.getStringExtra("password")
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val city = intent.getStringExtra("city")
        val username = intent.getStringExtra("username")

        val welcomeMessage = "Welcome, $name"
        welcomeTextView.text = welcomeMessage

        nameTextView.text = "Name: $name"
        ageTextView.text = "Age: $age"
        cityTextView.text = "City: $city"
        usernameTextView.text = "Username: $username"
        passwordTextView.text = "Password: $password"
    }
}