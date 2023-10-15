package com.hyperone.domain.model.order

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "orders")
data class OrderResponse(
    val currency: String,
    @Embedded
    val customer: Customer,
    @Embedded
    val delivery: Delivery,
    @SerializedName("grand_total")
    @Expose
    val grandTotal: Double,
    @Embedded
    val items: List<Item>,
    @SerializedName("order_number")
    @Expose
    @PrimaryKey
    val orderNumber: String,
    @SerializedName("out_from_site")
    @Expose
    val outFromSite: String,
    @SerializedName("outbound_delivery")
    @Expose
    val outboundDelivery: String,
    @SerializedName("payment_method")
    @Expose
    val paymentMethod: String,
    @SerializedName("picker_confirmation_time")
    @Expose
    val pickerConfirmationTime: String,
    @SerializedName("reedemed_points_amount")
    @Expose
    val reedemedPointsAmount: Int,
    @SerializedName("shipping_fees")
    @Expose
    val shippingFees: Int,
    val status: String
) : Parcelable