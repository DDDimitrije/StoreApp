package com.example.storeapp.viewModel

import androidx.lifecycle.LiveData
import com.example.storeapp.domain.BannerModel
import com.example.storeapp.domain.CategoryModel

class DashboardViewModel {

    private val repository = DashboardViewModel()

    fun loadCategory(): LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }
}