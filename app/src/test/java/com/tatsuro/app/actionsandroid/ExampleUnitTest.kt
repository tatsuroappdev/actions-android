package com.tatsuro.app.actionsandroid

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@Config(sdk = [28])
@RunWith(AndroidJUnit4::class)
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun appName_isCorrect() {
        val context = InstrumentationRegistry.getInstrumentation().context
        val appName = context.getString(R.string.app_name)
        assertEquals(appName, "ActionsAndroid")
    }
}
