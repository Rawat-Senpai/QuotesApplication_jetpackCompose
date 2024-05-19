package com.example.jetpackcompose


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(heightDp = 500)
@Composable
fun PreviewItems() {



    LazyColumn (content = {
        items(getCategoryList()) {items->
            BlockCategory(img = items.image, title =items.title, subtitle =items.subtitle )
        }
    })
}

@Composable
fun BlockCategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        modifier = Modifier.padding(10.dp)
    ) {

        Row() {
            Image(
                painter = painterResource(id = img), contentDescription = "", modifier = Modifier
                    .size(40.dp)
                    .weight(.2f)
            )
            IntemDescription(title, subtitle, Modifier.weight(.8f))

        }


    }


}


@Composable
private fun IntemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = title, fontWeight = FontWeight.Bold)
        Text(text = subtitle, fontWeight = FontWeight.Light)
    }
}

data class Category(val image: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()

    list.add(Category(R.drawable.ic_contact, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming1", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming2", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming3", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming4", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming5", "Learn Different Languages"))

    list.add(Category(R.drawable.ic_contact, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming1", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming2", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming3", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming4", "Learn Different Languages"))
    list.add(Category(R.drawable.ic_contact, "Programming5", "Learn Different Languages"))

    return list

}