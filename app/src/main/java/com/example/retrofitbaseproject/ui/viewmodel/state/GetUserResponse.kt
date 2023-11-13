package com.example.retrofitbaseproject.ui.viewmodel.state

import com.example.retrofitbaseproject.ui.model.response.UserResponse

data class GetUserResponse(
    val baseResponse: UserResponse? = null,
    var isLoading: Boolean = false,
    val error: String? = null
)