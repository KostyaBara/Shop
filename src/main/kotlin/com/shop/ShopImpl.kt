package com.shop

import com.shop.data.Client
import com.shop.data.Gender
import com.shop.data.Product
import com.shop.data.Transaction
import java.util.*
import kotlin.math.abs

class ShopImpl : Shop {

    private val products = mutableMapOf<Product, Int>()
    private val clients = mutableSetOf<Client>()
    private val transactions = mutableListOf<Transaction>()

    override fun addProduct(product: Product) {
        println("addProduct $product")
        products.keys.add(product)
    }

    override fun addProducts(products: Map<Product, Int>) =
        this.products.putAll(products)


    override fun buyProduct(product: Map<Product, Int>, client: Client) {

        fun transactID(): Int {
            var id = (1000..9999).random()
            while (!(transactions.none { it.id.toInt() == id })) { id = transactID() }
            return id
        }
        val id = transactID()

        val rnd = Random()
        val time = Date(abs(System.currentTimeMillis() - rnd.nextLong()))

        var totalPrice = 0
        product.forEach { totalPrice += (it.key.price * it.value) }

        val newTransaction = Transaction(
            id.toLong(), clientId = client.id, date = time,
            products = product.keys.toList(), totalPrice
        )

        transactions.add(newTransaction)

        product.forEach {
            if (products.keys.contains(it.key) ) {
                for (i in products) if (i.key.name == it.key.name) i.value += it.value
            } else {
                products.putAll(product)
            }
        }
    }
        override fun buyProducts(products: List<Product>, client: Client) {
        TODO("Not yet implemented")
    }

    override fun allProducts() = products.toList()

    override fun allClients() = clients.toList()


    override fun allTransactions() = transactions

    override fun mostPopularProduct(): Product? {
        TODO("Not yet implemented")
    }

    override fun mostAvailableProduct(): Product? {
        TODO("Not yet implemented")
    }

    override fun mostExpensiveProduct() =
        products.maxByOrNull { it.key.price }

    override fun mostExpensiveTransaction(): Transaction? =
        transactions.maxByOrNull { it.totalPrice }

    override fun mostProfitClient(): Client? {
        TODO()
    }

    override fun findProduct(id: Long): Product? =
        products.keys.find { it.id == id }

    override fun findProducts(name: String) =
        products.filter { it.key.name.contains(name, ignoreCase = true) }

    override fun findProducts(onSale: Boolean) =
        products.filter { it.key.onSale == onSale }

    override fun findProducts(price: Int, lowerThan: Boolean) =
        products.filter { if (lowerThan) (it.key.price < price) else (it.key.price > price) }

    override fun findProducts(predicate: (Product) -> Boolean) =
        products.filter ( predicate )

    override fun findClient(id: Long) =
        clients.find { it.id == id }

    override fun findClients(name: String) =
        clients.filter { it.name.contains(name, ignoreCase = true) }

    override fun findClients(isVip: Boolean) =
        clients.filter { it.isVip == isVip }

    override fun findClients(age: Int, youngerThan: Boolean) =
        clients.filter { if (youngerThan) (it.age < age) else (it.age > age) }

    override fun findClients(predicate: (Client) -> Boolean) =
        clients.filter(predicate)

    override fun whoBuysMore(): Gender {
        TODO("Not yet implemented")
    }

    override fun findTransaction(id: Long) =
        transactions.find { it.id == id }

    override fun findTransactions(clientId: Long) =
        transactions.filter { it.id == clientId }

    override fun findTransactions(date: Date) =
        transactions.filter { it.date == date }

    override fun findTransactions(product: Product) =
        transactions.filter { it.products.contains(product) }

    override fun findTransactions(predicate: (Transaction) -> Boolean) =
        transactions.filter(predicate)

    override fun findTransactionsBefore(date: Date) =
        transactions.filter { it.date.before(date) }

    override fun findTransactionsAfter(date: Date)=
        transactions.filter { it.date.after(date) }
}