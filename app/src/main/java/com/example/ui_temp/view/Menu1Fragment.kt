package com.example.ui_temp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.ui_temp.databinding.FragmentMenu1Binding
import com.example.ui_temp.viewmodel.Menu1ViewModel
import com.google.android.material.tabs.TabLayoutMediator
import java.lang.ref.WeakReference

class Menu1Fragment : Fragment() {

    private var bindingWeak = WeakReference<FragmentMenu1Binding>(null)
    private val viewModel: Menu1ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMenu1Binding.inflate(inflater, container, false)
        bindingWeak = WeakReference(binding)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = bindingWeak.get() ?: return
        binding.tabViewPager.adapter = Manu1TabAdapter(this, viewModel)
        TabLayoutMediator(
            binding.tabLayout,
            binding.tabViewPager
        ) { tab, position ->
            tab.text = viewModel.getTabText(position)
        }.attach()
    }

}