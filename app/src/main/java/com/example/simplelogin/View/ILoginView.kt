package com.example.simplelogin.View

interface ILoginView {

    fun onLoginSuccess(message : String)
    fun onLoginError(message: String)
}