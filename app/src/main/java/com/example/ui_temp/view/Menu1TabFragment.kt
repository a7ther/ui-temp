package com.example.ui_temp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.ui_temp.databinding.FragmentMenu1TabBinding
import com.example.ui_temp.viewmodel.Menu1TabViewModel
import java.lang.ref.WeakReference

class Menu1TabFragment : Fragment() {

    private var bindingWeak = WeakReference<FragmentMenu1TabBinding>(null)
    private val viewModel: Menu1TabViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMenu1TabBinding.inflate(inflater, container, false)
        bindingWeak = WeakReference(binding)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = bindingWeak.get() ?: return
        val recyclerView = binding.recyclerView
        val itemViewModels = viewModel.fetchItems()

        recyclerView.adapter = ItemAdapter(itemViewModels)
    }

}