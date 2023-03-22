package com.hexalitics.brushtimer.arcanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.animateButton).setOnClickListener {
            findViewById<CircularProgressView>(R.id.progress).animateProgress()
        }
    }
}