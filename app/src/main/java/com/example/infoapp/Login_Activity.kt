package com.example.infoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_)

        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.emailET)
        val password = findViewById<TextInputEditText>(R.id.passwordET)
        val signInButton = findViewById<MaterialButton>(R.id.next_button)

        signInButton.setOnClickListener{
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_LONG).show()
            } else {
                if (email.toString() == "Saysayali@gmail.com" && password.toString() == "awesomeness") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}