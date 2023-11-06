package com.example.retrofitbaseproject.ui.domain.repository

import com.example.retrofitbaseproject.ui.model.response.UserResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface NetworkRepo {

    suspend fun getUser(): Flow<Response<UserResponse>>
}