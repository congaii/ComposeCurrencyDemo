package com.congo.app.currencydemo.domain.repository

import com.congo.app.currencydemo.data.remote.dto.CoinDetailDto
import com.congo.app.currencydemo.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}