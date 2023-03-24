package com.shop

import com.shop.data.products.Apple

fun main(args: Array<String>) {

    val shop: Shop = ShopImpl()

    shop.addProduct(Apple(id = 1, price = 10))
    shop.addProduct(Apple(id = 2, price = 12))

    println("now we have:\n${shop.allProducts()}")
}