package com.example.jetpackcompose.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.jetpackcompose.models.Quote

@Composable
fun QuoteList(data:Array<Quote>, onClick:(quote:Quote)->Unit){

    LazyColumn(content =  {
      items(data){
        QuotesLayout(quote = it, onClick )
      }
    })

}