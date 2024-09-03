package com.alejandro.aujapp

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.rememberNavController
import com.alejandro.aujapp.domain.model.CustomDrawerState
import org.junit.Rule
import org.junit.Test

class MainScreenTest{

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun testTopAppBarTitleDisplayed() {
        composeTestRule.setContent {
            MainContent(
                drawerState = CustomDrawerState.Closed,
                onDrawerClick = {},
                navController = rememberNavController()
            )
        }

        composeTestRule.onNodeWithTag("TopAppBarText")
            .assertIsDisplayed()
            .assertTextEquals(composeTestRule.activity.getString(R.string.topAppBarText))
    }

    @Test
    fun testDrawerIconClickTriggersDrawerStateChange() {
        var drawerState = CustomDrawerState.Closed

        composeTestRule.setContent {
            MainContent(
                drawerState = drawerState,
                onDrawerClick = { state -> drawerState = state },
                navController = rememberNavController()
            )
        }

        // Click on the drawer icon
        composeTestRule.onNodeWithTag("IconImage").isDisplayed()
        composeTestRule.onNodeWithTag("IconButton").assertExists().performClick()

        // Check that the drawer state is changed to the opposite state
        assert(drawerState == CustomDrawerState.Opened)
    }

    @Test
    fun testNavHostStartsWithPresentationScreen() {
        composeTestRule.setContent {
            MainContent(
                drawerState = CustomDrawerState.Closed,
                onDrawerClick = {},
                navController = rememberNavController()
            )
        }

    }

    @Test
    fun testScaffoldClickClosesDrawerWhenOpened() {
        var drawerState = CustomDrawerState.Opened

        composeTestRule.setContent {
            MainContent(
                drawerState = drawerState,
                onDrawerClick = { state -> drawerState = state },
                navController = rememberNavController()
            )
        }

        // Perform click on the Scaffold
        composeTestRule.onRoot().performClick()

        // Check that the drawer state is changed to Closed
        assert(drawerState == CustomDrawerState.Closed)
    }
}