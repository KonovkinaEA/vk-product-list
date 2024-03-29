package com.example.productlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.productlist.ui.navigation.AppNavHost
import com.example.productlist.ui.theme.ProductListTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            ProductListTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AppNavHost(modifier = Modifier, navController = navController)
                }
            }
        }
    }
}
