package com.example.learn_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


// this code is aiming to Learn-activity in android using kotlin

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edit_width: EditText
    private lateinit var edit_height: EditText
    private lateinit var edit_length: EditText
    private lateinit var  button_main: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_width = findViewById(R.id.edit_width)
        edit_height = findViewById(R.id.edit_height)
        edit_length = findViewById(R.id.edit_length)
        button_main = findViewById(R.id.btn_main)
        result = findViewById(R.id.result)

        button_main.setOnClickListener(this)
    }

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onClick(p: View?) {
        if (p?.id == R.id.btn_main) {
            val inputWidth = edit_width.text.toString().trim()
            val inputHeight = edit_height.text.toString().trim()
            val inputLength = edit_length.text.toString().trim()

            var inputList = arrayOf(inputHeight, inputLength, inputWidth)
            var i = 0
            var isEmptyInput = false
            while (i in inputList.indices) {
                if(inputList[i].isEmpty()) {
                    isEmptyInput = true
                    when(i) {
                        0 -> edit_height.error = "Field tinggi tidak boleh kosong"
                        1 -> edit_length.error = "Field panjang tidak boleh kosong"
                        2 -> edit_width.error = "Field lebar tidak boleh kosong"
                    }
                    break
                }
                i++
            }

            if(!isEmptyInput){
                val volume = inputHeight.toDouble() * inputLength.toDouble() * inputWidth.toDouble()
                result.text = volume.toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, result.text.toString())
    }
}