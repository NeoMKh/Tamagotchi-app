package com.example.mytamagotchigame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ActionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions)

        val feedButton = findViewById<Button>(R.id.feedButton)
        val washButton = findViewById<Button>(R.id.washButton)
        val playButton = findViewById<Button>(R.id.playButton)
        val feedView = findViewById<TextView>(R.id.feedView)
        val washView = findViewById<TextView>(R.id.washView)
        val playView = findViewById<TextView>(R.id.playView)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)



        feedButton.setOnClickListener { imageView2.setImageResource(R.drawable.feeding_dog)
        feedView.text = (feedView.text.toString().toInt() + 1).toString()
        }
        washButton.setOnClickListener {
            imageView2.setImageResource(R.drawable.washing_dog)
            washView.text = (washView.text.toString().toInt() + 1).toString()
        }

         playButton.setOnClickListener { imageView2.setImageResource(R.drawable.playing_dog)
         playView.text= (washView.text.toString().toInt() + 1).toString()
         }



    }
}