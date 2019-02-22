package com.blogspot.mowael.theImage.modules.home.service

import com.blogspot.mowael.theImage.common.response.ResponseHandler
import com.blogspot.mowael.theImage.common.service.TheImageService
import com.blogspot.mowael.theImage.modules.home.response.PhotosResponse

class PhotosService {

    fun getPhotos(responseHandler: ResponseHandler<PhotosResponse>) {
        val service = TheImageService<PhotosResponse>()
        service.execute(service.getRestClient().getPhotosAsync(), responseHandler)
    }
}
