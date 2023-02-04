package com.alperen.vanlanschot.domain.usecase

import com.alperen.vanlanschot.data.StockItem
import kotlin.random.Random

class GenerateRandomStockItemsUseCase {
    val list = mutableListOf<StockItem>()
    operator fun invoke() : List<StockItem>{
        list.add(StockItem(name = "Macbook Air", id = 1, price = Random.nextDouble(100.0,1000.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "Bose QuietComfort 45", id = 2, price = Random.nextDouble(200.0,1100.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "Intel Core i7-13700K", id = 3, price = Random.nextDouble(300.0,900.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "iPad Air", id = 4, price = Random.nextDouble(150.0,600.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "MSI Katana GF66", id = 5, Random.nextDouble(100.0,1000.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "Sony Alpha 7 IV", id = 6, Random.nextDouble(300.0,900.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "Playstation 5", id = 7, Random.nextDouble(200.0,700.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "Gigabyte GeForce RTX 3070", id = 8, Random.nextDouble(100.0,600.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "Samsung Galaxy S22", id = 9, Random.nextDouble(200.0,700.0), priceChange = Random.nextDouble(-5.0,5.0)))
        list.add(StockItem(name = "Apple Watch Series 8", id = 10, Random.nextDouble(400.0,600.0), priceChange = Random.nextDouble(-5.0,5.0)))
        return list
    }
}