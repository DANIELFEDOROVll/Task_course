package com.example.feature_onboarding.content

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import com.example.core_ui.Green

@Composable
fun RotatingButtonForSection(text: String, clockwise: Boolean){
    val rotate = if(clockwise) 15f else -15f

    Button(
        onClick = {

        },
        modifier = Modifier
            .fillMaxHeight()
            .rotate(rotate),
        colors = ButtonDefaults.buttonColors(
            containerColor = Green
        ),
        shape = RoundedCornerShape(100.dp)
    ){
        Text(
            text = text,
        )
    }
}

 