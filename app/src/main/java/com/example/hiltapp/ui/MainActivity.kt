package com.example.hiltapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.example.hiltapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val vm by viewModels<HelloWorldViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.liveData.observe(this) {
            val imageView = findViewById<ImageView>(R.id.imageView)
            Glide
                .with(this)
                .load(it.link)
                .into(imageView)
        }

        vm.getData()
    }
}