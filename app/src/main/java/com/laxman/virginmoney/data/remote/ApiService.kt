package com.laxman.virginmoney.data.remote

import com.laxman.virginmoney.data.model.People
import com.laxman.virginmoney.data.model.Room
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("people")
    suspend fun getPeopleList(): Response<List<People>>

    @GET("rooms")
    suspend fun getRoomList(): Response<List<Room>>
}
