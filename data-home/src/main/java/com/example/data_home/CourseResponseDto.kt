package com.example.data_home

import kotlinx.serialization.Serializable

@Serializable
data class CourseResponseDto(
    val courses: List<CourseDto>
)