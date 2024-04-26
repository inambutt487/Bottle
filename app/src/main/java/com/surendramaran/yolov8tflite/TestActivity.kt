package com.surendramaran.yolov8tflite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ShareCompat.IntentBuilder
import com.example.yolov8application.R
import com.example.yolov8application.databinding.ActivityMainBinding
import com.example.yolov8application.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener {
            startActivity(Intent(this@TestActivity, MainActivity::class.java))
        }
    }
}