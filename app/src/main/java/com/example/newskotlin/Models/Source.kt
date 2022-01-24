package com.example.newskotlin.Models

import java.io.Serializable

class Source : Serializable {

    private var id = ""
    private var name = ""

    fun getId(): String? {
        return id
    }

    fun setId(id: String?) {
        this.id = id!!
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name!!
    }

}