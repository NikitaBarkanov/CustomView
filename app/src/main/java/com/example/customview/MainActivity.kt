package com.example.customview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customview.u.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<StatsView>(R.id.statsView).data = listOf(
            500F, 500F, 500F, 500F
        )
    }
}
