package com.example.chechkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chechkactivity.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private  lateinit var binding: ActivityMain3Binding
    private val adapter=Adapter()
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
            val intent =Intent(this@MainActivity3,MainActivity5::class.java)
            startActivity(intent)
            finish()
        }




    }


    private  fun setup(){

        binding.vrProduct.layoutManager=GridLayoutManager(this,3)
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
        val days= listOf(
            "01",
            "02",
            "03",
            "04",
            "05",
            "06",
            "07"

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