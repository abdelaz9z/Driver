package com.hyperone.domain.usecase

import com.google.firebase.auth.AuthCredential
import com.hyperone.domain.repository.AuthRepository
import javax.inject.Inject

class AuthUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {

    fun signOutUser() = authRepository.signOutUser()

    fun signWithGoogle(credential: AuthCredential) = authRepository.signInWithGoogle(credential)
}