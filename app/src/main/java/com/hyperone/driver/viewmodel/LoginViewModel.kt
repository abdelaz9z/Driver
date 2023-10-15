package com.hyperone.driver.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.casecode.pos.utils.FirebaseResult
import com.google.firebase.firestore.DocumentSnapshot
import com.hyperone.domain.model.firebase.Users
import com.hyperone.domain.usecase.FirebaseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    private val application: Application,
    private val firebaseUseCase: FirebaseUseCase
) :
    ViewModel() {

    fun getDocuments(
        collection: String,
        documentId: String
    ): LiveData<FirebaseResult<Users>> {
        val resultLiveData = MutableLiveData<FirebaseResult<Users>>()

        viewModelScope.launch {
            firebaseUseCase.getDocuments(collection, documentId).addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val result: DocumentSnapshot = task.result
                    val users: Users? = result.toObject(Users::class.java)
                    if (users != null) {
                        resultLiveData.value = FirebaseResult.Success(users)
                    }
                } else {
                    Timber.e(task.exception)
                    resultLiveData.value = FirebaseResult.Failure(task.exception!!)
                }
            }
        }

        return resultLiveData
    }
}