package com.alejandro.aujapp.presentation

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import com.alejandro.aujapp.AuJScreen
import com.alejandro.aujapp.domain.model.NavigationItem
import com.alejandro.aujapp.presentation.component.CustomDrawer
import org.junit.Rule
import org.junit.Test

class CustomDrawerTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun customDrawerTest() {
        composeTestRule.setContent {
            CustomDrawer(
                selectedNavigationItem = NavigationItem.Presentation,
                onNavigationItemClick = {},
                onCloseClick = {})

        }
        //Finder
        composeTestRule.onNodeWithTag("Drawer").assertExists().assertIsDisplayed()
        composeTestRule.onNodeWithTag("Image1").assertExists()
        composeTestRule.onNodeWithContentDescription("Back Arrow Icon").assertExists()
        composeTestRule.onNodeWithTag("Image2").assertExists()

    }
}