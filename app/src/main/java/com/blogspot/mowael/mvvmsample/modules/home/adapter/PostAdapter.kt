package com.blogspot.mowael.mvvmsample.modules.home.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blogspot.mowael.mvvmsample.modules.home.widgets.ImagePostView

class PostAdapter : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(ImagePostView(parent.context))
    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

    }


    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}