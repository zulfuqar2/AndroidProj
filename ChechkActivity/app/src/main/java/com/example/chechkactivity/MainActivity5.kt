package com.example.chechkactivity
import android.widget.ImageView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.chechkactivity.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)




        val imageViews = arrayOf<ImageView>(
            binding.imageView18, binding.imageView19
        )

        for (imageView in imageViews) {
            imageView.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View?) {

                    if (imageView.visibility == View.INVISIBLE) {
                        imageView.visibility = View.VISIBLE
                    } else {
                        imageView.visibility = View.INVISIBLE
                    }
                }
            })
        }

//         binding.bagca3.setOnClickListener(object : View.OnClickListener {
//
//         })




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

        binding.tesdiq.setOnClickListener {
           Toast.makeText(applicationContext,"This Function Coming soon ",Toast.LENGTH_SHORT).show()

        }






    }




}