package com.odougle.businesscard.presentation

import android.graphics.Color
import android.view.View
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.odougle.businesscard.data.BusinessCard
import com.odougle.businesscard.databinding.ItemBusinessCardBinding

class BusinessCardAdapter: ListAdapter<BusinessCard, BusinessCardAdapter.ViewHolder>(DiffCallback()) {
    var listernerShare: (View) -> Unit = {}

    inner class ViewHolder(
        private val binding: ItemBusinessCardBinding
    ): RecyclerView.ViewHolder(binding.root){
        fun bind(item: BusinessCard){
            binding.tvNome.text = item.nome
            binding.tvTelefone.text = item.telefone
            binding.tvEmail.text = item.email
            binding.tvNomeEmpresa.text = item.empresa
            binding.mcvContent.setCardBackgroundColor(Color.parseColor(item.cor))
            binding.mcvContent.setOnClickListener {
                listernerShare(it)
            }
        }
    }
}