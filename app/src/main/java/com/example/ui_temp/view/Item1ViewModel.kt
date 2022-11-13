package com.example.ui_temp.view

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Item1ViewModel : ViewModel() {
    private val _text = MutableStateFlow("hashCode : ${hashCode()}")
    val text: StateFlow<String> = _text
}