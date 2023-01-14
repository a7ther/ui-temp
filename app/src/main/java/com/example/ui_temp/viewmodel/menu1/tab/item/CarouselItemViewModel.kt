package com.example.ui_temp.viewmodel.menu1.tab.item

import com.example.ui_temp.viewmodel.menu1.tab.item.carousel.ItemViewModel

class CarouselItemViewModel() : AbstractItemViewModel() {
    override val viewType = ViewType.CAROUSEL
    val itemViewModels = mutableListOf<ItemViewModel>().apply {
        val max = (0..20).random()
        for (i in 0..max) {
            add(ItemViewModel())
        }
    }.toList()
}