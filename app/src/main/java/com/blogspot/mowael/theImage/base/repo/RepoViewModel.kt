package com.blogspot.mowael.theImage.base.repo

import com.blogspot.mowael.theImage.common.errorHandler.NetworkErrorHandler

interface RepoViewModel {

    fun onError(errorHandler: NetworkErrorHandler)
}