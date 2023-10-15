package com.hyperone.driver.di

import android.content.Context
import androidx.room.Room
import com.etisalat.data.remote.ApiService
import com.google.firebase.firestore.FirebaseFirestore
import com.hyperone.data.repository.MagentoRepositoryImpl
import com.hyperone.data.local.AppDatabase
import com.hyperone.data.local.OrdersDao
import com.hyperone.data.repository.FirestoreRepositoryImpl
import com.hyperone.domain.repository.FirestoreRepository
import com.hyperone.domain.repository.MagentoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideMagentoRepository(
        apiService: ApiService
    ): MagentoRepository {
        return MagentoRepositoryImpl(apiService)
    }

    @Provides
    fun provideFirestoreRepo(firestore: FirebaseFirestore): FirestoreRepository {
        return FirestoreRepositoryImpl(firestore)
    }

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "driver"
        ).build()

    @Singleton
    @Provides
    fun provideOrdersDao(appDatabase: AppDatabase) = appDatabase.ordersDao()
}