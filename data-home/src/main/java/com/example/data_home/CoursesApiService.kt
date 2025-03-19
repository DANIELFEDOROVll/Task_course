package com.example.data_home

import retrofit2.http.GET

interface CoursesApiService {
    @GET("")
    suspend fun getCourses(): CourseResponseDto
}