package com.jobs.space

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jobs.space.ui.theme.SpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                        Greeting("Android")
//                        ShowSwitch()


                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Greeting(name: String) {


    Scaffold(
        modifier =  Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("Space")
                },
                navigationIcon = {
                    IconButton(onClick = {  }) {
                        Icon(Icons.Filled.Menu, contentDescription = "menu")
                    }
                },
                actions = {
                    IconButton(onClick = {  }) {
                        Icon(Icons.Filled.Notifications, contentDescription = "noti")
                    }
                    IconButton(onClick = {  }) {
                        Icon(Icons.Filled.Search, contentDescription = "search")
                    }
                }


            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
                IconButton(onClick = {  }) {
                    Icon(Icons.Filled.Add, contentDescription = "add")
                }
            }
        }


    ) {


    }

}

@Composable
fun Imagess(){

    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(text = "Hello $name!")
//            ShowSwitch()

        Image(painter = painterResource(id = R.drawable.graphics),
            contentDescription = "",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(200.dp,200.dp))



    }
    Text(text = "Hello, Shivam Jadav")


}



@Composable
fun ShowSwitch(){

    val isChecked = remember {
        mutableStateOf(false)
    }

    Switch(

        checked = isChecked.value,
        onCheckedChange = {

            isChecked.value = it
        },
        modifier = Modifier.run {
            size(20.dp)
        }


    )

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SpaceTheme {
        Greeting("Android")
    }
}