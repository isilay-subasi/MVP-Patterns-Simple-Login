package com.example.simplelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.simplelogin.Presenter.ILoginPresenter
import com.example.simplelogin.Presenter.LoginPresenter
import com.example.simplelogin.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ILoginView {


internal lateinit var loginPresenter : ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Init
        loginPresenter = LoginPresenter(this)

        //event
        btn_login.setOnClickListener {
            loginPresenter.onLogin(edt_email.text.toString(),edt_password.text.toString())
        }

    }

    override fun onLoginSuccess(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

    override fun onLoginError(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }


}