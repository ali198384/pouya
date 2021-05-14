package com.ali.clquestion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.map.servicesdk.MapService
import ir.map.servicesdk.ResponseListener
import ir.map.servicesdk.model.base.MapirError
import ir.map.servicesdk.response.ReverseGeoCodeResponse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}