package com.example.learn_activity

import android.content.Intent
import android.net.Uri
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
    private  lateinit var btnMoveActivityData: Button
    private lateinit var btnMoveImplicit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // to view layout from activity_main.xml

        btnMoveActivity = findViewById(R.id.btn_explicit)
        btnMoveActivity.setOnClickListener(this)

        btnMoveActivityData = findViewById(R.id.btn_explicit_data)
        btnMoveActivityData.setOnClickListener(this)

        btnMoveImplicit = findViewById(R.id.btn_implicit)
        btnMoveImplicit.setOnClickListener(this)
    }

    override fun onClick(p: View?) {
        when(p?.id){
            R.id.btn_explicit -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_explicit_data -> {
                val moveWithData = Intent(this@MainActivity, MoveActivityData::class.java)
                moveWithData.putExtra(MoveActivityData.EXTRA_NAME, "Hello semeton!")
                moveWithData.putExtra(MoveActivityData.EXTRA_AGE, 20)
                startActivity(moveWithData)
            }
            R.id.btn_implicit -> {
                val url = "http://www.facebook.com"
                val moveImplicit = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(moveImplicit)
            }
        }
    }

}