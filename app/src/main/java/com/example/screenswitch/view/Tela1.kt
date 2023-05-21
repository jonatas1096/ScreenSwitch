package com.example.screenswitch.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Tela1(navController: NavController){
    Box(modifier = Modifier.fillMaxSize()

    ){
        Text(text = "Tela 1")
        Button(
            onClick = { navController.navigate("tela2") },
            modifier = Modifier
                .align(Alignment.Center),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray)
        ) {
            Text(text = "Clique")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun PreviewTela1() {
    val navController = rememberNavController() // Importe rememberNavController
    Tela1(navController = navController)
    //aqui é preciso fazer essas fita acima novamente para
    //ativar a preview
}
