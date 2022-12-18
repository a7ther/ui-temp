package com.example.ui_temp.viewmodel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Item3ViewModel : AbstractItemViewModel() {
    override val viewType = ViewType.LAST
    private val _text = MutableStateFlow("button text")
    val text: StateFlow<String> = _text
}