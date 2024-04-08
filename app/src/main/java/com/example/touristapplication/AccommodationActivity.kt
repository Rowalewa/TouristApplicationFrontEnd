package com.example.touristapplication

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.touristapplication.ui.theme.TouristApplicationTheme

class AccommodationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TouristApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Red),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomAppBar()
                    val departments = listOf(
                        "Forest Haven Estate - Modern Villa",
                        "Four Seasons Hotel Gresham Palace - Budapest",
                        "Soneva Fushi - Maldives",
                        "Mandarin Oriental - Bangkok",
                        "Aman Tokyo - Japan",
                        "JW Marriott Marquis Hotel - Dubai",
                        "La Mamounia - Marrakech, Morocco",
                        "Raffles - Singapore",
                        "Rosewood - Hong Kong",
                        "The Upper House - Hong Kong",
                        "Capella - Bangkok",
                        "The Calile - Brisbane",
                        "Aman Venice - Venice",
                        "Claridge's - London",
                        "Hotel Esencia - Tulum",
                        "Nihi Sumba - Sumba Island",
                        "Four Seasons Madrid - Madrid",
                        "The Newt - Bruton",
                        "Amangalla - Galle",
                        "The Siam - Bangkok"
                    )
                    val images = listOf(
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                        painterResource(R.drawable.car),
                    )
                    LazyColumn (
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(
                                start = 10.dp,
                                top = 120.dp,
                                end = 20.dp,
                                bottom = 100.dp
                            )
                            .background(color = Color.Transparent)
                    ){
                        items(items = departments){
                                item->
                            ColumnCard(modifier = Modifier, name = item)
                        }

                    }
                }
            }
        }
    }
}
@Composable
fun BottomAppBar() {
    Scaffold(
        bottomBar = {
            androidx.compose.material3.BottomAppBar(
                actions = {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = "Localized description",
                                tint = Color.Green
                            )
                        }
                        Text(
                            text = "Search"
                        )
                    }
                    Spacer(modifier = Modifier.width(22.dp))
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Place,
                                contentDescription = "Localized description",
                                tint = Color.Blue
                            )
                        }
                        Text(
                            text = "Trip",
                        )
                    }
                    Spacer(modifier = Modifier.width(22.dp))
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.FavoriteBorder,
                                contentDescription = "Localized description",
                                tint = Color.Red
                            )
                        }
                        Text(
                            text = "Wishlist"
                        )
                    }
                    Spacer(modifier = Modifier.width(22.dp))
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Email,
                                contentDescription = "Localized description",
                                tint = Color.Red
                            )
                        }
                        Text(
                            text = "Message"
                        )
                    }
                    Spacer(modifier = Modifier.width(22.dp))
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        IconButton(onClick = { /* do something */ },) {
                            Icon(
                                Icons.Filled.AccountCircle,
                                contentDescription = "Localized description",
                                tint = Color.Red
                            )
                        }
                        Text(
                            text = "Profile"
                        )
                    }
                },
            )
        },
    ) { innerPadding ->
        Column {
//            Text(
//                modifier = Modifier.padding(innerPadding.calculateStartPadding(layoutDirection = LayoutDirection.Ltr)),
//                text = " "
//            )
            var text by remember {
                mutableStateOf(value = "")
            } // enabling text input
            TextField(modifier = Modifier.fillMaxWidth()
                .padding(innerPadding.calculateStartPadding(layoutDirection = LayoutDirection.Ltr))
                .clip(shape = RoundedCornerShape(20.dp)),
                value = text, onValueChange = {
                        newText -> text = newText // does the observation of the input field
                },
                label = { TextFieldLabels(value = "Search")})
            Row (

            ){
                IconButton(
                    onClick = { /* do something */ },
                    colors = IconButtonDefaults.iconButtonColors(Color.Green),
                    modifier = Modifier
                        .width(100.dp)
                        .padding(
                            start = 10.dp,
                            end = 10.dp,
                            top = 5.dp,
                            bottom = 5.dp
                        )
                ) {
                    Row {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Localized description",
                            tint = Color.White
                        )
                        Text(
                            text = "Hotel",
                            color = Color.Blue,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }
                IconButton(
                    onClick = { /* do something */ },
                    colors = IconButtonDefaults.iconButtonColors(Color.Green),
                    modifier = Modifier
                        .width(120.dp)
                        .padding(
                            start = 10.dp,
                            end = 10.dp,
                            top = 5.dp,
                            bottom = 5.dp
                        )
                ) {
                    Row {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Localized description",
                            tint = Color.Red
                        )
                        Text(
                            text = "Rentals",
                            color = Color.Magenta,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }
                IconButton(
                    onClick = { /* do something */ },
                    colors = IconButtonDefaults.iconButtonColors(Color.Green),
                    modifier = Modifier
                        .width(140.dp)
                        .padding(
                            start = 10.dp,
                            end = 0.dp,
                            top = 5.dp,
                            bottom = 5.dp
                        )
                ) {
                    Row {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Localized description",
                            tint = Color.Blue
                        )
                        Text(
                            text = "Restaurant",
                            color = Color.Red,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ColumnCard(modifier: Modifier,name: String){  // responsible for creating the card and the box->RowCard fx
    Card(
        modifier = Modifier
            .padding(
                start = 10.dp,
                top = 40.dp,
                end = 10.dp,
                bottom = 40.dp
            )
            .fillMaxWidth()
            .wrapContentHeight()
            .aspectRatio(
                1.5f
            ),
        colors = CardDefaults.cardColors(containerColor = Color.Yellow),
        elevation = CardDefaults.cardElevation(10.dp)  // makes it appear 3d as if elevated from the screen
    ){
        Box (
            modifier = Modifier.padding(
                start = 10.dp,
                top = 10.dp,
                end = 10.dp,
                bottom = 10.dp
            ),
            contentAlignment = Alignment.Center,
        ){
            Text(
                text = name,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Blue,
                modifier = Modifier
                    .padding(
                        start = 15.dp,
                        top = 17.dp,
                        end = 5.dp,
                        bottom = 5.dp
                    )
                    .align(alignment = Alignment.Center),
                fontFamily = FontFamily.Serif,
                fontStyle = FontStyle.Italic
            )
        }
    }
}
@Composable
fun TextFieldLabels(value: String){
    Text(text = value)
}


@Preview(showBackground = true)
@Composable
fun AccommodationPreview() {
    TouristApplicationTheme {
        BottomAppBar()
    }
}