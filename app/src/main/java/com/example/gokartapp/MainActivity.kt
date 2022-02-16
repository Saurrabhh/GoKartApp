package com.example.gokartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.gokartapp.databinding.ActivityMainBinding
import com.github.anastr.speedviewlib.Gauge
import com.github.anastr.speedviewlib.SpeedView
import java.util.*
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val speedo1 = binding.speedo1
        val speedo2 = binding.speedo2
        speedo1.speedTo(50F, 1000)
        speedo2.speedTo(100F, 1000)
//        speedo1.onSpeedChangeListener = { gauge: Gauge, isSpeedUp: Boolean, isByTremble: Boolean ->
//
//            Handler().postDelayed({
//                val speed = (0..200).random().toFloat()
//                Toast.makeText(this, speed.toString(), Toast.LENGTH_SHORT).show()
//                speedo1.speedTo( speed, 500)
//
//            }, 5000)
//
//
//
//        }
    }
}