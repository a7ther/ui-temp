package com.example.ui_temp.viewmodel.menu1.tab

import androidx.lifecycle.ViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.AbstractItemViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.FirstItemViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.LastItemViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.NomalItemViewModel

class Menu1TabViewModel : ViewModel() {

    fun fetchItems(): List<AbstractItemViewModel> {
        return mutableListOf<AbstractItemViewModel>().apply {
            add(FirstItemViewModel())
            val max = (0..100).random()
            for (i in 0..max) {
                add(NomalItemViewModel())
            }
            add(LastItemViewModel())
        }.toList()
    }
}