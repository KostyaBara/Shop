package com.shop.data

abstract class Product(
    open val id: Long,
    open val name: String,
    open val category: Category,
    open val price: Int,
    open val onSale: Boolean, // 50% sale
)