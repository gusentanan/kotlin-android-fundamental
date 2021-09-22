package com.example.learn_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 * Use the [CategoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnDetail: Button = view.findViewById(R.id.btn_detail_category)
        btnDetail.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_detail_category){
            val myDetailCategoryFragment = DetailCategoryFragment()

            val myBundle = Bundle()
            myBundle.putString(DetailCategoryFragment.EXTRA_NAME, "lifestyle")
            val desc = "Kategori ini berisi banyak sekali lifestyle lah"

            myDetailCategoryFragment.arguments = myBundle
            myDetailCategoryFragment.desc = desc

            val myFragmentManager = parentFragmentManager
            myFragmentManager.beginTransaction().apply {
                replace(R.id.frame_container, myDetailCategoryFragment, DetailCategoryFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }

        }
    }





}