package com.hyperone.domain.usecase

import com.hyperone.domain.repository.OrdersRepository
import com.hyperone.domain.repository.OrderResponse

/**
 * Class for performing CRUD operations on recipes.
 *
 * @param ordersRepository The repository for accessing driver data.
 */
class OrdersCRUD(private val ordersRepository: OrdersRepository) {

    /**
     * Retrieves orders from the local data source.
     *
     * @return [Flow] emitting a list of [OrdersResponseItem] objects.
     */
    fun getOrdersFromLocal() = ordersRepository.getOrdersFromLocal()

    /**
     * Inserts a new [OrderResponse] into the local data source.
     *
     * @param orderResponse The [OrderResponse] to be inserted.
     */
    fun insertRecipesItem(orderResponse: OrderResponse) {
        ordersRepository.insertOrder(orderResponse)
    }

}