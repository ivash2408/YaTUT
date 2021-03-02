package com.ivash.yatut_kontlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnSingIn.setOnClickListener {
            onClickCreateAccountAndEntry()
        }
        btnCreateAccount.setOnClickListener {
            onClickCreateAccountAndEntry()
        }
    }

    fun onClickCreateAccountAndEntry() {
        val login = etLogin?.text.toString()
        val password = etPassword?.text.toString()
        if(!login.isEmpty() && !password.isEmpty()) {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
        else {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
        }
    }
}