package com.example.enpit_p38.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import npaka.net.helloandroid.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapHere.setOnClickListener{
            textView.text = "ボタンがタップされました"
        }
    }
}
