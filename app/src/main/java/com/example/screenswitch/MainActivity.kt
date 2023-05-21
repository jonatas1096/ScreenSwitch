package com.example.screenswitch

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.screenswitch.ui.theme.ScreenSwitchTheme
import com.example.screenswitch.view.Tela1
import com.example.screenswitch.view.Tela2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "Tela1"){
                composable(
                    route = "Tela1"
                ){
                    Tela1(navController)
                }

                composable(
                    route = "Tela2"
                ){
                    Tela2(navController)
                }
            }
        }
    }
}

@Composable
fun Main() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}