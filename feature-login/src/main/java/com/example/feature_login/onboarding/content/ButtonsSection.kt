package com.example.feature_login.onboarding.content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun ButtonsSection(buttons: List<InfButton>, height: Int){
    Box(
        modifier = Modifier
            .height(height.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            buttons.forEach {
                if(it.isRotating && it.clockwise != null){
                    RotatingButtonForSection(it.text, it.clockwise)
                }
                else{
                    ButtonForSection(it.text)
                }
                Spacer(modifier = Modifier.width(4.dp))
            }
        }
    }
}

data class InfButton(
    val text: String,
    val isRotating: Boolean,
    val clockwise: Boolean? = null,
    val down: Boolean? = null,
)

