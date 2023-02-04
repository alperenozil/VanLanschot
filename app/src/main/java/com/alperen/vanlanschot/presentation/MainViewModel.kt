package com.alperen.vanlanschot.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alperen.vanlanschot.data.StockItem
import com.alperen.vanlanschot.domain.usecase.GetTopFiveItemsUseCase
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    val items: MutableLiveData<List<StockItem>> = MutableLiveData()
    fun getItems(){
        viewModelScope.launch {
            items.postValue(GetTopFiveItemsUseCase().invoke())
        }
    }
}