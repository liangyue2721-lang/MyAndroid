package com.supper.myapplication.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val _loginResult = MutableLiveData<Boolean>()
    val loginResult: LiveData<Boolean> = _loginResult

    fun login(username: String, password: String) {
        // For now, just check if the username and password are not empty
        if (username.isNotEmpty() && password.isNotEmpty()) {
            _loginResult.value = true
        } else {
            _loginResult.value = false
        }
    }
}