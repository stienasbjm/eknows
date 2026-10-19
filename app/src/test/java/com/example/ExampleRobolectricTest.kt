package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
class ExampleRobolectricTest {

  @Test
  fun `read app name string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("STIENAS LMS", appName)
  }

  @Test
  fun `verify assets bundled with LMS SPA index html`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val assets = context.assets.list("www")
    assertNotNull(assets)
    val hasIndexHtml = assets?.contains("index.html") ?: false
    assertEquals(true, hasIndexHtml)
  }
}
