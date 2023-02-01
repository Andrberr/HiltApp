package com.example.hiltapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hiltapp.domain.Data
import com.example.hiltapp.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImageViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    private val _liveData = MutableLiveData<Data>()
    val liveData: LiveData<Data> get() = _liveData

    fun getData() {
        val link = repository.getLink()
        _liveData.value = link
    }
}