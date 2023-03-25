package com.jobs.space

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Greeting(name: String) {


    Scaffold(

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


    ){
        Text(text = "Hello $name!")

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SpaceTheme {
        Greeting("Android")
    }
}