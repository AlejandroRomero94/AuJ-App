package com.alejandro.aujapp.presentation

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import com.alejandro.aujapp.domain.model.NavigationItem
import com.alejandro.aujapp.presentation.component.NavigationItemView
import org.junit.Rule
import org.junit.Test

class NavigationItemViewTest {
    @get:Rule
    val composeTestRule= createComposeRule()



    @Test
    fun navigationItemViewTest(){
        composeTestRule.setContent {
            NavigationItemView(navigationItem= NavigationItem.Presentation,
                selected = false, onClick = {})

        }
        //Finder

        composeTestRule.onNodeWithText(NavigationItem.entries.toString())


    }

}