package com.example.retrofitbaseproject.ui.domain.service

import com.example.retrofitbaseproject.ui.model.request.User
import retrofit2.http.GET

interface ApiService {

    // GET retrofit function to retrieve the user from api service
    @GET("user")
    suspend fun getUsers(): List<User>
}