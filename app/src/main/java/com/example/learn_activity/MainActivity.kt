package com.example.learn_activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learn_activity.adapter.IdolAdapter
import com.example.learn_activity.adapter.IdolGridAdapter
import com.example.learn_activity.data.IdolData
import com.example.learn_activity.model.Idol

// Recycle View

class MainActivity : AppCompatActivity(){
    private lateinit var rvIdol: RecyclerView
    private var list: ArrayList<Idol> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // to view layout from activity_main.xml

        rvIdol = findViewById(R.id.rv_idol)
        rvIdol.setHasFixedSize(true)

        list.addAll(IdolData.listIdol)
        showRecyclerList()

    }

    private fun showRecyclerList(){
        rvIdol.layoutManager = LinearLayoutManager(this)
        val listIdolAdapter = IdolAdapter(list)
        rvIdol.adapter = listIdolAdapter
    }

    private fun showRecyclerGrid(){
        rvIdol.layoutManager = GridLayoutManager(this, 2)
        val gridIdolAdapter = IdolGridAdapter(list)
        rvIdol.adapter = gridIdolAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMenu(selectedMenu: Int){
        when(selectedMenu){
            R.id.list_view -> {
                showRecyclerList()
            }
            R.id.grid_view -> {
                showRecyclerGrid()
            }
            R.id.card_view -> {

            }
        }
    }


}