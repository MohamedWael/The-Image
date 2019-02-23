package com.blogspot.mowael.theImage.base.extentions

import com.blogspot.mowael.theImage.common.service.TheImageService
import io.reactivex.disposables.Disposable


fun <T> request(s: TheImageService<T>.() -> Disposable?): TheImageService<T> {
    val service = TheImageService<T>()
    service.s()
    return service
}