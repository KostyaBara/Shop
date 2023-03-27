package com.shop

import com.shop.data.Product
import com.shop.data.products.*

fun main(args: Array<String>) {

    val shop: Shop = ShopImpl()

    println("now we have:\n${shop.allProducts()}")

}