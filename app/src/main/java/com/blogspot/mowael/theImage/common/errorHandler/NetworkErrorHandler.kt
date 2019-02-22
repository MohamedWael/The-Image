package com.blogspot.mowael.theImage.common.errorHandler

interface NetworkErrorHandler {
    fun getThrowable(): Throwable
    fun getMessage(): String
    fun getMessageRes(): Int
}