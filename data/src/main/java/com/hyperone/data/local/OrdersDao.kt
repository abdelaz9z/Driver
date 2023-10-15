package com.hyperone.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hyperone.data.entity.Orders
import com.hyperone.domain.model.order.OrderResponse
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object (DAO) interface for recipes.
 */
@Dao
interface OrdersDao {

    /**
     * Inserts a [Orders] object into the database. If there is a conflict,
     * it replaces the existing data.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOrder(orders: OrderResponse)

    /**
     * Retrieves all recipes from the database, ordered by name in ascending order,
     * as a [Flow] of [List] of [Orders].
     */
    @Query("SELECT * FROM orders ORDER BY order_number ASC")
    fun getOrders(): Flow<List<Orders>>

}