package com.example.retrofitbaseproject.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitbaseproject.ui.domain.repository.NetworkRepo
import com.example.retrofitbaseproject.ui.viewmodel.state.GetUserResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(
    private val networkRepo: NetworkRepo
): ViewModel() {

    private val _getUser = MutableSharedFlow<GetUserResponse>()
    val getUser = _getUser.asSharedFlow()

    /*getUser
    get User Function
     */
    fun getUser(){
        viewModelScope.launch {
            _getUser.emit(GetUserResponse(isLoading = true))
            networkRepo.getUser().collect { response ->
                if (response.isSuccessful){
                    Log.e("success","$response")
                }else{
                    Log.e("error","$response")
                }
            }
        }
    }
}