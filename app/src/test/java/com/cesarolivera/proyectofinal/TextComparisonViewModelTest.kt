package com.cesarolivera.proyectofinal

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.cesarolivera.proyectofinal.view.MainViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TextComparisonViewModelUnitTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun testTextComparison_SameTexts() {
        viewModel.primerTexto.value = "hello"
        viewModel.segundoTexto.value = "hello"
        viewModel.compareTexts()

        assertEquals("Los textos son iguales.", viewModel.resultLiveData.value)
    }

    @Test
    fun testTextComparison_DifferentTexts() {
        viewModel.primerTexto.value = "hello"
        viewModel.segundoTexto.value = "world"
        viewModel.compareTexts()

        assertEquals("Los textos son diferentes.", viewModel.resultLiveData.value)
    }
}
