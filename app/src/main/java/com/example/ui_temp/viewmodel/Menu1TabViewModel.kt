package com.example.ui_temp.viewmodel

import androidx.lifecycle.ViewModel

class Menu1TabViewModel : ViewModel() {

    fun fetchItems(): List<AbstractItemViewModel> {
        return mutableListOf<AbstractItemViewModel>().apply {
            add(Item2ViewModel())
            val max = (0..100).random()
            for (i in 0..max) {
                add(Item1ViewModel())
            }
            add(Item3ViewModel())
        }.toList()
    }
}