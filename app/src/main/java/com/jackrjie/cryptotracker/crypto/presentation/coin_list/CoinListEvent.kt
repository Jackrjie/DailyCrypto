package com.jackrjie.cryptotracker.crypto.presentation.coin_list

import com.jackrjie.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}