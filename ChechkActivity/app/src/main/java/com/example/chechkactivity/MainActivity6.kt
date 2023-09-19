package com.example.chechkactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chechkactivity.databinding.ActivityMain5Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}