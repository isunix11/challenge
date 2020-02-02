package com.example.androiddata.data

import retrofit2.Response
import retrofit2.http.GET

interface PictureService {
    @GET("wgkJgazE")
    suspend fun getPictureData(): Response<List<Picture>>
}