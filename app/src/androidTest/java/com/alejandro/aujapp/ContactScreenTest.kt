package com.alejandro.aujapp

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class ContactScreenTest{

    @get:Rule
    val composeTestRule= createAndroidComposeRule<ComponentActivity>()

    @Test
    fun contactScreenTest(){
        composeTestRule.setContent {
            ContactScreen()
        }

        //Finder
        composeTestRule.onNodeWithTag("Image1").assertExists()
            .assertIsDisplayed()
        composeTestRule.onNodeWithTag("Image2").assertExists()
            .assertIsDisplayed()
        composeTestRule.onNodeWithTag("Text1").assertExists().assertTextEquals(composeTestRule.activity.getString(R.string.Contact1))
        composeTestRule.onNodeWithTag("Text2").assertExists() .assertTextEquals(composeTestRule.activity.getString(R.string.Contact2))





    }
}