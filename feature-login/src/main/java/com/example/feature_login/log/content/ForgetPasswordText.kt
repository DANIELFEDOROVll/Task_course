package com.example.feature_login.log.content

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.RobotoFontFamily

@Composable
fun ForgetPasswordText(){
    Text(
        text = "Нету аккаунта? Регистрация",
        fontSize = 12.sp,
        fontFamily = RobotoFontFamily,
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = Color.White
    )

    Text(
        text = "Забыл пароль",
        fontSize = 12.sp,
        fontFamily = RobotoFontFamily,
        modifier = Modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        color = Color.White
    )
}