package com.example.latihanretrofit

import com.google.gson.annotations.SerializedName
import retrofit2.http.Body

data class AlbumsItem(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("userId")
    val userId: Int
)