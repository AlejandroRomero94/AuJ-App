package com.alejandro.aujapp

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class CareerScreenTest{

    @get:Rule
    val composeTestRule= createAndroidComposeRule<ComponentActivity>()


    @Test
    fun careerScreenTest(){

        composeTestRule.setContent {
            CareerScreen()
        }

        //Finder
        composeTestRule.onNodeWithTag("Image1").assertExists()
            .assertIsDisplayed()
        composeTestRule.onNodeWithTag("Image2").assertExists()
            .assertIsDisplayed()
        composeTestRule.onNodeWithTag("Text1").assertTextEquals(composeTestRule.activity.getString(R.string.Career1))
        composeTestRule.onNodeWithTag("Text2").assertTextEquals(composeTestRule.activity.getString(R.string.Career2))
        composeTestRule.onNodeWithTag("Text3").assertTextEquals(composeTestRule.activity.getString(R.string.Career3))




    }


}