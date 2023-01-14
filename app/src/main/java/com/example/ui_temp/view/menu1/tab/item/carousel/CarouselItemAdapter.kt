package com.example.ui_temp.view.menu1.tab.item.carousel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.ui_temp.databinding.RecyclerMenu1CaroucelItemBinding
import com.example.ui_temp.viewmodel.menu1.tab.item.carousel.ItemViewModel

class CarouselItemAdapter(private val viewModels: List<ItemViewModel>) :
    RecyclerView.Adapter<CarouselItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerMenu1CaroucelItemBinding.inflate(
            inflater,
            parent,
            false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        when (val b = holder.binding) {
            is RecyclerMenu1CaroucelItemBinding -> {
                b.viewModel = viewModels[position]
            }
        }
    }

    override fun getItemCount(): Int = viewModels.size

    class ItemViewHolder(var binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

}