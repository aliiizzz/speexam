package com.speexam.login

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.runner.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class LoginTest {

    @Before
    fun setup() {
    }

    @Test fun testSample() {
        val scenario = launchFragmentInContainer<FragmentLogin>()
        onView(withId(R.id.edit_text_login_password)).check(ViewAssertions.matches(isDisplayed()))
        onView(withHint("Email")).check(ViewAssertions.matches(isDisplayed()))
    }
}