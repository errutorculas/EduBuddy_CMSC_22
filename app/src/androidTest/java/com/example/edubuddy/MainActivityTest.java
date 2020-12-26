package com.example.edubuddy;

import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

/**
 * Test-Driven Development: Instrumentation Testing for MainActivity or Home
 *
 * Instrumented test, which will execute on an Android device: UI Tests
 * Using Android JUnit4, and Espresso frameworks for TDD
 *
 */

public class MainActivityTest {
    /**
     * UI test for the widgets button.
     */
    @Test
    public void buttonClick(){
        onView(withId(R.id.search_button)).perform(click());
        onView(withId(R.id.search_input)).perform(typeText("search anything"));
        onView(withId(R.id.back_button)).perform(click());
        onView(withId(R.id.menu_button)).perform(click());
        onView(withId(R.id.subjects_button)).perform(click());
        onView(withId(R.id.messages_button)).perform(click());
        onView(withId(R.id.logout_button)).perform(click());
        onView(withId(R.id.username_input)).perform(typeText("juandelacruz"));
        onView(withId(R.id.password_input)).perform(typeText("12345"));
        onView(withId(R.id.login_button)).perform(click());
    }
}