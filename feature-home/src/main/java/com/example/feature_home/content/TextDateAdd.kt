package com.example.feature_home.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Absolute.Right,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            text = "По дате добавления",
            fontSize = 14.sp,
            fontFamily = RobotoFontFamily,
            color = Green,
        )
        Spacer(modifier = Modifier.width(4.dp))
        Image(
            painter = painterResource(com.example.core_ui.R.drawable.vector),
            contentDescription = null,
            modifier = Modifier
                .height(13.dp)
        )
    }
}