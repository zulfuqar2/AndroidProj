package com.example.chechkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chechkactivity.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enter.setOnClickListener {
            Add()
        }

        binding.exit.setOnClickListener {
            exit()
        }
        binding.homelogin.setOnClickListener {

            val intent=Intent(this@MainActivity4,MainActivity3::class.java)
            startActivity(intent)
            finish()

        }
        binding.translate.setOnClickListener {
            val intent=Intent(this@MainActivity4,MainActivity6::class.java)
            startActivity(intent)
            finish()


        }
        binding.enterexit.setOnClickListener {
            Toast.makeText(applicationContext,"You now here ",Toast.LENGTH_SHORT).show()
        }
        binding.cedvel2.setOnClickListener {

            val inent=Intent(this@MainActivity4,MainActivity5::class.java)
            startActivity(intent)
            finish()

        }

    }

    private fun Add() {
        val enterName = binding.entername.text.toString()
        val enterTime = binding.enterclock.text.toString()

        if (enterName.isEmpty() || enterTime.isEmpty()) {
            Toast.makeText(this@MainActivity4, "Please Fill correct Name or Time", Toast.LENGTH_SHORT).show()
        } else {
            binding.firsname.text = enterName
            binding.firstime.text = enterTime
        }
    }

    private fun exit() {
        val nameex = binding.exitname.text.toString()
        val exitClock = binding.timeExit.text.toString()

        if (nameex.isEmpty() || exitClock.isEmpty()) {
            Toast.makeText(this@MainActivity4, "Please Fill correct Name or Time", Toast.LENGTH_SHORT).show()
        } else {
            binding.nameExit.text = nameex
            binding.timeExit.text = exitClock
        }
    }
}
