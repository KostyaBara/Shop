package com.shop

import com.shop.data.Client
import com.shop.data.Gender
import com.shop.data.Product
import com.shop.data.Transaction
import java.util.*

class ShopImpl : Shop {

    private val productsList = mutableListOf<Product>()

    override fun addProduct(product: Product) {
        println("addProduct $product")
        productsList.add(product)
    }

    override fun addProducts(products: List<Product>) {
//        for (i in products.indices) { println(products[i]) }
        productsList.addAll(products)
    }

    override fun buyProduct(product: Product, client: Client) {
        TODO("Not yet implemented")
    }

    override fun buyProducts(products: List<Product>, client: Client) {
        TODO("Not yet implemented")
    }

    override fun allProducts() = productsList.toList()

    override fun allClients(): List<Client> {
        TODO("Not yet implemented")
    }

    override fun allTransactions(): List<Transaction> {
        TODO("Not yet implemented")
    }

    override fun mostPopularProduct(): Product? {
        TODO("Not yet implemented")
    }

    override fun mostAvailableProduct(): Product? {
        TODO("Not yet implemented")
    }

    override fun mostExpensiveProduct(): Product? {
        TODO("Not yet implemented")
    }

    override fun mostExpensiveTransaction(): Transaction? {
        TODO("Not yet implemented")
    }

    override fun mostProfitClient(): Client? {
        TODO("Not yet implemented")
    }

    override fun findProduct(id: Long) =
        productsList.find { it.id == id }

    override fun findProducts(name: String) =
        productsList.filter { it.name.contains(name, true) }

    override fun findProducts(onSale: Boolean) =
        productsList.filter { it.onSale }

    override fun findProducts(price: Int, lowerThan: Boolean): List<Product> {
        val map = productsList.groupBy { it.price < price }
        return if (lowerThan) {
            map.getValue(true)
        } else map.getValue(false)
    }

    override fun findProducts(predicate: (Product) -> Boolean) =
        productsList.filter { true }

    override fun findClient(id: Long): Client? {
        TODO("Not yet implemented")
    }

    override fun findClients(name: String): List<Client> {
        TODO("Not yet implemented")
    }

    override fun findClients(isVip: Boolean): List<Client> {
        TODO("Not yet implemented")
    }

    override fun findClients(age: Int, youngerThan: Boolean): List<Client> {
        TODO("Not yet implemented")
    }

    override fun findClients(predicate: (Client) -> Boolean): List<Client> {
        TODO("Not yet implemented")
    }

    override fun hwoBuysMore(): Gender {
        TODO("Not yet implemented")
    }

    override fun findTransaction(id: Long): Transaction? {
        TODO("Not yet implemented")
    }

    override fun findTransactions(clientId: Long): List<Transaction> {
        TODO("Not yet implemented")
    }

    override fun findTransactions(date: Date): List<Transaction> {
        TODO("Not yet implemented")
    }

    override fun findTransactions(product: Product): List<Transaction> {
        TODO("Not yet implemented")
    }

    override fun findTransactions(predicate: (Transaction) -> Boolean): List<Transaction> {
        TODO("Not yet implemented")
    }

    override fun findTransactionsBefore(date: Date): List<Transaction> {
        TODO("Not yet implemented")
    }

    override fun findTransactionsAfter(date: Date): List<Transaction> {
        TODO("Not yet implemented")
    }
}