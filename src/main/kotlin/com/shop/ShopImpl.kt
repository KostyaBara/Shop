package com.shop

import com.shop.data.Client
import com.shop.data.Gender
import com.shop.data.Product
import com.shop.data.Transaction
import java.util.*

class ShopImpl : Shop {

    private val productsList = mutableListOf<Product>()
    private val clientsList = mutableListOf<Client>()
    private val transactionsList = mutableListOf<Transaction>()

    override fun addProduct(product: Product) {
        println("addProduct $product")
        productsList.add(product)
    }

    override fun addProducts(products: List<Product>) {
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
        return clientsList
    }

    override fun allTransactions(): List<Transaction> {
        return transactionsList
    }

    override fun mostPopularProduct(): Product? {
        TODO("Not yet implemented")
    }

    override fun mostAvailableProduct(): Product? {
        TODO("Not yet implemented")
    }

    override fun mostExpensiveProduct() =
        productsList.maxByOrNull { it.price }

    override fun mostExpensiveTransaction(): Transaction? =
        transactionsList.maxByOrNull { it.totalPrice }

    override fun mostProfitClient(): Client? {
        TODO()
    }

    override fun findProduct(id: Long) =
        productsList.find { it.id == id }

    override fun findProducts(name: String) =
        productsList.filter { it.name.contains(name, ignoreCase = true) }

    override fun findProducts(onSale: Boolean) =
        productsList.filter { it.onSale == onSale }

    override fun findProducts(price: Int, lowerThan: Boolean) =
        productsList.filter { if (lowerThan) (it.price < price) else (it.price > price) }

    override fun findProducts(predicate: (Product) -> Boolean) =
        productsList.filter(predicate)

    override fun findClient(id: Long) =
        clientsList.find { it.id == id }

    override fun findClients(name: String) =
        clientsList.filter { it.name.contains(name, ignoreCase = true) }

    override fun findClients(isVip: Boolean) =
        clientsList.filter { it.isVip == isVip }

    override fun findClients(age: Int, youngerThan: Boolean) =
        clientsList.filter { if (youngerThan) (it.age < age) else (it.age > age) }

    override fun findClients(predicate: (Client) -> Boolean) =
        clientsList.filter(predicate)

    override fun whoBuysMore(): Gender {
        TODO("Not yet implemented")
    }

    override fun findTransaction(id: Long) =
        transactionsList.find { it.id == id }

    override fun findTransactions(clientId: Long) =
        transactionsList.filter { it.id == clientId }

    override fun findTransactions(date: Date) =
        transactionsList.filter { it.date == date }

    override fun findTransactions(product: Product) =
        transactionsList.filter { it.products.contains(product) }

    override fun findTransactions(predicate: (Transaction) -> Boolean) =
        transactionsList.filter(predicate)

    override fun findTransactionsBefore(date: Date) =
        transactionsList.filter { it.date.before(date) }

    override fun findTransactionsAfter(date: Date)=
        transactionsList.filter { it.date.after(date) }
}