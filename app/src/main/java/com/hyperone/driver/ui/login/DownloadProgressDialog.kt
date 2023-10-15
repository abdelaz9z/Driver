package com.hyperone.driver.ui.login

import android.app.Dialog
import android.os.Bundle
import android.view.*
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.hyperone.driver.R
import com.hyperone.driver.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class DownloadProgressDialog : DialogFragment() {

    @Inject
    lateinit var loginViewModel: LoginViewModel

    private lateinit var progressDialog: Dialog

    private lateinit var progressValue: TextView

    private lateinit var progressBar: ProgressBar

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        observeProgress()
        progressDialog = Dialog(requireContext())

        progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        progressDialog.setCancelable(false);
        progressDialog.setContentView(R.layout.progress_dialog)
        progressBar = progressDialog.findViewById<View>(R.id.progress_horizontal) as ProgressBar


        progressValue = progressDialog.findViewById<TextView>(R.id.value)
        progressDialog.show()
//        progressBar.progress = 30
        progressValue.text = (30.toString())
        val window: Window = progressDialog.window!!
        window.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        return progressDialog
    }

    private fun observeProgress() {
        loginViewModel.downloadProgress.observe(this) {
            it?.let { status ->
                GlobalScope.launch {
                    progressBar.max = 50
                    progressBar.progress = 20
                    progressBar.progress = 0 // <--
                    progressBar.max = 20
                    progressBar.progress = 20
                }
            }
        }
    }
}