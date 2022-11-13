package com.example.ui_temp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ui_temp.databinding.RecyclerItem1Binding

class ItemAdapter(private val viewModels: List<Item1ViewModel>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerItem1Binding.inflate(inflater, parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val viewModel = viewModels[position]
        holder.binding.viewModel = viewModel
    }

    override fun getItemCount(): Int = viewModels.size

    class ItemViewHolder(var binding: RecyclerItem1Binding) : RecyclerView.ViewHolder(binding.root)

}