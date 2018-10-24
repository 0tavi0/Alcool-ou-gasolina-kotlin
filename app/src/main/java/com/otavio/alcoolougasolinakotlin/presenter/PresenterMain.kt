package com.otavio.alcoolougasolinakotlin.presenter

import com.otavio.alcoolougasolinakotlin.interfaces.MainInterface
import kotlinx.android.synthetic.main.activity_main.*

class PresenterMain(var view : MainInterface.View) : MainInterface.Presenter {



    override fun Calcular(alcool: String, gasolina: String) {

        var precoAlcool = alcool.toDouble()
        var precoGasolina = gasolina.toDouble()


        var resultado =  precoAlcool / precoGasolina

        if (resultado <= 0.7){
          view.passarOutraTela("Álcool")
        }else{
           view.passarOutraTela("Gasolina")
        }

    }


    override fun validar(alcool: String, gasolina: String): Boolean {

        if (alcool == null || alcool.equals("")){
            return false
        } else if (gasolina == null || gasolina.equals("")){
            return false
        }

        return true


    }
}


//var validar =  validar(alcool, gasolina)
//if (validar){
//    calcular()
//
//}else{
//    txt_resultado.setText("Inserir preço")
//}