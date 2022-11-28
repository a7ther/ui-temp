package com.example.ui_temp.viewmodel

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class Menu1TabViewModel : ViewModel() {

    fun fetchItems(): List<Item1ViewModel> {
        return mutableListOf<Item1ViewModel>().apply {
         val max = (0..100).random()
            for (i in 0..max) {
                add(Item1ViewModel())
            }
        }.toList()
    }
}