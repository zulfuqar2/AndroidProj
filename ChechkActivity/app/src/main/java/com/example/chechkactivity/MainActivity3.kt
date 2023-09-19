package com.example.chechkactivity

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

    }


    private  fun setup(){

        binding.vrProduct.layoutManager=GridLayoutManager(this,1)
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


}