package com.radefffactory.randomcardpicker

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var button: Button

    val cardImages: IntArray = intArrayOf(
            R.drawable.alea_1,
            R.drawable.alea_2,
            R.drawable.alea_3,
            R.drawable.alea_4,
            R.drawable.alea_5,
            R.drawable.alea_6

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener {
            val random = Random
            imageView.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }
    }
}