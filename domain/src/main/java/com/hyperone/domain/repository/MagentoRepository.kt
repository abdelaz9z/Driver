package com.hyperone.domain.repository

import com.hyperone.domain.model.MessageResponse
import com.hyperone.domain.model.comment.CommentRequest
import com.hyperone.domain.model.order.OrderResponse
import com.hyperone.domain.model.status.OrderStatusRequest
import com.hyperone.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

typealias OrderResponse = Resource<OrderResponse, String>

interface MagentoRepository {

    suspend fun geOrder(orderNumber: String): Flow<OrderResponse>

    suspend fun orderStatusUpdate(
        orderNumber: String,
        orderStatusRequest: OrderStatusRequest
    ): Flow<MessageResponse>

    suspend fun addComment(commentRequest: CommentRequest): Flow<MessageResponse>

}