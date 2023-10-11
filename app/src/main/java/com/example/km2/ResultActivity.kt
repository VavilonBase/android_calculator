package com.example.km2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textView = findViewById(R.id.textView)
        var a = intent.getDoubleExtra(MainActivity.RESULT, 0.0)
        textView.text = a.toString()
    }
}