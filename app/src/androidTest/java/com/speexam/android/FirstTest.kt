package com.speexam.android

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Test

class FirstTest {

    @Test
    fun firstOne() {
        Espresso.onView(ViewMatchers.withText("Hello world!")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}