package com.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTextView.setOnClickListener {
            if (showTextView.text.toString() == "Show") {
                passwordEditText.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
                showTextView.text = getString(R.string.hideText)
            } else {
                passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
                showTextView.text = getString(R.string.showText)
            }
        }
    }

}
