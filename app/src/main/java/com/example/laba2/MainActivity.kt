package com.example.laba2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val katet1Text = katet1.text.toString()
            val katet2Text = katet2.text.toString()

            if (katet1Text != "" && katet2Text != "") {
                val katet1Value = katet1Text.toDouble()
                val katet2Value = katet2Text.toDouble()

                answer.text = sqrt(katet1Value.pow(2) + katet2Value.pow(2)).toString()
            } else {
                answer.text = "Заполните все поля!"
            }
        }
    }
}