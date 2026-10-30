package com.example.storeapp.viewModel

import androidx.lifecycle.LiveData
import com.example.storeapp.domain.CategoryModel
import com.example.storeapp.repository.ResultsRepository

class ResultsViewModel {
    private val repository = ResultsRepository()

    fun loadSubCategory(id: String): LiveData<MutableList<CategoryModel>>{
        return repository.loadSubCategory(id)
    }
}