package com.example.domain

class GetCoursesUseCase(
    private val repo: HomeRepository
) {
    suspend operator fun invoke(): CourseResponse? {
        return repo.getCourses()
    }
}