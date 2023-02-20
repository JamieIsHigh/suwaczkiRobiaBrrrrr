package com.example.suwaczkirobiabrrrrr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt = findViewById<Button>(R.id.button)
        val im1 = findViewById<ImageView>(R.id.imageView)
        val im2 = findViewById<ImageView>(R.id.imageView2)
        val im3 = findViewById<ImageView>(R.id.imageView3)
        val s1X = findViewById<SeekBar>(R.id.seekBar)
        val s1Y = findViewById<SeekBar>(R.id.seekBar6)
        val s2X = findViewById<SeekBar>(R.id.seekBar3)
        val s2Y = findViewById<SeekBar>(R.id.seekBar7)
        val s3X = findViewById<SeekBar>(R.id.seekBar4)
        val s3Y = findViewById<SeekBar>(R.id.seekBar8)

        s1X.progress = 100
        s1Y.progress = 100
        s2X.progress = 100
        s2Y.progress = 100
        s3X.progress = 100
        s3Y.progress = 100

        bt.setOnClickListener {
            im1.scaleX = 1.toFloat()
            im1.scaleY = 1.toFloat()
            im2.scaleX = 1.toFloat()
            im2.scaleY = 1.toFloat()
            im3.scaleX = 1.toFloat()
            im3.scaleY = 1.toFloat()

            s1X.progress = 100
            s1Y.progress = 100
            s2X.progress = 100
            s2Y.progress = 100
            s3X.progress = 100
            s3Y.progress = 100
        }
        s1X?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged( seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                im1.scaleX = progress.toFloat() / 100;
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
        s1Y?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged( seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                im1.scaleY = progress.toFloat() / 100;
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
        s2X?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged( seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                im2.scaleX = progress.toFloat() / 100;
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
        s2Y?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged( seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                im2.scaleY = progress.toFloat() / 100;
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
        s3X?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged( seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                im3.scaleX = progress.toFloat() / 100;
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
        s3Y?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged( seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                im3.scaleY = progress.toFloat() / 100;
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
    }
}