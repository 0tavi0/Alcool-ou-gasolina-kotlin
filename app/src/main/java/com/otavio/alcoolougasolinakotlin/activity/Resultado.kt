package com.otavio.alcoolougasolinakotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.otavio.alcoolougasolinakotlin.R
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val ss:String = intent.getStringExtra("resultado")

        txtResultado.setText(ss)

    }
}
