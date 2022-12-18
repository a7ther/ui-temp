package com.example.ui_temp.viewmodel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Item2ViewModel : AbstractItemViewModel() {
    override val viewType = ViewType.FIRST
    private val _text = MutableStateFlow("First Component")
    val text: StateFlow<String> = _text
    private val _text2 = MutableStateFlow("hashCode : ${hashCode()}")
    val text2: StateFlow<String> = _text2
}