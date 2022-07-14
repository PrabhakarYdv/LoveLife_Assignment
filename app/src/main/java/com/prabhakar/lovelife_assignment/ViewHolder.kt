package com.prabhakar.lovelife_assignment

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.prabhakar.lovelife_assignment.data.ResponseModel
import kotlinx.android.synthetic.main.user_layout.view.*

class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun setData(model: ResponseModel){
        view.apply {
            Glide.with(userImage).load(model.avatarUrl).into(userImage)
            userId.text= model.id.toString()
            userName.text=model.login
            name.text=model.name
            companyName.text=model.company
            location.text=model.location
            type.text=model.type
        }
    }
}