package com.example.hiltapp.data

import com.example.hiltapp.data.models.Response
import javax.inject.Inject

class Server @Inject constructor() {
    fun getResponse() = Response("https://klike.net/uploads/posts/2019-05/1556708032_1.jpg")
}