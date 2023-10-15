package com.hyperone.domain.model.order

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    val name: String,
    val price: Double,
    val quantity: Double,
    val sku: String,
    @SerializedName("unit_of_measurement")
    @Expose
    val unitOfMeasurement: String
) : Parcelable