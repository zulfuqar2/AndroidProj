package com.example.chechkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chechkactivity.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.exitced.setOnClickListener {

          val intent=Intent(this@MainActivity5,MainActivity4::class.java)
          startActivity(intent)
          finish()
      }
        binding.trced.setOnClickListener {

            val intent=Intent(this@MainActivity5,MainActivity6::class.java)
            startActivity(intent)
            finish()
        }
        binding.homeced.setOnClickListener {

            val intent=Intent(this@MainActivity5,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }

        binding.tesdiq.setOnClickListener{
            Toast.makeText(applicationContext,"All Changes in the Table are Recorded  ",Toast.LENGTH_SHORT).show()



            val intent=Intent(this@MainActivity5,MainActivity3::class.java)
            startActivity(intent)
            finish()


        }






    }
}