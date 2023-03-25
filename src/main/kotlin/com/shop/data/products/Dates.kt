package com.shop.data.products

import com.shop.data.Category
import com.shop.data.Product

data class Dates(
    override val id: Long,
    override val price: Int,
    override val onSale: Boolean = false,
): Product(
    id = id,
    name = "Dates",
    category = Category.FOOD,
    price = price,
    onSale = onSale,
)