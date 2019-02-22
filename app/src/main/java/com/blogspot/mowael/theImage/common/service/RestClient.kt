package com.blogspot.mowael.theImage.common.service

import com.blogspot.mowael.theImage.base.EndPoint
import com.blogspot.mowael.theImage.modules.home.response.PhotosResponse
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface RestClient {

    @GET(EndPoint.PHOTOS)
    fun getPhotos(): Call<PhotosResponse>

    @GET(EndPoint.PHOTOS)
    fun getPhotosAsync(): Observable<PhotosResponse>
}