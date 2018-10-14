package com.otavio.alcoolougasolinakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcular.setOnClickListener(View.OnClickListener {
            calcular()
        })



    }


    fun calcular(){
        var precoAlcool = edt_alcool.text.toString().toDouble()
        var precoGasolina = edt_gasolina.text.toString().toDouble()


        var resultado =  precoAlcool / precoGasolina

        if (resultado > 0.7){
            passarOutraTela("Gasolina")
        }else{
            passarOutraTela("Álcool")
        }


    }

    fun passarOutraTela(resultado:String){
        val  intent = Intent(this, Resultado::class.java)
        intent.putExtra("resultado",resultado)
        startActivity(intent)

    }



}
