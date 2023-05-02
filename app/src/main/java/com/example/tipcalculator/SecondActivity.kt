package com.example.tipcalculator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tipcalculator.data.DataSource

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView : TextView = findViewById(R.id.textView)

        textView.text = DataSource().loadAffirmations().size.toString()
    }
}