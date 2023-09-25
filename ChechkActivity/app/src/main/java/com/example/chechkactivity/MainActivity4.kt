package com.example.chechkactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.chechkactivity.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    private var enterName: String = ""
    private var enterTime: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enter.setOnClickListener {
            enterName = binding.entername.text.toString()
            enterTime = binding.enterclock.text.toString()

            if (enterName.isEmpty() || enterTime.isEmpty()) {
                Toast.makeText(
                    this@MainActivity4,
                    "Please Fill correct Name or Time",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val builder = AlertDialog.Builder(this@MainActivity4)
                builder.setTitle("Əminsinizmi?")
                builder.setMessage("Dəyişiklikləri yadda saxlamağ istədiyinizə əminsinizmi?")

                builder.setPositiveButton("Bəli") { dialog, which ->
                    // Kullanıcı "Evet"i seçtiğinde buradaki kod çalışır
                    binding.firsname.text = enterName
                    binding.firstime.text = enterTime
                    dialog.dismiss() // Dialog penceresini kapat
                }

                builder.setNegativeButton("Xeyir") { dialog, which ->

                    dialog.dismiss()
                }

                val dialog = builder.create()
                dialog.show()
            }
        }


        binding.exit.setOnClickListener {
            val nameex = binding.exitname.text.toString()
            val exitClock = binding.timeExit.text.toString()

            if (nameex.isEmpty() || exitClock.isEmpty()) {
                Toast.makeText(
                    this@MainActivity4,
                    "Please Fill correct Name or Time",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val entry = "Name : $nameex  "
                val clockk = "$exitClock"
                binding.nameExit.text = entry
                binding.timeExit.text = clockk

                // Clear enterName and enterTime
                enterName = ""
                enterTime = ""
                binding.entername.text.clear()
                binding.enterclock.text.clear()
            }
        }

        binding.trans.setOnClickListener {
            val intent = Intent(this@MainActivity4, MainActivity6::class.java)
            startActivity(intent)
            finish()
        }

        binding.backhm.setOnClickListener {
            val intent = Intent(this@MainActivity4, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }

        binding.excel.setOnClickListener {
            val intent = Intent(this@MainActivity4, MainActivity5::class.java)
            startActivity(intent)
            finish()
        }

        binding.almost.setOnClickListener {
            Toast.makeText(applicationContext, "You Almost Here", Toast.LENGTH_SHORT).show()
        }
    }
}









//package com.example.chechkactivity
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Toast
//import com.example.chechkactivity.databinding.ActivityMain4Binding
//
//class MainActivity4 : AppCompatActivity() {
//    private lateinit var binding: ActivityMain4Binding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMain4Binding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.enter.setOnClickListener {
//            val enterName = binding.entername.text.toString()
//            val enterTime = binding.enterclock.text.toString()
//
//            if (enterName.isEmpty() || enterTime.isEmpty()) {
//                Toast.makeText(
//                    this@MainActivity4,
//                    "Please Fill correct Name or Time",
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else {
//                binding.firsname.text = enterName
//                binding.firstime.text = enterTime
//
//            }
//        }
//
//        binding.exit.setOnClickListener {
//            val nameex = binding.exitname.text.toString()
//            val exitClock = binding.timeExit.text.toString()
//
//            if (nameex.isEmpty() || exitClock.isEmpty()) {
//                Toast.makeText(
//                    this@MainActivity4,
//                    "Please Fill correct Name or Time",
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else {
//               val entry ="Name :$nameex  "
//                val clockk="$exitClock"
//                binding.nameExit.text=entry
//                binding.timeExit.text=clockk
//
//            }
//
//        }
//        binding.trans.setOnClickListener {
//            val intent = Intent(this@MainActivity4, MainActivity6::class.java)
//            startActivity(intent)
//            finish()
//        }
//        binding.backhm.setOnClickListener {
//            val intent = Intent(this@MainActivity4, MainActivity3::class.java)
//            startActivity(intent)
//            finish()
//        }
//        binding.excel.setOnClickListener {
//            val intent = Intent(this@MainActivity4, MainActivity5::class.java)
//            startActivity(intent)
//            finish()
////
//        }
//        binding.almost.setOnClickListener {
//                Toast.makeText(applicationContext,"You Almost Here",Toast.LENGTH_SHORT).show()
//        }
//
//
//    }
//}
