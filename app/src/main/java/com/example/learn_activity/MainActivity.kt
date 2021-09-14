package com.example.learn_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


// implement activity in kotlin

// main class with onClickListener view for button component
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMoveActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // to view layout from activity_main.xml

        btnMoveActivity = findViewById(R.id.btn_explicit)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(p: View?) {
        when(p?.id){
            R.id.btn_explicit -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}