package com.congo.app.currencydemo.data.repository

import com.congo.app.currencydemo.data.remote.CoinApi
import com.congo.app.currencydemo.data.remote.dto.CoinDetailDto
import com.congo.app.currencydemo.data.remote.dto.CoinDto
import com.congo.app.currencydemo.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinApi: CoinApi
): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return coinApi.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return coinApi.getCoinById(coinId)
    }

}