package com.cesarolivera.proyectofinal

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import com.cesarolivera.proyectofinal.view.MainActivity
import org.junit.Rule
import org.junit.Test

@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)
    //var rule : ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompararMismosTextos() {
        onView(withId(R.id.primerTexto)).perform(typeText("Cesar"), closeSoftKeyboard())
        onView(withId(R.id.segundoTexto)).perform(typeText("Cesar"), closeSoftKeyboard())
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Los textos son iguales.")))
    }

    @Test
    fun testCompararDiferentesTextos() {
        onView(withId(R.id.primerTexto)).perform(typeText("Cesar"), closeSoftKeyboard())
        onView(withId(R.id.segundoTexto)).perform(typeText("Olivera"), closeSoftKeyboard())
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Los textos son diferentes.")))
    }
}
