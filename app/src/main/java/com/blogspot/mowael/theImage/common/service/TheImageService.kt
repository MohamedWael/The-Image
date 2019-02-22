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

    fun execute(observable: Observable<Response>, responseCallback: ResponseHandler<Response>): Disposable? {
        return sendAsync(
            observable,
            { responseCallback.onSuccess(it) },
            { responseCallback.onError(TheImageNetworkErrorHandler(it)) })
    }
}