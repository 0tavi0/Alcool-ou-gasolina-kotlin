package com.otavio.alcoolougasolinakotlin.interfaces

interface MainInterface {

    interface View{
        fun MostrarErroCampoEmBranco()
        fun passarOutraTela(resultado : String)

    }

    interface Presenter{


        fun validar(alcool: String, gasolina: String) : Boolean

        fun Calcular(alcool: String, gasolina: String)
    }
}