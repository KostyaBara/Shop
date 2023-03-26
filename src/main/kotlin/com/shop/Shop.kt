package com.shop

import com.shop.data.Client
import com.shop.data.Gender
import com.shop.data.Product
import com.shop.data.Transaction
import java.util.*

interface Shop {
    fun addProduct(product: Product)

    fun addProducts(products: List<Product>)

    fun buyProduct(product: Product, client: Client)

    fun buyProducts(products: List<Product>, client: Client)

    /** Get all ====================+ */

    fun allProducts(): List<Product> // returns only available products

    fun allClients(): List<Client>

    fun allTransactions(): List<Transaction>

    /** Most ??? ==================== */

    fun mostPopularProduct(): Product? // which was bought the most

    fun mostAvailableProduct(): Product?

    fun mostExpensiveProduct(): Product?

    fun mostExpensiveTransaction(): Transaction?

    fun mostProfitClient(): Client? // самый прибыльный клиент

    /** Products ??? =================== */

    fun findProduct(id: Long): Product?

    fun findProducts(name: String): List<Product>

    fun findProducts(onSale: Boolean): List<Product>

    fun findProducts(price: Int, lowerThan: Boolean = true): List<Product>

    fun findProducts(predicate: (Product) -> Boolean): List<Product>

    /** Clients ??? =================== */

    fun findClient(id: Long): Client?

    fun findClients(name: String): List<Client>

    fun findClients(isVip: Boolean): List<Client>

    fun findClients(age: Int, youngerThan: Boolean = true): List<Client>

    fun findClients(predicate: (Client) -> Boolean): List<Client>

    fun whoBuysMore(): Gender // by default FEMALE

    /** Transactions ??? =================== */

    fun findTransaction(id: Long): Transaction?

    fun findTransactions(clientId: Long): List<Transaction>

    fun findTransactions(date: Date): List<Transaction>

    fun findTransactionsBefore(date: Date): List<Transaction>

    fun findTransactionsAfter(date: Date): List<Transaction>

    fun findTransactions(product: Product): List<Transaction>

    fun findTransactions(predicate: (Transaction) -> Boolean): List<Transaction>
}
