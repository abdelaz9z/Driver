package com.hyperone.domain.model.order

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Address(
    val city: String,
    val district: String,
    val govern: String,
    @SerializedName("shipping_address")
    @Expose
    val shippingAddress: String
) : Parcelable