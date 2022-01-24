package com.example.newskotlin

import com.example.newskotlin.Models.NewsHealines

interface SelectListener {
    //뉴스 기사 하나에 대한 클릭 리스너 인터페이스
    fun OnNewsClicked(healines: NewsHealines?)
}