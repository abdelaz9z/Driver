package com.hyperone.domain.model.order

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Delivery(
    val date: String,
    val method: String,
    val time: String
) : Parcelable