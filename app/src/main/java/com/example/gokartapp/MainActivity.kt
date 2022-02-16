package com.example.gokartapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
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

    }
}

