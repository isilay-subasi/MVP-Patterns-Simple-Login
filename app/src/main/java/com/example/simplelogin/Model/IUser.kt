package com.example.simplelogin.Model

interface IUser {

    val email : String
    val password : String
    fun isDataValid() : Int
}