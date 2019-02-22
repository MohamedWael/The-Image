package com.blogspot.mowael.mvvmsample.common.service

import com.blogspot.mowael.mvvmsample.base.EndPoint
import com.blogspot.mowael.mvvmsample.modules.home.response.PhotosResponse
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface RestClient {

    @GET(EndPoint.PHOTOS)
    fun getPhotos(): Call<PhotosResponse>

    @GET(EndPoint.PHOTOS)
    fun getPhotosAsync(): Observable<PhotosResponse>
}