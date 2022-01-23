package com.example.newskotlin

import com.example.newskotlin.Models.NewsHealines

interface OnFetchDataListener<NewsApiResponse> {
    fun onFetchData(list: List<NewsHealines?>?, message: String?)
    fun onError(message: String?)
}