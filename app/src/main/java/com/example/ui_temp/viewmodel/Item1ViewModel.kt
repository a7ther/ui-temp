package com.example.ui_temp.viewmodel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class Item1ViewModel() : AbstractItemViewModel() {
    override val viewType = ViewType.OTHER
    private val _text = MutableStateFlow("hashCode : ${hashCode()}")
    val text: StateFlow<String> = _text
}