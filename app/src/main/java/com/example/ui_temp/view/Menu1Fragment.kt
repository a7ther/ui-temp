package com.example.ui_temp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ui_temp.databinding.FragmentMenu1Binding

class Menu1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentMenu1Binding.inflate(inflater, container, false)
        val recyclerView = binding.recyclerView
        val viewModels = mutableListOf<Item1ViewModel>().apply {
            for (i in 0..100) {
                add(Item1ViewModel())
            }
        }.toList()

        recyclerView.adapter = ItemAdapter(viewModels)

        return binding.root
    }

}