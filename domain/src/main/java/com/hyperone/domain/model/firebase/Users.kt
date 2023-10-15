package com.hyperone.domain.model.firebase

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Entity(tableName = "users")
@Parcelize
data class Users(
    val userId: String,
    val fullName: String,
    val password: String,
    val phoneNumber: String,
    val nationalId: String,
    val moduleName: String,
    val branchName: String,
    val departmentName: String,
    val jobName: String,
    val userStatus: Boolean
) : Parcelable
