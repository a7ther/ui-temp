package com.example.ui_temp.view.menu1.tab.item

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.ui_temp.databinding.RecyclerMenu1ItemFirstBinding
import com.example.ui_temp.databinding.RecyclerMenu1ItemLastBinding
import com.example.ui_temp.databinding.RecyclerMenu1ItemNormalBinding
import com.example.ui_temp.viewmodel.menu1.tab.item.AbstractItemViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.FirstItemViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.LastItemViewModel
import com.example.ui_temp.viewmodel.menu1.tab.item.NomalItemViewModel

class ItemAdapter(private val viewModels: List<AbstractItemViewModel>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun getItemViewType(position: Int): Int {
        return viewModels[position].viewType.value
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = when (AbstractItemViewModel.ViewType.toViewType(viewType)) {
            AbstractItemViewModel.ViewType.FIRST -> RecyclerMenu1ItemFirstBinding.inflate(
                inflater,
                parent,
                false
            )
            AbstractItemViewModel.ViewType.NORMAL -> RecyclerMenu1ItemNormalBinding.inflate(
                inflater,
                parent,
                false
            )
            AbstractItemViewModel.ViewType.LAST -> RecyclerMenu1ItemLastBinding.inflate(
                inflater,
                parent,
                false
            )
            else -> throw IllegalArgumentException("")
        }
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        when (val b = holder.binding) {
            is RecyclerMenu1ItemFirstBinding -> {
                b.viewModel = viewModels[position] as FirstItemViewModel
            }
            is RecyclerMenu1ItemNormalBinding -> {
                b.viewModel = viewModels[position] as NomalItemViewModel
            }
            is RecyclerMenu1ItemLastBinding -> {
                b.viewModel = viewModels[position] as LastItemViewModel
            }
        }
    }

    override fun getItemCount(): Int = viewModels.size

    class ItemViewHolder(var binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

}