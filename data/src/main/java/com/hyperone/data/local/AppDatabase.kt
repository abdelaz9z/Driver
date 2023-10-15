package com.hyperone.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hyperone.data.entity.Orders
import com.hyperone.domain.model.order.OrderResponse

/**
 * The following code defines an AppDatabase class to hold the database.
 * AppDatabase defines the database configuration and serves as the app's main access point to the persisted data.
 */
@Database(entities = [OrderResponse::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    /**
     * The following code defines a DAO called OrdersDao.
     * OrdersDao provides the methods that the rest of the app recipes to interact with data in the recipes table.
     */
    abstract fun ordersDao(): OrdersDao

}