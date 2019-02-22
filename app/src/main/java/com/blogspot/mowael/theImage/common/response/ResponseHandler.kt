package com.blogspot.mowael.theImage.common.response

import com.blogspot.mowael.theImage.common.errorHandler.NetworkErrorHandler

interface ResponseHandler<Response> {
    fun onSuccess(response: Response)

    fun onError(errorHandler: NetworkErrorHandler)
}