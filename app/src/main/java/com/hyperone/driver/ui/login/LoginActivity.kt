package com.hyperone.driver.ui.login

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.casecode.pos.utils.FirebaseResult
import com.hyperone.domain.model.firebase.Users
import com.hyperone.domain.utils.ErrorMessage
import com.hyperone.domain.utils.UESRS_PATH
import com.hyperone.driver.databinding.ActivityLoginBinding
import com.hyperone.driver.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getDocuments(UESRS_PATH, "35389")
            .observe(this) { documents ->
                // Update UI with the documents
                when (documents) {
                    is FirebaseResult.Success -> {
                        val users: Users = documents.data
                        ErrorMessage.print(users.fullName)
                    }

                    is FirebaseResult.Failure -> {
                        val exception = documents.exception
                        Timber.e(exception.message)
                    }
                }
            }

    }
}