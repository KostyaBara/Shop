package com.shop

import com.shop.data.Client
import com.shop.data.Gender
import com.shop.data.Product
import com.shop.data.Transaction
import java.util.*

class ShopImpl : Shop {

    private val products = mutableListOf<Product>()

    override fun addProduct(product: Product) {
        println("addProduct $product")
        products.add(product)
    }

    override fun addProducts(products: List<Product>) {
        TODO("Not yet implemented")
    }

    override fun buyProduct(product: Product, client: Client) {
        TODO("Not yet implemented")
    }

    override fun buyProducts(products: List<Product>, client: Client) {
        TODO("Not yet implemented")
    }

    override fun allProducts() = products.toList()

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
        products.find { it.id == id }

    override fun findProducts(name: String): List<Product> {
        return products
    }

    override fun findProducts(onSale: Boolean): List<Product> {
        TODO("Not yet implemented")
    }

    override fun findProducts(price: Int, lowerThan: Boolean): List<Product> {
        TODO("Not yet implemented")
    }

    override fun findProducts(predicate: (Product) -> Boolean): List<Product> {
        TODO("Not yet implemented")
    }

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