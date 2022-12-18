package com.example.ui_temp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.ui_temp.databinding.RecyclerItem1Binding
import com.example.ui_temp.databinding.RecyclerItem2Binding
import com.example.ui_temp.databinding.RecyclerItem3Binding
import com.example.ui_temp.viewmodel.AbstractItemViewModel
import com.example.ui_temp.viewmodel.Item1ViewModel
import com.example.ui_temp.viewmodel.Item2ViewModel
import com.example.ui_temp.viewmodel.Item3ViewModel

class ItemAdapter(private val viewModels: List<AbstractItemViewModel>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    override fun getItemViewType(position: Int): Int {
        return viewModels[position].viewType.value
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = when (AbstractItemViewModel.ViewType.toViewType(viewType)) {
            AbstractItemViewModel.ViewType.FIRST -> RecyclerItem2Binding.inflate(
                inflater,
                parent,
                false
            )
            AbstractItemViewModel.ViewType.OTHER -> RecyclerItem1Binding.inflate(
                inflater,
                parent,
                false
            )
            AbstractItemViewModel.ViewType.LAST -> RecyclerItem3Binding.inflate(
                inflater,
                parent,
                false
            )
            else -> throw IllegalArgumentException("")
        }
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //TODO: positionによってviewModelを変える
        when (val b = holder.binding) {
            is RecyclerItem2Binding -> {
                b.viewModel2 = viewModels[position] as Item2ViewModel
            }
            is RecyclerItem1Binding -> {
                b.viewModel1 = viewModels[position] as Item1ViewModel
            }
            is RecyclerItem3Binding -> {
                b.viewModel3 = viewModels[position] as Item3ViewModel
            }
        }
    }

    override fun getItemCount(): Int = viewModels.size

    class ItemViewHolder(var binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

}