package com.example.feature_home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.Green
import com.example.core_ui.RobotoFontFamily
import com.example.feature_home.content.CourseCard
import com.example.feature_home.content.SearchBar
import com.example.feature_home.content.TextDateAdd

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar()

        Spacer(modifier = Modifier.height(16.dp))
        TextDateAdd()
        Spacer(modifier = Modifier.height(16.dp))

        CourseCard("")
    }
}