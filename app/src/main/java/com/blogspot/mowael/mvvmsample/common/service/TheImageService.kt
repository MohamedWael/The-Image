package com.blogspot.mowael.mvvmsample.common.service

import com.blogspot.mowael.mvvmsample.base.network.services.Service
import com.blogspot.mowael.mvvmsample.common.errorHandler.TheImageNetworkErrorHandler
import com.blogspot.mowael.mvvmsample.common.response.ResponseCallback
import io.reactivex.Observable
import io.reactivex.disposables.Disposable

open class TheImageService<Response> : Service<Response, RestClient>() {

    fun getRestClient(): RestClient {
        return createRestClient(RestClient::class.java)
    }

    fun execute(observable: Observable<Response>, responseCallback: ResponseCallback<Response>): Disposable? {
        return sendAsync(
            observable,
            { responseCallback.onSuccess(it) },
            { responseCallback.onError(TheImageNetworkErrorHandler(it)) })
    }
}