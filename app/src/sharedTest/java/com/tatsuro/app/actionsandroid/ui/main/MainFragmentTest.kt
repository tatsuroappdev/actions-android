package com.tatsuro.app.actionsandroid.ui.main

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.tatsuro.app.actionsandroid.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainFragmentTest {

    @Test
    fun mainFragmentTest() {

        val scenario = launchFragmentInContainer<MainFragment>()

        Espresso.onView(ViewMatchers.withId(R.id.button))
            .check(ViewAssertions.matches(ViewMatchers.withText("0")))

        Espresso.onView(ViewMatchers.withId(R.id.button))
            .perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.withText("1")))

        scenario.recreate()

        Espresso.onView(ViewMatchers.withId(R.id.button))
            .check(ViewAssertions.matches(ViewMatchers.withText("1")))

        Espresso.onView(ViewMatchers.withId(R.id.button))
            .perform(ViewActions.click())
            .check(ViewAssertions.matches(ViewMatchers.withText("2")))
    }
}
