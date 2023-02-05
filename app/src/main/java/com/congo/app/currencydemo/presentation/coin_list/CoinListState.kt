package com.congo.app.currencydemo.presentation.coin_list

import com.congo.app.currencydemo.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
