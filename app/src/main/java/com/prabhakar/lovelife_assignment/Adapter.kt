package com.prabhakar.lovelife_assignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.prabhakar.lovelife_assignment.data.ResponseModel

class Adapter(private val dataLists: List<ResponseModel>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      val model=dataLists[position]
        holder.setData(model)
    }

    override fun getItemCount(): Int {
        return dataLists.size
    }
}