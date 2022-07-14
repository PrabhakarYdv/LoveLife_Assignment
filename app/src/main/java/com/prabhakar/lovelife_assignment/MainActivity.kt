package com.prabhakar.lovelife_assignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.prabhakar.lovelife_assignment.data.ResponseModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: AppViewModel
    lateinit var userAdapter: Adapter
    private var dataList = listOf<ResponseModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel = ViewModelProvider(this).get(AppViewModel::class.java)

        buildList()
        setRecyclerView()
    }

    private fun buildList() {
        viewModel.getAllData().observe(this, Observer {
            it?.run {
                dataList = it
            }
        })
    }

    private fun setRecyclerView() {
        userAdapter = Adapter(dataList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = userAdapter
    }

}