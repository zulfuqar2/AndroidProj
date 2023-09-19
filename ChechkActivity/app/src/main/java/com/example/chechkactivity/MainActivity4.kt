package com.example.chechkactivity

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
