package com.jackrjie.dailycrypto.crypto.presentation.coin_list

import com.jackrjie.dailycrypto.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}