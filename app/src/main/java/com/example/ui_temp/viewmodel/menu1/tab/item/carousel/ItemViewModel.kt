package com.example.ui_temp.viewmodel.menu1.tab.item.carousel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ItemViewModel() : ViewModel() {
    private val _text = MutableStateFlow("hashCode : ${hashCode()}")
    val text: StateFlow<String> = _text
}