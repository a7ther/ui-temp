package com.example.ui_temp.viewmodel

import androidx.lifecycle.ViewModel

abstract class AbstractItemViewModel : ViewModel() {
    enum class ViewType(val value: Int) {
        FIRST(0),
        OTHER(1),
        LAST(2),
        UNKNOWN(999);

        companion object {
            fun toViewType(value: Int): ViewType {
                values().forEach {
                    if (value == it.value) return it
                }
                return UNKNOWN
            }
        }
    }

    abstract val viewType: ViewType
}