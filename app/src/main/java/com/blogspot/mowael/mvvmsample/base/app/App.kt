package com.blogspot.mowael.mvvmsample.base.app

import android.app.Application
import com.blogspot.mowael.mvvmsample.base.EndPoint
import com.blogspot.mowael.mvvmsample.base.network.RetrofitBase

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        RetrofitBase.initialize(EndPoint.API_URL, true)
    }
}