package com.etisalat.data.remote

import com.hyperone.domain.model.MessageResponse
import com.hyperone.domain.model.comment.CommentRequest
import com.hyperone.domain.model.order.OrderResponse
import com.hyperone.domain.model.status.OrderStatusRequest
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Interface for API service.
 */
interface ApiService {

    @GET("orders/{orderNumber}")
    suspend fun gerOrder(@Path("orderNumber") number: String): Flow<OrderResponse>

    @POST("orders/{orderNumber}/status")
    @Headers("Content-Type: application/json")
    suspend fun orderStatusUpdate(
        @Path("orderNumber") orderNumber: String,
        @Body orderStatusRequest: OrderStatusRequest
    ): Flow<MessageResponse>

    @POST("orders/comments")
    @Headers("Content-Type: application/json")
    suspend fun addComment(@Body commentRequest: CommentRequest): Flow<MessageResponse>

}