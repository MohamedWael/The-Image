package com.blogspot.mowael.theImage.common.errorHandler

class TheImageNetworkErrorHandler : NetworkErrorHandler {

    private lateinit var throwable: Throwable

    constructor(throwable: Throwable){
        this.throwable = throwable
    }

    override fun getThrowable(): Throwable {
        return throwable
    }

    override fun getMessage(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMessageRes(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}