package com.example.sampleintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        //渡された値を取り出す
        val message = intent.getStringExtra("message_key")

        //画面に表示
        //「textView」はID名
        textView.text = message
    }

    fun onButtonTapped(view: View?) {
        //インテントを終了する
        finish()
    }
}