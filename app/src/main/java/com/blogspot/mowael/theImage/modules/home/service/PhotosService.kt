package com.blogspot.mowael.theImage.modules.home.service

import com.blogspot.mowael.theImage.base.extentions.request
import com.blogspot.mowael.theImage.common.response.ResponseHandler
import com.blogspot.mowael.theImage.modules.home.response.PhotosResponse

class PhotosService {

    fun getPhotos(responseHandler: ResponseHandler<PhotosResponse>) {
        request<PhotosResponse> {
            execute(getRestClient().getPhotosAsync(), responseHandler)
        }
    }
}
