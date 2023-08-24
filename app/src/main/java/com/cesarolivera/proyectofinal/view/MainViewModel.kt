package com.cesarolivera.proyectofinal.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var primerTexto = MutableLiveData<String>()
    var segundoTexto = MutableLiveData<String>()
    private val _resultLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String> = _resultLiveData

    fun compareTexts() {
        val text1 = primerTexto.value ?: ""
        val text2 = segundoTexto.value ?: ""
        val areEqual = text1 == text2
        _resultLiveData.value = if (areEqual) "Los textos son iguales." else "Los textos son diferentes."
    }
    //val datos: LiveData<Datos> get() = _datos
    //private var _datos = MutableLiveData<Datos>(Datos("","",""))

    //val areTextsEqual = MutableLiveData<Boolean>()

    //val datos = MutableLiveData(Datos("", "", ""))

    /*fun compareTexts(text1: String, text2: String) {
        areTextsEqual.value = text1 == text2
    }
    fun compareTexts(){
        val text1 = _datos.value?.primerTexto ?: ""
        val text2 = _datos.value?.segundoTexto ?: ""
        val areEqual = text1 == text2
        val resultMessage = if (areEqual) "Los textos son iguales." else "Los textos son diferentes."
        println(resultMessage)
        _datos.value?.resultTextView = resultMessage
    }*/
}