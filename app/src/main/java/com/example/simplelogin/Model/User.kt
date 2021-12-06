package com.example.simplelogin.Model

import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(override val email:String,override val password:String) : IUser {
    override fun isDataValid(): Int {
        if(TextUtils.isEmpty(email)){
            return 0 // = error code is email empty
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return 1 // 1 error code is wrong patterns
        }
        else if(password.length <= 6){
            return 2 // 2 error code is password length be greater than 6
        }
        else
            return -1 // -1 code is successful
    }

}