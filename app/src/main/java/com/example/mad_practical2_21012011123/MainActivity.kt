package com.example.mad_practical2_21012011123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("on Create method is called.")
    }

    override fun onStart() {
        super.onStart()
        showMessage("On Start method is called.")
    }

    override fun onResume() {
        super.onResume()
        showMessage("On Resume method is called.")
    }
    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}