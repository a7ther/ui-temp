package com.example.ui_temp.view

import androidx.lifecycle.ViewModel
import com.example.ui_temp.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Item1ViewModel: ViewModel() {
    private val _text = MutableStateFlow("aaaaaaaaaaaaa")
    val text: StateFlow<String> = _text
}