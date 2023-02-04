package com.alperen.vanlanschot.presentation.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alperen.vanlanschot.R
import com.alperen.vanlanschot.data.StockItem
import java.text.DecimalFormat

class ItemAdapter(private val itemList: List<StockItem>): RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.name.text= itemList[position].name
        holder.price.text= "€ "+ DecimalFormat("#.##").format(itemList[position].price).toString()
        holder.background.setBackgroundColor(getColorFromPriceChange(itemList[position].priceChange))
    }

    private fun getColorFromPriceChange(priceChange: Double): Int {
        return when{
            priceChange>0 -> Color.parseColor("#ff4122")
            priceChange<0 -> Color.parseColor("#32CD32")
            else -> Color.parseColor("#000000")
        }
    }
}