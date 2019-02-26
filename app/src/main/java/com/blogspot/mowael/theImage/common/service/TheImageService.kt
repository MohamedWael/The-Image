package com.blogspot.mowael.theImage.common.service

import com.blogspot.mowael.theImage.base.network.services.Service
import com.blogspot.mowael.theImage.common.errorHandler.TheImageNetworkErrorHandler
import com.blogspot.mowael.theImage.common.response.ResponseHandler
import io.reactivex.Observable
import io.reactivex.disposables.Disposable

open class TheImageService<Response> : Service<Response, RestClient>() {

    fun getRestClient(): RestClient {
        return createRestClient(RestClient::class.java)
    }

    fun execute(observable: Observable<Response>, responseHandler: ResponseHandler<Response>): Disposable? {
        return sendAsync(
            observable,
            { responseHandler.onSuccess(it) },
            { responseHandler.onError(TheImageNetworkErrorHandler(it)) })
    }
}