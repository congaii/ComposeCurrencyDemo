package com.congo.app.currencydemo.data.remote

import com.congo.app.currencydemo.data.remote.dto.CoinDetailDto
import com.congo.app.currencydemo.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinApi {

    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDto>


    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path(value = "coinId") coinId: String): CoinDetailDto
}