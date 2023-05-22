package com.example.screenswitch.view

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.screenswitch.R

@Composable
fun Tela2(navController: NavController){
    Box(modifier = Modifier.fillMaxSize() //BOX PRINCIPAL

    ){
        Box(modifier = //BOX PARA O BOTÃO
        Modifier
            .width(240.dp)
            .padding(top = 220.dp)
            .border(width = 2.dp, Color.Black, shape = RoundedCornerShape(8.dp))
            .align(Alignment.Center),
        ){
            Button(
                onClick = { navController.navigate("tela1") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp)
                ,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray)
            ) {
                Text(text = "Clique")
            }
        } //BOX PARA O BOTÃO
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTela2() {
    val navController = rememberNavController() // Importe rememberNavController
    Tela2(navController = navController)
    //aqui é preciso fazer essas fita acima novamente para
    //ativar a preview
}
