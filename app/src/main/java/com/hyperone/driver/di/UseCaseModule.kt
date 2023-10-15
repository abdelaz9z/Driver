package com.etisalat.recipes.di

import com.hyperone.domain.repository.FirestoreRepository
import com.hyperone.domain.repository.OrdersRepository
import com.hyperone.domain.repository.MagentoRepository
import com.hyperone.domain.usecase.FirebaseUseCase
import com.hyperone.domain.usecase.OrdersCRUD
import com.hyperone.domain.usecase.MagentoUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideMagentoRepositoryUseCase(magentoRepository: MagentoRepository): MagentoUseCase {
        return MagentoUseCase(magentoRepository)
    }

    @Provides
    fun provideFirebaseUseCase(firestoreRepository: FirestoreRepository): FirebaseUseCase {
        return FirebaseUseCase(firestoreRepository)
    }

    @Singleton
    @Provides
    fun provideOrdersCRUD(ordersRepository: OrdersRepository): OrdersCRUD {
        return OrdersCRUD(ordersRepository)
    }
}