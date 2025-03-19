package com.example.feature_onboarding.content

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp


@Composable
fun BoxCourses(){
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    Column(
        modifier = Modifier
            .offset(45.dp)
            .offset(x = (-45).dp)
            .requiredWidth(screenWidth + 90.dp)
    ) {
        ButtonsSection(
            listOf(
                InfButton("1С Администрирование", false),
                InfButton("RabbitMQ", true, false),
                InfButton("Трафик", false),
            ),
            60
        )

        Spacer(modifier = Modifier.padding(top = 8.dp))
        ButtonsSection(
            listOf(
                InfButton("Контент маркетинг", false),
                InfButton("B2B маркетинг", false),
                InfButton("Google Аналитика", false),
            ),
            52
        )

        Spacer(modifier = Modifier.padding(top = 8.dp))
        ButtonsSection(
            listOf(
                InfButton("UX исследователь", false),
                InfButton("Веб-аналитика", false),
                InfButton("Big Data", true, true),
            ),
            60
        )

        Spacer(modifier = Modifier.padding(top = 8.dp))
        ButtonsSection(
            listOf(
                InfButton("Геймдизайн", false),
                InfButton("Веб-дизайн", false),
                InfButton("Cinema 4D", false,),
                InfButton("Промпт инженеринг", false),
            ),
            52
        )

        Spacer(modifier = Modifier.padding(top = 8.dp))
        ButtonsSection(
            listOf(
                InfButton("Webflow", false),
                InfButton("Three.js", true, false),
                InfButton("Парсинг", false, false),
                InfButton("Python-разработка", false, false),
            ),
            60
        )
    }
}
