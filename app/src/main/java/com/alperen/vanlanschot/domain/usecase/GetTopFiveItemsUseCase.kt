package com.alperen.vanlanschot.domain.usecase

import com.alperen.vanlanschot.data.StockItem

class GetTopFiveItemsUseCase {

    operator fun invoke() : List<StockItem>{
        val stockItems : List<StockItem> = GenerateRandomStockItemsUseCase().invoke()
        val topFiveItems = stockItems.sortedByDescending { it.price }.take(5)
        return topFiveItems
    }
}