package com.example.suwaczkirobiabrrrrr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt = findViewById<Button>(R.id.button)
        val im1 = findViewById<ImageView>(R.id.imageView)
        val im2 = findViewById<ImageView>(R.id.imageView2)
        val im3 = findViewById<ImageView>(R.id.imageView3)

        bt.setOnClickListener {
            im1.scaleX = 1.toFloat()
            im1.scaleY = 1.toFloat()
            im2.scaleX = 1.toFloat()
            im2.scaleY = 1.toFloat()
            im3.scaleX = 1.toFloat()
            im3.scaleY = 1.toFloat()
        }
    }
}