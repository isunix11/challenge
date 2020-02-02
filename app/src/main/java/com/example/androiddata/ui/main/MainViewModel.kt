package com.example.androiddata.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.androiddata.data.PictureRepository

class MainViewModel(app: Application) : AndroidViewModel(app) {
    private val dataRepo = PictureRepository(app)
    val pictureData = dataRepo.pictureData

    fun refreshData() {
        dataRepo.refreshData()
    }

}
