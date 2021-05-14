package com.ali.clquestion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //new line
        //fana raft
        //123
    }
    fun myFunction() {
        Log.v("TAG1", "Hi Ali")
        Log.v("TAG1", "test3")
    }
}
