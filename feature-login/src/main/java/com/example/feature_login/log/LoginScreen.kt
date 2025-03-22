package com.example.feature_login.log

import androidx.compose.foundation.background
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.core_ui.Green
import com.example.core_ui.RobotoFontFamily
import com.example.core_ui.Stroke
import com.example.domain.SetFirstLaunchCompletedUseCase
import com.example.feature_login.log.content.EmailField
import com.example.feature_login.log.content.ForgetPasswordText
import com.example.feature_login.log.content.PasswordField
import com.example.feature_login.log.content.SocialMediasElement


@Composable
fun LoginScreen(navController: NavController, setCompleted: SetFirstLaunchCompletedUseCase){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(100.dp))

        Text(
            "Вход",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            textAlign = TextAlign.Left,
            fontSize = 28.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = RobotoFontFamily,
            letterSpacing = 0.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(28.dp))

        EmailField()

        Spacer(modifier = Modifier.height(16.dp))

        PasswordField()

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                setCompleted()
                navController.navigate("home")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(bottom = 16.dp)
                .background(Green, shape = RoundedCornerShape(30.dp)),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Transparent
            )
            ) {
            Text(
                text ="Вход",
                fontFamily = RobotoFontFamily,
                fontSize = 14.sp
            )
        }

        ForgetPasswordText()

        Spacer(modifier = Modifier.height(32.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(color = Stroke)
                .padding(bottom = 32.dp),
        ){}

        Spacer(modifier = Modifier.height(32.dp))

        SocialMediasElement()
    }
}