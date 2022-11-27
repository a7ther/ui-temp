package com.example.ui_temp.viewmodel

import androidx.lifecycle.ViewModel

class Menu1TabViewModel : ViewModel() {

    fun fetchItems(): List<Item1ViewModel> {
        return mutableListOf<Item1ViewModel>().apply {
            for (i in 0..100) {
                add(Item1ViewModel())
            }
        }.toList()
    }
}