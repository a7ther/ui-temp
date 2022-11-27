package com.example.ui_temp.viewmodel

import androidx.lifecycle.ViewModel

class Menu1ViewModel : ViewModel() {

    private val tabs = mutableListOf<Tab>()

    fun getTabSize() = tabs.size

    fun createTab() {
        for (i in 0..10) {
            tabs.add(Tab("tab $i"))
        }
    }

    fun getTabText(position: Int): String {
        return tabs[position].name
    }

    data class Tab(val name: String)
}