package com.example.learn_activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.learn_activity.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {
    private var _binding : FragmentCategoryBinding ?  = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_STOCK = "extra_stock"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCategoryLifestyle.setOnClickListener(){
            // using bundle
//            val mBundle = Bundle()
//            mBundle.putString(EXTRA_NAME, "Hello sir!")
//            mBundle.putInt(EXTRA_STOCK, 8)
//            view.findNavController().navigate(R.id.action_categoryFragment_to_detailCategoryFragment, mBundle)

            // using safeArgs
            val toDetailCategoryFragment = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategoryFragment.name = "Hello Mam!"
            toDetailCategoryFragment.stock = 10
            view.findNavController().navigate(toDetailCategoryFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}