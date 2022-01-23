package com.example.newskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newskotlin.Models.NewsApiResponse
import com.example.newskotlin.Models.NewsHealines


class MainActivity : AppCompatActivity() {
    var mRecyclerView: RecyclerView? = null
    var mAdapter: CustomAdapter? = null
    var mLayoutManager : RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val manager = RequestManager(this)
        manager.getNewsHeadlines(listener, "general", null)
    }

    private val listener: OnFetchDataListener<NewsApiResponse?> = object : OnFetchDataListener<NewsApiResponse?> {
        override fun onFetchData(list: List<NewsHealines?>?, message: String?) {
            showNews(list)
        }

        override fun onError(message: String?) {}
    }

    private fun showNews(list: List<NewsHealines?>?) { // 본문을 초기화하는 역할
        mRecyclerView = findViewById(R.id.recycler_main)

        mLayoutManager = GridLayoutManager(this,1)
        mRecyclerView!!.layoutManager = mLayoutManager
        mAdapter = CustomAdapter(this, list as List<NewsHealines>)
        mRecyclerView!!.adapter=mAdapter
        mRecyclerView!!.setHasFixedSize(true)
    }
}