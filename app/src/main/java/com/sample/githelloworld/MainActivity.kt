package com.sample.githelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("GTM","onCreate api called")
        findViewById<TextView>(R.id.sectv1).setOnClickListener{
            Toast.makeText(this,"GTM second master commit",Toast.LENGTH_LONG).show()
        }
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