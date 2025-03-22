package com.example.feature_home


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.feature_home.content.CourseCard
import com.example.feature_home.content.SearchBar
import com.example.feature_home.content.TextDateAdd
import org.koin.androidx.compose.koinViewModel


@Composable
fun HomeScreen(navController: NavController ,viewModel: HomeViewModel = koinViewModel()){

    val courses = viewModel.courses.collectAsState().value?.courses

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar()

        Spacer(modifier = Modifier.height(16.dp))
        TextDateAdd()
        Spacer(modifier = Modifier.height(16.dp))

        courses?.forEach {
            CourseCard(it)
            Spacer(modifier = Modifier.height(16.dp))
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}