package com.example.customview

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.customview.u.StatsView

class AppActivity: AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.statsView)

        view.data = listOf(
            500F, 500F, 500F, 500F
        )

        view.startAnimation(
            AnimationUtils.loadAnimation(this, R.anim.animation)
        )

        val label = findViewById<TextView>(R.id.label)
        val viewAnim = AnimationUtils.loadAnimation(
            this, R.anim.animation
        ).apply {
          setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                   label.text = "started"
               }

               override fun onAnimationEnd(animation: Animation?) {
                   label.text = "ended"}

                override fun onAnimationRepeat(animation: Animation?) {
                    label.text = "repeat"
                }

            })
        }
    }
}


