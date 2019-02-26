package com.blogspot.mowael.theImage.modules.home.viewModel

import com.blogspot.mowael.theImage.base.viewModel.TheImageBaseViewModel
import com.blogspot.mowael.theImage.common.errorHandler.NetworkErrorHandler
import com.blogspot.mowael.theImage.common.response.ResponseHandler
import com.blogspot.mowael.theImage.modules.home.adapter.PostAdapter
import com.blogspot.mowael.theImage.modules.home.repo.PhotosRepo
import com.blogspot.mowael.theImage.modules.home.repo.PhotosRepoViewModel
import com.blogspot.mowael.theImage.modules.home.response.PhotosResponse

class HomeViewModel : TheImageBaseViewModel(), PhotosRepoViewModel {

    var adapter: PostAdapter = PostAdapter()

    fun getPhotos(){
        PhotosRepo(this).getPhotos(object : ResponseHandler<PhotosResponse>{
            override fun onSuccess(response: PhotosResponse) {

            }

            override fun onError(errorHandler: NetworkErrorHandler) {

            }
        })
    }
}