package com.example.feature_onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.Green
import com.example.feature_onboarding.content.BoxCourses


@Composable
fun OnboardingScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Тысячи курсов в одном месте",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            textAlign = TextAlign.Center,
            fontSize = 28.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Default,
            letterSpacing = 0.sp

        )
        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .graphicsLayer { clip = false }
        ) {
            BoxCourses()
        }

        Spacer(modifier = Modifier.height(144.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Green,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(100.dp)
        ){
            Text("Продолжить")
        }
    }
}

