package com.example.chechkactivity

import Adapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.chechkactivity.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private  lateinit var binding: ActivityMain3Binding
    private val adapter=Adapter(this )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()




        binding.inup.setOnClickListener(){


            val intent=Intent(this@MainActivity3,MainActivity4::class.java)
            startActivity(intent)




        }
        binding.tab.setOnClickListener{
            val intent =Intent(this@MainActivity3,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
        binding.tr.setOnClickListener{
            val intent =Intent(this@MainActivity3,MainActivity6::class.java)
            startActivity(intent)
            finish()
        }
        binding.hm.setOnClickListener {
            Toast.makeText(applicationContext,"You Almost  Here ", Toast.LENGTH_SHORT).show()
        }




    }


    private  fun setup(){




        binding.vrProduct.layoutManager=GridLayoutManager(this,7)
        binding.vrProduct.adapter=adapter
        val week= listOf(
            "Bazar ertəsi",
            "Çərşənbə axşamı",
            "Çərşənbə",
            "Cümə Axşamı",
            "Cümə",
            "Şənbə",
            "Bazar",




            )

        adapter.updateAdapter(week)


    }
//    private fun setup2(){
//
//
//
//
//    }



}