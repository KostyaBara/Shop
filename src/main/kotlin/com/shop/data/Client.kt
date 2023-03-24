package com.shop.data

data class Client(
    val id: Long,
    val name: String,
    val age: Int,
    val gender: Gender,
    val isVip: Boolean,
)