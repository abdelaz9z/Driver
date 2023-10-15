package com.hyperone.domain.model.order

import android.os.Parcelable
import androidx.room.Embedded
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Customer(
    @Embedded
    val address: Address,
    @SerializedName("customer_code")
    @Expose
    val customerCode: String,
    val name: String,
    @SerializedName("phone_number")
    @Expose
    val phoneNumber: String
): Parcelable
