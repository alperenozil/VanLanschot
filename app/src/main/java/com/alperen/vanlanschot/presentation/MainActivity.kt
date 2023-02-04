package com.alperen.vanlanschot.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alperen.vanlanschot.R
import com.alperen.vanlanschot.presentation.adapter.ItemAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var itemsRecyclerView: RecyclerView
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = MainViewModel()
        itemsRecyclerView = findViewById(R.id.itemsRecyclerView)
        itemsRecyclerView.layoutManager = LinearLayoutManager(this)
        mainViewModel.getItems()
        mainViewModel.items.observe(this) {
            mainViewModel.items.value?.let {
                itemsRecyclerView.adapter = ItemAdapter(it)
            }
            itemsRecyclerView.adapter?.notifyDataSetChanged()
        }
    }
}