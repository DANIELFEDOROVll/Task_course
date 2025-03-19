package com.example.feature_home.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.core_ui.DarkGray

@Composable
fun CourseCard(
    imageUrl: String
){
    Card(
        modifier = Modifier
            .height(236.dp)
            .fillMaxWidth()
            ,
        shape = RoundedCornerShape(16.dp),
        colors = DarkGray,
    ){
        Row {
            Box(
                modifier = Modifier
                    .height(114.dp)
            ) {
                AsyncImage(
                    model = imageUrl,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                //другие элементы
            }

            Row(
                modifier = Modifier.padding(horizontal = 12.dp)
            ) {

            }
        }
    }
}