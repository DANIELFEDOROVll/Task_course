package com.example.feature_login.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core_ui.VK_Blue
import com.example.core_ui.gradientOdnoklassniki


@Composable
fun SocialMediasElement(){
    Row(
        modifier = Modifier
            .height(40.dp)
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            modifier = Modifier
                .weight(1f)
                .background(VK_Blue, shape = RoundedCornerShape(30.dp))
        ) {
            Image(
                painter = painterResource(com.example.core_ui.R.drawable.vk_icon),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .background(gradientOdnoklassniki, shape = RoundedCornerShape(30.dp)),
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
            )
        ) {
            Image(
                painter = painterResource(com.example.core_ui.R.drawable.odnoklassniki),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}