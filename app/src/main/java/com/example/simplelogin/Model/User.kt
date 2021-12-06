package com.example.simplelogin.Model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(override val email:String,override val password:String) : IUser {
    override val isDataValid: Boolean
        get() = (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
                && password.length > 6)
}