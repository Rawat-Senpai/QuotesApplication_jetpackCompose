package com.example.jetpackcompose.screens


import android.provider.CalendarContract.Colors
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

@Preview
@Composable
fun PreviewFunction() {
    QuotesDetails()
}

@Composable
fun QuotesLayout() {

    Card(
        elevation = CardDefaults.cardElevation(10.dp),

        ) {

        Row(modifier = Modifier.padding(10.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_quotes),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Time is the most valuable thing a man can spend ",
                    style = MaterialTheme.typography.bodyLarge
                )

                Box(
                    modifier = Modifier
                        .background(Color(0xFFEEEEEE))
                        .fillMaxWidth(.4f)
                        .height(1.dp)

                )
                Text(
                    text = "Theophrastus",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }


        }
    }


}

@Composable
fun QuotesDetails() {
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

                Text(text = "Time is the most valuable thing a man can spend.")

                Spacer(Modifier.height(16.dp))
                Text(text = "Theophrastus",
                    fontFamily = FontFamily.Cursive,
                    style = MaterialTheme.typography.titleSmall)



            }

        }

    }
}



