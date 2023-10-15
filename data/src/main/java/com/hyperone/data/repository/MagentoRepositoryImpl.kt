package com.hyperone.data.repository

import com.etisalat.data.remote.ApiService
import com.hyperone.domain.model.MessageResponse
import com.hyperone.domain.model.comment.CommentRequest
import com.hyperone.domain.model.order.OrderResponse
import com.hyperone.domain.model.status.OrderStatusRequest
import com.hyperone.domain.repository.MagentoRepository
import kotlinx.coroutines.flow.Flow

/**
 * Implementation of [MagentoRepository] interface.
 *
 * @param apiService API service for retrieving recipes from the remote API.
 */
class MagentoRepositoryImpl(
    private val apiService: ApiService
) : MagentoRepository {

    override suspend fun geOrder(orderNumber: String): Flow<OrderResponse> =
        apiService.gerOrder(orderNumber)

    override suspend fun orderStatusUpdate(
        orderNumber: String,
        orderStatusRequest: OrderStatusRequest
    ): Flow<MessageResponse> = apiService.orderStatusUpdate(orderNumber, orderStatusRequest)

    override suspend fun addComment(commentRequest: CommentRequest): Flow<MessageResponse> =
        apiService.addComment(commentRequest)

}