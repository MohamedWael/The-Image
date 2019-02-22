package com.blogspot.mowael.theImage.modules.home.service

import com.blogspot.mowael.theImage.common.errorHandler.NetworkErrorHandler
import com.blogspot.mowael.theImage.common.response.ResponseHandler
import com.blogspot.mowael.theImage.common.service.TheImageService
import com.blogspot.mowael.theImage.modules.home.response.PhotosResponse

class PhotosService {

    fun getPhotos() {
        val service: TheImageService<PhotosResponse> = TheImageService()
        service.execute(service.getRestClient().getPhotosAsync(), object : ResponseHandler<PhotosResponse> {
            override fun onSuccess(response: PhotosResponse) {

            }

            override fun onError(errorHandler: NetworkErrorHandler) {

            }
        })
    }
}
