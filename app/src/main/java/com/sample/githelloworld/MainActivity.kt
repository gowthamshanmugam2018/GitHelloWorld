package com.sample.githelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("GTM","onCreate api called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("GTM","onDestroy api called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("GTM","onPause")
    }

    override fun onStop() {
        super.onStop()
    }
}