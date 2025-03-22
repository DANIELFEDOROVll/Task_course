package com.example.feature_login.onboarding.content

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.Glass
import com.example.core_ui.RobotoFontFamily


@Composable
fun ButtonForSection(text: String){
    Button(
        onClick = {

        },
        modifier = Modifier
            .fillMaxHeight(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Glass
        ),
        shape = RoundedCornerShape(100.dp)
    ){
        Text(
            text = text,

        )
    }
}
