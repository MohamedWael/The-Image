package com.blogspot.mowael.theImage.base.viewModel

import androidx.lifecycle.ViewModel
import com.blogspot.mowael.theImage.base.repo.RepoViewModel
import com.blogspot.mowael.theImage.common.errorHandler.NetworkErrorHandler

open class TheImageBaseViewModel : ViewModel(), RepoViewModel {

    override fun onError(errorHandler: NetworkErrorHandler) {

    }
}