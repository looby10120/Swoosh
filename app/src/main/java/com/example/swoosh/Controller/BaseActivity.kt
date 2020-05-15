package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(com.example.swoosh.Utilities.TAG, "${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(com.example.swoosh.Utilities.TAG, "${javaClass.simpleName} OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(com.example.swoosh.Utilities.TAG, "${javaClass.simpleName} onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(com.example.swoosh.Utilities.TAG, "${javaClass.simpleName} onRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(com.example.swoosh.Utilities.TAG, "${javaClass.simpleName} onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(com.example.swoosh.Utilities.TAG, "${javaClass.simpleName} onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(com.example.swoosh.Utilities.TAG, "${javaClass.simpleName} onDestroy")
        super.onDestroy()
    }
}
