package com.alejandro.aujapp

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


class PresentationScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun presentationScreenTest() {
        composeTestRule.setContent {
            PresentationScreen()
        }

        composeTestRule.onNodeWithTag("Image1")
            .assertExists()
            .assertIsDisplayed()
        composeTestRule.onNodeWithTag("Image2").assertExists()
            .assertIsDisplayed()
        composeTestRule.onNodeWithTag("Text1").assertExists()
            .assertTextEquals(composeTestRule.activity.getString(R.string.Presentation1))
        composeTestRule.onNodeWithTag("Text2").assertExists()
            .assertTextEquals(composeTestRule.activity.getString(R.string.Presentation2))
        composeTestRule.onNodeWithTag("Text3").assertExists()
            .assertTextEquals(composeTestRule.activity.getString(R.string.Presentation3))


    }
}