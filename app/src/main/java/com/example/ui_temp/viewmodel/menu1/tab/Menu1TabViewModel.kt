package com.example.ui_temp.viewmodel.menu1.tab

import androidx.lifecycle.ViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.*
import kotlinx.coroutines.delay

class Menu1TabViewModel : ViewModel() {

    suspend fun fetchItems(): List<AbstractItemViewModel> {
        //ネットワーク通信を想定したdelay
        delay(1_000L)
        return mutableListOf<AbstractItemViewModel>().apply {
            add(FirstItemViewModel())
            add(CarouselItemViewModel())
            val max = (0..100).random()
            for (i in 0..max) {
                add(NormalItemViewModel())
            }
            add(LastItemViewModel())
        }.toList()
    }
}