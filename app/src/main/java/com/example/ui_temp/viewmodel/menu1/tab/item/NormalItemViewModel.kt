package com.example.ui_temp.viewmodel.menu1.tab.item

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class NormalItemViewModel() : AbstractItemViewModel() {
    override val viewType = ViewType.NORMAL
    private val _text = MutableStateFlow("hashCode : ${hashCode()}")
    val text: StateFlow<String> = _text
}