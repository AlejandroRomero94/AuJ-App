package com.alejandro.aujapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class MainScreenTest{

    @get:Rule
    val composeTestRule=createComposeRule()

    @Test
    fun mainScreenTest(){

        composeTestRule.onNodeWithTag("TopAppBarText")
        composeTestRule.onNodeWithTag("IconText")


    }
}