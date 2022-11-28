package com.example.ui_temp.viewmodel

import androidx.lifecycle.ViewModel

class Menu1ViewModel : ViewModel() {

    private val tabs = mutableListOf<Tab>().apply {
        for (i in 0..10) {
            this.add(Tab("tab $i"))
        }
    }

    fun getTabSize() = tabs.size

    fun getTabText(position: Int): String {
        return tabs[position].name
    }

    data class Tab(val name: String)
}