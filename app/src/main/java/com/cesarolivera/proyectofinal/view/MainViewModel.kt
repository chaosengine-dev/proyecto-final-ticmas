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
}