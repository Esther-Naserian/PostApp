package com.example.postapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface PostApiInterface {
    @GET("/posts")
    fun fetchPosts(): Call <List<Post>>
}