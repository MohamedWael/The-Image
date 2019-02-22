package com.blogspot.mowael.theImage.base.app

import android.app.Application
import com.blogspot.mowael.theImage.base.EndPoint
import com.blogspot.mowael.theImage.base.network.RetrofitBase

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        RetrofitBase.initialize(EndPoint.API_URL, true)
    }
}