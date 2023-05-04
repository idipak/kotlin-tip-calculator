package com.example.tipcalculator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tipcalculator.adapter.ItemAdapter
import com.example.tipcalculator.data.DataSource

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val myDataSet = DataSource().loadAffirmations()

        val recycleView = findViewById<RecyclerView>(R.id.recycler_view)

        recycleView.adapter = ItemAdapter(this, myDataSet)

        recycleView.setHasFixedSize(true)
    }
}