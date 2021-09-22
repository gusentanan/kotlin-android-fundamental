package com.example.learn_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text


class DetailCategoryFragment : Fragment() {
    lateinit var tvCategoryName: TextView
    lateinit var tvCategoryDesc: TextView
    var desc: String? = null

    companion object {
        var EXTRA_NAME = "extra_name"
        var EXTRA_DESC = "extra_desc"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvCategoryName = view.findViewById(R.id.tv_category_name)
        tvCategoryDesc = view.findViewById(R.id.tv_category_description)
        val btnToProfile:Button = view.findViewById(R.id.btn_profile)
        val btnShowDialog: Button = view.findViewById(R.id.btn_show_dialog)

        if(savedInstanceState != null){
            val descFromBundle = savedInstanceState.getString(EXTRA_DESC)
            desc = descFromBundle
        }

        if(arguments != null){
            val categoryName =  arguments?.getString(EXTRA_NAME)
            tvCategoryName.text = categoryName
            tvCategoryDesc.text  = desc
        }

    }





}