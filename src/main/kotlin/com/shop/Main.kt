package com.shop


fun main(args: Array<String>) {
    val shop: Shop = ShopImpl()
    addProducts(shop)

    println("now we have:\n${shop.allProducts()}")
}