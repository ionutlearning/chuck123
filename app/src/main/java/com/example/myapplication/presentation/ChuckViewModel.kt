package com.example.myapplication.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.api.model.Meme
import com.example.myapplication.domain.MemeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class ChuckViewModel @Inject constructor(private val memeRepository: MemeRepository): ViewModel(){

    private val _memes = MutableLiveData<Meme>()
    val memes : LiveData<Meme> = _memes

    fun fetchData() {
        viewModelScope.launch {
            val result = memeRepository.getMemes()
            _memes.value = result
        }
    }
}