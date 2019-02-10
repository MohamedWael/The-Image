package com.blogspot.mowael.mvvmsample.modules.home.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class ImagePostView : LinearLayout {

    constructor(context: Context?) : super(context) {
        initView()
    }

    constructor(context: Context?, attributes: AttributeSet) : super(context, attributes) {
        initView()
    }

    constructor(context: Context?, attributes: AttributeSet, defStyleAttr: Int) : super(
        context,
        attributes,
        defStyleAttr
    ) {
        initView()
    }


    private fun initView() {


    }
}