package com.hyperone.domain.usecase

import com.hyperone.domain.repository.MagentoRepository
import javax.inject.Inject

class MagentoUseCase @Inject constructor(
    private val magentoRepository: MagentoRepository
) {
    suspend fun getOrder(orderNumber: String) = magentoRepository.geOrder(orderNumber)
}