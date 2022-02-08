package com.example.gokartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.gokartapp.databinding.ActivityMainBinding
import com.github.anastr.speedviewlib.SpeedView
import java.util.*
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val speedo = binding.speedo1

        binding.btn.setOnClickListener{
            val t = binding.speed.text.toString()
            speedo.speedTo(t.toFloat(), 2000)
        }

        binding.rdmbtn.setOnClickListener {

            if (speedo.currentIntSpeed == 0) {
                speedo.speedTo(100F, 2000)
            }
            else{
                speedo.speedTo(0F, 2000)
            }
        }
    }
}