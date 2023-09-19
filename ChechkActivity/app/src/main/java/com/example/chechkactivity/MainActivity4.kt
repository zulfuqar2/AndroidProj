package com.example.chechkactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chechkactivity.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding:ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)



        Add()
        exit()



    }
    private fun Add() {
        val enterName = binding.entername.text.toString()
        val enterTime = binding.enterclock.text.toString()


        binding.enter.setOnClickListener {
            if (enterName.isEmpty() || enterTime.isEmpty()) {
                Toast.makeText(applicationContext, "Please Fill correct Name or Time", Toast.LENGTH_SHORT).show()
            } else {
                binding.firsname.text = enterName
                binding.firstime.text = enterTime
            }
        }
    }

    private fun exit(){
        val exitName=binding.exitname.text.toString()
        val exitClock=binding.exitTime.text.toString()


        if(exitName.isEmpty()||exitClock.isEmpty()){
            Toast.makeText(applicationContext, "Please Fill correct Name or Time", Toast.LENGTH_SHORT).show()
        }
        else{
            binding.nameExit.text=exitName
            binding.timeExit.text=exitClock
        }




    }



}