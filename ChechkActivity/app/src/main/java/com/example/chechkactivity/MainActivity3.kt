package com.example.chechkactivity

import Adapter
import android.animation.AnimatorInflater
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.ViewCompat
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
        setImageViewClickListeners()




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
        val data= listOf(
            WeekData(
                25,"Bazar Ertəsi  "
            ),
            WeekData(
                26,"Çərşənbə"
            ),
            WeekData(
                27,"Çərşənbə axşamı"
            ),
            WeekData(
                28,"Cümə Axşamı "
            ),
            WeekData(
                29,"Cümə"
            ),
            WeekData(
                30,"Şənbə "
            ),
            WeekData(
                1,"Bazar "
            ),

            )

        adapter.updateAdapter(data)


    }

    private fun setImageViewClickListeners() {
        val animDuration = 500 // Animasyon süresi (milisaniye cinsinden)

        setImageViewClickListener(binding.hm, animDuration)
        setImageViewClickListener(binding.inup, animDuration)
        setImageViewClickListener(binding.tab, animDuration)
        setImageViewClickListener(binding.tr, animDuration)
    }

    @SuppressLint("ResourceType")
    private fun setImageViewClickListener(imageView: ImageView, animDuration: Int) {
        imageView.setOnClickListener {
            val fadeIn = AnimatorInflater.loadAnimator(this, R.anim.fade_in)
            fadeIn.duration = animDuration.toLong()
            fadeIn.setTarget(imageView)
            fadeIn.start()

            // 5 saniye sonra arka plan rengini sıfırla
            imageView.postDelayed({
                ViewCompat.setBackground(imageView, null)
            }, 5000)

            // Diğer ImageView'lere tıklama işlemleri burada devam edebilir...
        }
    }


}