package com.example.learn_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveActivityData : AppCompatActivity() {
    public lateinit var moveActivityData: TextView

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_data)

        moveActivityData = findViewById(R.id.move_activity_data)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "\nName: $name, \nYour Age: $age"

        moveActivityData.text = text

    }
}