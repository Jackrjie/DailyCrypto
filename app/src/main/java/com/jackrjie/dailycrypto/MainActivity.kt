package com.jackrjie.dailycrypto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.jackrjie.dailycrypto.core.navigation.AdaptiveCoinListDetailPane
import com.jackrjie.dailycrypto.ui.theme.CryptoTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoTrackerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AdaptiveCoinListDetailPane(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}