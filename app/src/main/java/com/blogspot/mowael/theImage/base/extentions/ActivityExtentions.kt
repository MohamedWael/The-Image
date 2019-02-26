package com.blogspot.mowael.theImage.base.extentions

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders


fun <T : ViewModel> AppCompatActivity.createViewModel(viewModelClass: Class<T>): T {
    return ViewModelProviders.of(this).get(viewModelClass)
}