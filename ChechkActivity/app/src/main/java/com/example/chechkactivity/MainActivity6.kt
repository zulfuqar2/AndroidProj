package com.example.chechkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chechkactivity.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.hometr.setOnClickListener {
            val intent=Intent(this@MainActivity6,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
        binding.cedveltr.setOnClickListener {
            val intent=Intent(this@MainActivity6,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.exittr.setOnClickListener {
            val intent=Intent(this@MainActivity6,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
        binding.selftr.setOnClickListener {
  Toast.makeText(applicationContext,"You Almost  Here ",Toast.LENGTH_SHORT).show()

        }



    }

}



