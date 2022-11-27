package com.example.ui_temp.view

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ui_temp.viewmodel.Menu1ViewModel

class Manu1TabAdapter(fragment: Menu1Fragment, private val viewModel: Menu1ViewModel) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount() = viewModel.getTabSize()

    override fun createFragment(position: Int): Fragment {
        //TODO: positionによってFragmentを変える
        return Menu1TabFragment()
    }
}