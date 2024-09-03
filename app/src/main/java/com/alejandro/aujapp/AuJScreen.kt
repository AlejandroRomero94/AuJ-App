package com.alejandro.aujapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun AuJScreen(){


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_drawer),contentDescription = "background",
            modifier = Modifier.fillMaxSize().testTag("Image1"),
            contentScale = ContentScale.Crop
        )
        LazyColumn(modifier= Modifier
            .fillMaxSize()
            .padding(
                top = 120.dp,
                start = 24.dp,
                end = 24.dp,
                bottom = 40.dp
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item{
                Box(modifier = Modifier
                    .size(200.dp)
                    .size(200.dp),
                    contentAlignment = Alignment.Center
                ){
                    Image(painter = painterResource(id = R.drawable.coding2),
                        contentDescription = "Coding logo",
                        modifier=Modifier
                            .fillMaxSize()
                            .clip(CircleShape)
                            .border(5.dp, Color.White, CircleShape)
                            .testTag("Image2"))

                }

                Text(
                    text = stringResource(id = R.string.AuJ1),
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.padding(top=64.dp).testTag("Text1"),
                )

                Text(
                    text = stringResource(id = R.string.AuJ2),
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.padding(top=32.dp).testTag("Text2"),
                )


            }

        }



    }
}