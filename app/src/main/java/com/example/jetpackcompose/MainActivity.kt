package com.example.jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.screens.QuoteListScreen
import com.example.jetpackcompose.screens.QuotesDetails
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataManager.loadAssetsFromFile(this)

        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App(){

    Log.d("CheckingData",DataManager.isDataLoaded.toString()+" "+DataManager.data.toString())

    if(DataManager.isDataLoaded.value){
        if(DataManager.currentPage.value == Pages.LISTING){
            QuoteListScreen(data = DataManager.data) {
                DataManager.switchPages(it)
            }
        }else{
            DataManager.currentQuote?.let { QuotesDetails(quote = it) }
        }
    
    }

}


enum class Pages{
    LISTING,
    DETAILS
}
