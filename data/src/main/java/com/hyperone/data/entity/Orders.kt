package com.hyperone.data.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "orders")
data class Orders(
    val currency: String,
    // =============================================================================================
    // address data
    // =============================================================================================
    val city: String,
    val district: String,
    val govern: String,
    @ColumnInfo(name = "shipping_address")
    val shippingAddress: String,
    // =============================================================================================
    // customer data
    // =============================================================================================
    @ColumnInfo(name = "customer_code")
    val customerCode: String,
    val name: String,
    @ColumnInfo(name = "phone_number")
    val phoneNumber: String,
    // =============================================================================================
    // delivery data
    // =============================================================================================
    val date: String,
    val method: String,
    val time: String,
    // =============================================================================================
    @ColumnInfo(name = "grand_total")
    val grandTotal: Double,
    @PrimaryKey
    @ColumnInfo(name = "order_number")
    val orderNumber: String,
    @ColumnInfo(name = "out_from_site")
    val outFromSite: String,
    @ColumnInfo(name = "outbound_delivery")
    val outboundDelivery: String,
    @ColumnInfo(name = "payment_method")
    val paymentMethod: String,
    @ColumnInfo(name = "picker_confirmation_time")
    val pickerConfirmationTime: String,
    @ColumnInfo(name = "reedemed_points_amount")
    val reedemedPointsAmount: Int,
    @ColumnInfo(name = "shipping_fees")
    val shippingFees: Int,
    val status: String
) : Parcelable