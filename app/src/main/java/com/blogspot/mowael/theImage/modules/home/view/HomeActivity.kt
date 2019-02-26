package com.blogspot.mowael.theImage.modules.home.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.blogspot.mowael.theImage.R
import com.blogspot.mowael.theImage.base.extentions.createViewModel
import com.blogspot.mowael.theImage.modules.home.viewModel.HomeViewModel
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val viewModel = createViewModel(HomeViewModel::class.java)
        rvImages.layoutManager = LinearLayoutManager(this)
        rvImages.adapter = viewModel.adapter
        viewModel.getPhotos()
    }
}
