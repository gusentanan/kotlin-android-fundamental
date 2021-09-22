package com.example.learn_activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // to view layout from activity_main.xml

        val myFragmentManager = supportFragmentManager
        val myHomefragment = HomeFragment()
        val fragment = myFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if(fragment !is HomeFragment){
            Log.d("learn-activity", "fragment-name: " + HomeFragment::class.java.simpleName)
            myFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, myHomefragment, HomeFragment::class.java.simpleName)
                .commit()
        }

    }

}