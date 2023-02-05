package com.congo.app.currencydemo.presentation.coin_detail

import com.congo.app.currencydemo.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
