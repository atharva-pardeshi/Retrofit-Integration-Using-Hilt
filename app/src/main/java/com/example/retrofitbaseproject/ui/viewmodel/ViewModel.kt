package com.example.retrofitbaseproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.retrofitbaseproject.ui.domain.service.ApiService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(
    private val apiService: ApiService
): ViewModel() {


}