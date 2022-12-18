package com.example.ui_temp.viewmodel.menu1.tab.item

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LastItemViewModel : AbstractItemViewModel() {
    override val viewType = ViewType.LAST
    private val _buttonText = MutableStateFlow("button text")
    val buttonText: StateFlow<String> = _buttonText
}