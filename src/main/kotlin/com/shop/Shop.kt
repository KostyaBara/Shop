package com.shop

import com.shop.data.Client
import com.shop.data.Gender
import com.shop.data.Product
import com.shop.data.Transaction
import java.util.*

interface Shop {
    fun addProduct(product: Product)

    fun addProducts(products: Map<Product, Int>)

    fun buyProduct(product: Product, client: Client)

    fun buyProducts(products: List<Product>, client: Client)

    /** Get all ====================+ */

    fun allProducts(): List<Pair<Product, Int>> // returns only available products

    fun allClients(): List<Client>

    fun allTransactions(): List<Transaction>

    /** Most ??? ==================== */

    fun mostPopularProduct(): Product? // which was bought the most

    fun mostAvailableProduct(): Product?

    fun mostExpensiveProduct(): Map.Entry<Product, Int>?

    fun mostExpensiveTransaction(): Transaction?

    fun mostProfitClient(): Client? // самый прибыльный клиент

    /** Products ??? =================== */

    fun findProduct(id: Long): Product?

    fun findProducts(name: String): Map<Product, Int>

    fun findProducts(onSale: Boolean): Map<Product, Int>

    fun findProducts(price: Int, lowerThan: Boolean = true): Map<Product, Int>

    fun findProducts(predicate: (Product) -> Boolean): Map<Product, Int>

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
