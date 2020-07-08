package com.example.sampleintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //ボタン押下
    fun onButtonTapped(view: View?) {
        val intent = Intent(this, SubActivity::class.java)

        //値を渡す
        intent.putExtra("message_key","Hello from MainActivity.")

        //インテントを開始
        startActivity(intent)
    }
}