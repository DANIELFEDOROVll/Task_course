package com.example.feature_home.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.core_ui.DarkGray
import com.example.core_ui.LightGray
import com.example.feature_home.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    var searchText by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        // Поле поиска с weight, чтобы оставить место для кнопки
        TextField(
            value = searchText,
            onValueChange = { searchText = it },
            modifier = Modifier
                .weight(1f) // Занимает всё доступное пространство
                .height(56.dp),
            placeholder = {
                Text(
                    text = "Search courses...",
                    color = Color.Gray
                )
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(com.example.core_ui.R.drawable.icon_search),
                    contentDescription = "Search",
                    modifier = Modifier.size(56.dp), // Исправленный размер иконки
                    tint = Color.White
                )
            },
            shape = RoundedCornerShape(30.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = DarkGray,
                cursorColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.width(8.dp)) // Отступ между полем и кнопкой

        // Кнопка фильтра
        IconButton(
            onClick = {},
            modifier = Modifier
                .size(56.dp),
            colors = IconButtonDefaults.iconButtonColors(
                contentColor = LightGray
            )

        ) {
            Image(
                painter = painterResource(com.example.core_ui.R.drawable.filter_button),
                contentDescription = "Filter",
                modifier = Modifier.size(56.dp) // Размер иконки фильтра,
            )
        }
    }
}