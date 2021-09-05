package com.sample.githelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("GTM","Initial Logs")
    }

    override fun onPause() {
        super.onPause()
        Log.e("GTM","onPause")
    }
}