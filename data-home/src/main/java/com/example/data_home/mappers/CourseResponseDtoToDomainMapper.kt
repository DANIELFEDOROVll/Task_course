package com.example.data_home.mappers

import com.example.data_home.CourseResponseDto
import com.example.domain.CourseResponse

class CourseResponseDtoToDomainMapper(
    private val mapper: CourseDtoToDomainMapper,
){

    operator fun invoke(course: CourseResponseDto): CourseResponse {
        return with(course){
            CourseResponse(
                courses = courses.map{ mapper(it) }
            )
        }
    }
}