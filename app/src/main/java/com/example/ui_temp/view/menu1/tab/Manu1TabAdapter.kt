package com.example.ui_temp.view.menu1.tab

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ui_temp.view.menu1.Menu1Fragment
import com.example.ui_temp.viewmodel.menu1.Menu1ViewModel

class Manu1TabAdapter(fragment: Menu1Fragment, private val viewModel: Menu1ViewModel) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount() = viewModel.getTabSize()

    override fun createFragment(position: Int): Fragment {
        //TODO: positionによってFragmentを変える
        return Menu1TabFragment()
    }
}