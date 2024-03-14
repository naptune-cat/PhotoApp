package com.example.photoframeapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
     var currentImage = 0
    lateinit var image : ImageView
    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val prevBtn = findViewById<ImageButton>(R.id.prev)
        val nextBtn = findViewById<ImageButton>(R.id.nextImg)
        prevBtn.setOnClickListener {
            val idCurrentImage = "pic$currentImage"
            //converting id from string to int address
            val idCurrentInt =this.resources.getIdentifier(idCurrentImage,"id",packageName)
            image=findViewById(idCurrentInt)
            image.alpha = 0f

            currentImage=(4+currentImage-1)%4
            val idImageToShow = "pic$currentImage"
            //converting id from string to int address
            val idShowInt =this.resources.getIdentifier(idImageToShow,"id",packageName)
            image=findViewById(idShowInt)
            image.alpha = 1f
        }
        nextBtn.setOnClickListener {
            val idCurrentImage = "pic$currentImage"
            //converting id from string to int address
            val idCurrentInt =this.resources.getIdentifier(idCurrentImage,"id",packageName)
            image=findViewById(idCurrentInt)
            image.alpha = 0f
        //alpha is used to set transparency of image or any other object
            currentImage=(4+currentImage+1)%4
            val idImageToShow = "pic$currentImage"
            //converting id from string to int address
            val idShowInt =this.resources.getIdentifier(idImageToShow,"id",packageName)
            image=findViewById(idShowInt)
            image.alpha = 1f
        }
        }
    }
