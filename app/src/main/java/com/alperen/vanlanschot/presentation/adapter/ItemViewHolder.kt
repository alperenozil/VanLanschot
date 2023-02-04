package com.alperen.vanlanschot.presentation.adapter

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.alperen.vanlanschot.R

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name : TextView = itemView.findViewById(R.id.textViewName)
    val price : TextView = itemView.findViewById(R.id.textViewPrice)
    val background : ConstraintLayout = itemView.findViewById(R.id.itemLayout)
}