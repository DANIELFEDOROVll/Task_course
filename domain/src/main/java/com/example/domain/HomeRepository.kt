package com.example.domain

interface HomeRepository {
    suspend fun getCourses(): CourseResponse?
}