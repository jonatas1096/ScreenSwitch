package com.example.screenswitch.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController



@Composable
fun Tela3(navController: NavController){
    Box(modifier = Modifier
        .fillMaxSize() //BOX PRINCIPAL
        .background(Color(166, 215, 247)),
    ){
        Text(text = "Infelizmente sem opção para se cadastrar também :(",
            modifier = Modifier
                .clickable { navController.navigate("tela2") }
                .align(Alignment.Center)
                .padding(horizontal = 22.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,

        )



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
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(255,255,255)),
            ) {
                Text(text = "Voltar",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,

                    )
            }
        } //BOX PARA O BOTÃO
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTela3() {
    val navController = rememberNavController() // Importe rememberNavController
    Tela3(navController = navController)
    //aqui é preciso fazer essas fita acima novamente para
    //ativar a preview
}
