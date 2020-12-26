package com.example.edubuddy;

import android.content.Context;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
   * Test-Driven Development: Instrumentation Testing
   *
   * Instrumented test, which will execute on an Android device.
   * Using Android JUnit4, and Espresso frameworks for TDD
   *
   * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
   */
  @RunWith(AndroidJUnit4.class)
  public class InstrumentedTest{
      /**
       * For instrumentation test purposes only. useAppContext function
       *
       * @version 1.0
       * @since 2020-12-15
       */

      @Test
      public void useAppContext() {
          // Context of the app under test.
          Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
          assertEquals("com.example.edubuddy", appContext.getPackageName());
      }
  }