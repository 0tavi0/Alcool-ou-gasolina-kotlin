package com.otavio.alcoolougasolinakotlin.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.otavio.alcoolougasolinakotlin.R
import com.otavio.alcoolougasolinakotlin.activity.Resultado
import com.otavio.alcoolougasolinakotlin.interfaces.MainInterface
import com.otavio.alcoolougasolinakotlin.presenter.PresenterMain
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainInterface.View {


    lateinit var mainPresenter: MainInterface.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = PresenterMain(this)

        btn_calcular.setOnClickListener(View.OnClickListener {
            var alcool = edt_alcool.text.toString()
            var gasolina = edt_gasolina.text.toString()

            var validar = mainPresenter.validar(alcool,gasolina)


            if (validar){
                mainPresenter.Calcular(alcool,gasolina)

            }else{
                MostrarErroCampoEmBranco()
            }

        })



    }



    override fun passarOutraTela(resultado:String){
        val  intent = Intent(this, Resultado::class.java)
        intent.putExtra("resultado",resultado)
        startActivity(intent)

    }


    override fun MostrarErroCampoEmBranco() {
        txt_resultado.setText("Inserir Preço")
    }

    


}
