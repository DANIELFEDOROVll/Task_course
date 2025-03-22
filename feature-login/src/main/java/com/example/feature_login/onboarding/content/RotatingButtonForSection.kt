package com.example.feature_login.onboarding.content

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.Green
import com.example.core_ui.RobotoFontFamily

@Composable
fun RotatingButtonForSection(text: String, clockwise: Boolean,){
    val rotate = if(clockwise) 15f else -15f
    //val padd = if(down) 20.dp else 0.dp

    Button(
        onClick = {

        },
        modifier = Modifier
            .fillMaxHeight()
            .rotate(rotate)
            //.padding(bottom = 10.dp, top = padd)
                ,
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

 