package com.blogspot.mowael.mvvmsample.modules.home.service

import com.blogspot.mowael.mvvmsample.common.errorHandler.NetworkErrorHandler
import com.blogspot.mowael.mvvmsample.common.response.ResponseCallback
import com.blogspot.mowael.mvvmsample.common.service.TheImageService
import com.blogspot.mowael.mvvmsample.modules.home.response.PhotosResponse

class PhotosService {

    fun getPhotos() {
        val service: TheImageService<PhotosResponse> = TheImageService()
        service.execute(service.getRestClient().getPhotosAsync(), object :ResponseCallback<PhotosResponse>{
            override fun onSuccess(response: PhotosResponse) {

            }

            override fun onError(errorHandler: NetworkErrorHandler) {

            }
        })
    }
}
