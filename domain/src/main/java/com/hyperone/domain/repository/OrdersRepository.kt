package com.hyperone.domain.repository

import kotlinx.coroutines.flow.Flow

/**
 * Interface defining the contract for retrieving orders.
 */
interface OrdersRepository {

    /**
     * Retrieves orders from a local data source.
     *
     * @return [Flow] emitting a list of [OrderResponse] objects.
     */
    fun getOrdersFromLocal(): Flow<List<OrderResponse>>

    /**
     * Inserts a new [OrderResponse] into the local data source.
     *
     * @param orderResponse The [OrderResponse] to be inserted.
     */
    fun insertOrder(orderResponse: OrderResponse)
}