package com.shop.data

import java.util.*

data class Transaction(
    val id: Long,
    val clientId: Long,
    val date: Date,
    val products: List<Product>,
    val totalPrice: Int,
)