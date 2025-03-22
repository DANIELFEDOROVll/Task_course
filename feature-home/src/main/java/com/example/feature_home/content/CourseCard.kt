package com.example.feature_home.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core_ui.DarkGray
import com.example.core_ui.Glass
import com.example.core_ui.Green
import com.example.core_ui.RobotoFontFamily
import com.example.core_ui.White
import com.example.domain.Course
import com.example.feature_home.R


@Composable
fun CourseCard(
    course: Course
){
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = DarkGray
        )
    ){
        Column {
            Box(
                modifier = Modifier

            ) {
                ImageForCard(course)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp, bottom = 16.dp)
            ) {
                Text(
                    text = course.title,
                    modifier = Modifier.padding(bottom = 12.dp).fillMaxWidth(),
                    fontFamily = RobotoFontFamily,
                    fontSize = 17.sp,
                    textAlign = TextAlign.Left,
                    color = White,

                )

                Text(
                    text = course.text,
                    color = White,
                    fontSize = 13.sp,
                    fontFamily = RobotoFontFamily,
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                ) {
                    Text(
                        text = "${course.price} ₽",
                        fontSize = 17.sp,
                        fontFamily = RobotoFontFamily,
                        color = White,
                        textAlign = TextAlign.Left,
                    )
                    Text(
                        text = "Подробнее",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Right,
                        fontFamily = RobotoFontFamily,
                        fontSize = 14.sp,
                        color = Green,
                    )
                }
            }
        }
    }
}

@Composable
fun ImageForCard(
    course: Course
) {
    Box(
        modifier = Modifier
            .height(125.dp)
            .fillMaxWidth()
    ) {
        // Главное изображение
        Image(
            painter = painterResource(getImage(course.id)),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop,
        )

        IconButton(
            onClick = {

            },
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(6.dp)
                .size(28.dp)
                ,
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Glass
            ),
        ) {
            Icon(
                painter = painterResource(com.example.core_ui.R.drawable.bookmark),
                contentDescription = null,
                modifier = Modifier
                    .padding(6.dp),
                tint = if(course.hasLike) Color.Yellow else White
            )
        }

        Row(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 8.dp, bottom = 8.dp)
        ) {

            Card(
                modifier = Modifier
                    .height(22.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Glass
                )
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(com.example.core_ui.R.drawable.vector1),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(top = 4.dp, bottom = 4.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = course.rate,
                        fontFamily = RobotoFontFamily,
                        fontSize = 13.sp,
                        color = White
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                }
            }

            Spacer(modifier = Modifier.width(4.dp))

            Card(
                modifier = Modifier,
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Glass
                )
            ) {
                Text(
                    text = course.publishDate,
                    fontFamily = RobotoFontFamily,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                    color = White
                )
            }
        }
    }
}

fun getImage(id: Int): Int{
    return when(id){
        100 -> com.example.core_ui.R.drawable.cover
        101 -> com.example.core_ui.R.drawable.cover2
        else -> com.example.core_ui.R.drawable.cover3
    }
}