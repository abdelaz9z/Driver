package com.hyperone.domain.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult

interface AuthRepository {
    fun signInWithGoogle(credential: AuthCredential): Task<AuthResult>
    fun signOutUser()
    suspend fun geMessageToken(): Task<String>
}