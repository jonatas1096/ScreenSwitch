package com.example.screenswitch.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.screenswitch.R



@Composable
fun Tela3(navController: NavController){
    Box(modifier = Modifier.fillMaxSize() //BOX PRINCIPAL

    ){
        Text(text = "Sem função de login por enquanto.")
    }

    Image(
        painter = painterResource(id = R.drawable.lowercaseagorata),
        contentDescription = "Image"
    )

}

@Preview(showBackground = true)
@Composable
fun PreviewTela3() {
    val navController = rememberNavController() // Importe rememberNavController
    Tela3(navController = navController)
    //aqui é preciso fazer essas fita acima novamente para
    //ativar a preview
}
