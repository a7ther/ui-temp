package com.example.ui_temp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.ui_temp.databinding.FragmentMenu1Binding

class Menu1Fragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {


        val binding = FragmentMenu1Binding.inflate(inflater, container, false)

        val recyclerView = binding.recyclerView
        val viewModels = listOf(
            Item1ViewModel(),
            Item1ViewModel(),
            Item1ViewModel(),
            Item1ViewModel(),
            Item1ViewModel(),
        )
        recyclerView.adapter = ItemAdapter(viewModels)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}