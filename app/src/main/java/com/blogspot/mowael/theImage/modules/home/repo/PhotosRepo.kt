package com.blogspot.mowael.theImage.modules.home.repo

import com.blogspot.mowael.theImage.base.repo.TheImageRepo
import com.blogspot.mowael.theImage.common.errorHandler.NetworkErrorHandler
import com.blogspot.mowael.theImage.common.response.ResponseHandler
import com.blogspot.mowael.theImage.modules.home.response.PhotosResponse
import com.blogspot.mowael.theImage.modules.home.service.PhotosService

class PhotosRepo(viewModel: PhotosRepoViewModel) : TheImageRepo<PhotosRepoViewModel>(viewModel) {

    fun getPhotos(responseHandler: ResponseHandler<PhotosResponse> ) {
        PhotosService().getPhotos(object : ResponseHandler<PhotosResponse> {
            override fun onSuccess(response: PhotosResponse) {
                responseHandler.onSuccess(response)
            }

            override fun onError(errorHandler: NetworkErrorHandler) {
                responseHandler.onError(errorHandler)
            }
        })
    }
}