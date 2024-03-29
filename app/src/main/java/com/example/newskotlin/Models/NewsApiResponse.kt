package com.example.newskotlin.Models

import java.io.Serializable


class NewsApiResponse : Serializable {
    private var status: String? = null
    private var totalResults = 0
    private var articles: List<NewsHealines>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String?) {
        this.status = status
    }

    fun getTotalResults(): Int {
        return totalResults
    }

    fun setTotalResults(totalResults: Int) {
        this.totalResults = totalResults
    }

    fun getArticles(): List<NewsHealines?>? {
        return articles
    }

    fun setArticles(articles: List<NewsHealines?>?) {
        this.articles = articles as List<NewsHealines>?
    }

}
