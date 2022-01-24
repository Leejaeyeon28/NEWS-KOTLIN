package com.example.newskotlin

import android.app.ProgressDialog
import android.graphics.Bitmap
import android.os.Bundle
import android.telecom.Call.Details.can
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.newskotlin.Models.NewsHealines

class webViewActivity : AppCompatActivity() {
    var news_view: WebView? = null
    var dialog: ProgressDialog? = null
    var healines: NewsHealines? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        news_view = findViewById(R.id.news_view)
        healines = intent.getSerializableExtra("data") as NewsHealines
        dialog = ProgressDialog(this)

        news_view?.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }

        news_view?.loadUrl(healines?.getUrl())


    }


}