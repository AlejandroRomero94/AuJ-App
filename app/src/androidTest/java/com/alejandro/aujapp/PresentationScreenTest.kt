package com.alejandro.aujapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class PresentationScreenTest {

    @get:Rule
    val composeTestRule= createComposeRule()

    @Test
    fun presentationScreenTest(){
        composeTestRule.setContent {
            PresentationScreen()
        }

        //Finder
        composeTestRule.onNodeWithTag("Image1")
        composeTestRule.onNodeWithTag("Image2")
        composeTestRule.onNodeWithTag("Text1")
        composeTestRule.onNodeWithTag("Text2")
        composeTestRule.onNodeWithTag("Text3")
    }
}