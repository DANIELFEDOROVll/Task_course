package com.example.feature_home.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.Green
import com.example.core_ui.RobotoFontFamily
import com.example.feature_home.R

@Composable
fun TextDateAdd(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(16.dp),
        horizontalArrangement = Arrangement.Absolute.Right
    ) {
        Text(
            text = "По дате добавления",
            fontSize = 14.sp,
            fontFamily = RobotoFontFamily,
            color = Green,
        )
        Image(
            painter = painterResource(com.example.core_ui.R.drawable.vector),
            contentDescription = null,
        )
    }
}