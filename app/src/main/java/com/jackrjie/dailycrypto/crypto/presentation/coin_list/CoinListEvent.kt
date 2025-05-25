package com.jackrjie.dailycrypto.crypto.presentation.coin_list

import com.jackrjie.dailycrypto.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}