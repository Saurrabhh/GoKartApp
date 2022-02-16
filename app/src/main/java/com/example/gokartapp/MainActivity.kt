package com.example.gokartapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.toDrawable
import com.example.gokartapp.databinding.ActivityMainBinding
import com.github.anastr.speedviewlib.Gauge
import com.github.anastr.speedviewlib.ImageSpeedometer
import com.github.anastr.speedviewlib.SpeedView
import com.github.anastr.speedviewlib.components.indicators.ImageIndicator
import java.util.*
import kotlin.concurrent.timerTask
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val drawable = AppCompatResources.getDrawable(this, R.drawable.pinnn1)

        val imageIndicator = drawable?.let { ImageIndicator(applicationContext, it) }


        val speedo1 = binding.speedo1
        val speedo2 = binding.speedo2
        if (imageIndicator != null) {
            speedo1.indicator = imageIndicator
            speedo2.indicator = imageIndicator
        }
        speedo1.speedTo(50F, 1000)
        speedo2.speedTo(100F, 1000)

//        val btn = findViewById<Button>(R.id.btn)
        val num1 = findViewById<TextView>(R.id.rad1)
        val num2 = findViewById<TextView>(R.id.rad2)
        val num3 = findViewById<TextView>(R.id.rad3)

        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                //Call your function here
                val number1 = Random.nextInt(18,40)
                val number2 = Random.nextInt(18,40)
                val number3 = Random.nextInt(18,40)
                num1.text = number1.toString()
                num2.text = number3.toString()
                num3.text = number2.toString()
                handler.postDelayed(this, 500)//1 sec delay
            }
        }, 0)

    }
}

