package com.blogspot.mowael.theImage.base.extentions

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders



fun <T : ViewModel> Fragment.createViewModel(viewModelClass: Class<T>): T =
    ViewModelProviders.of(this).get(viewModelClass)
