package com.example.jetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.models.Quote


@Composable
fun QuotesDetails(quote: Quote) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {

        Card(
            elevation = CardDefaults.elevatedCardElevation(10.dp),
            modifier = Modifier
                .padding(10.dp)

        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_quotes),
                    contentDescription = "Quotes",
                    modifier = Modifier
                        .size(80.dp)
                )

                Text(text = quote.quote)

                Spacer(Modifier.height(16.dp))
                Text(text = quote.author,
                    fontFamily = FontFamily.Cursive,
                    style = MaterialTheme.typography.titleSmall)



            }

        }

    }
}


