package com.example.rewardsexwithroomdb.repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInteface {
   @GET("rewards-list")
   @Headers("Content-Type:application/json")
   fun getRewarsData(): Call<RewardResponse>

}