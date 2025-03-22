package com.example.feature_login.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.navigation.NavController
import com.example.core_ui.Green
import com.example.core_ui.RobotoFontFamily
import com.example.core_ui.White
import com.example.feature_login.onboarding.content.BoxCourses


@Composable
fun OnboardingScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Тысячи курсов в одном месте",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp)
                .padding(horizontal = 32.dp),
            textAlign = TextAlign.Center,
            fontSize = 28.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = RobotoFontFamily,
            letterSpacing = 0.sp,
            color = White
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
            onClick = {
                navController.navigate("login")
            },
            modifier = Modifier
                .height(45.dp)
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

