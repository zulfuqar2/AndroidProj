package com.example.chechkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chechkactivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {

            val name = binding.name.text.toString()
            val password = binding.Password.text.toString()

            if (password.length < 6 || name.isEmpty()) {
                Toast.makeText(
                    this@MainActivity2,
                    "Please check Password or name ",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }
}
