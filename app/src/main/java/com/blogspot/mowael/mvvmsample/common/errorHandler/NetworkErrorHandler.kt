package com.blogspot.mowael.mvvmsample.common.errorHandler

interface NetworkErrorHandler {
    fun getThrowable(): Throwable
    fun getMessage(): String
    fun getMessageRes(): Int
}