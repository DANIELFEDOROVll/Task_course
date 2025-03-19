package com.example.data_home.mappers

import com.example.data_home.CourseDto
import com.example.domain.Course

class CourseDtoToDomainMapper {
    operator fun invoke(courseDto: CourseDto): Course{
        return with(courseDto){
            Course(

            )
        }
    }
}