package com.example.chechkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chechkactivity.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity() {
    private lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vievHm.setOnClickListener {
            val intent= Intent(this@MainActivity7,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.vievex.setOnClickListener {
            val intent=Intent(this@MainActivity7,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.vievTable.setOnClickListener {
            val intent=Intent(this@MainActivity7,MainActivity6::class.java)
            startActivity(intent)
            finish()
        }
        binding.vievTr.setOnClickListener {
            val intent=Intent(this@MainActivity7,MainActivity6::class.java)
            startActivity(intent)
            finish()

        }





    }
}