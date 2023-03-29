package com.shop

import com.shop.data.products.*


fun addProducts(shop: Shop) {
    shop.addProduct(Apple(id = 1, price = 10))
    shop.addProduct(Apple(id = 2, price = 12))
    shop.addProduct(Banana(id = 3, price = 40))
    shop.addProduct(Carrot(id = 4, price = 18))
    shop.addProduct(Dates(id = 5, price = 80))
    shop.addProduct(Lemon(id = 6, price = 50))
}

fun testShop(shop: Shop) {
    // ....
}