package com.example.data_home

import android.util.Log
import com.example.data_home.mappers.CourseResponseDtoToDomainMapper
import com.example.domain.CourseResponse
import com.example.domain.HomeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

class HomeRepositoryImpl(
    private val api: CoursesApiService,
    private val mapper: CourseResponseDtoToDomainMapper,
): HomeRepository {
    override suspend fun getCourses(): CourseResponse? {
        return withContext(Dispatchers.IO){
            try{
                val response = api.getCourses()
                val courses = response.body()
                mapper(courses!!)
            } catch (e: IOException) {
                Log.e("!!!error", "Ошибка сети ${e.message}")
                null
            } catch (e: Exception) {
                Log.e("!!!error", "Неизвестная ошибка ${e.message}")
                null
            }
        }
    }
}