package com.blogspot.mowael.mvvmsample.common.response

import com.blogspot.mowael.mvvmsample.common.errorHandler.NetworkErrorHandler

interface ResponseCallback<Response> {
    fun onSuccess(response: Response)

    fun onError(errorHandler: NetworkErrorHandler)
}