package com.example.screenswitch.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.screenswitch.R




@Composable
fun Tela1(navController: NavController){

    Box(modifier = Modifier
        .fillMaxSize() //BOX PRINCIPAL
        .background(Color(166, 215, 247)),
    ){


        Box(modifier = Modifier //BOX PARA A MOLDURA
            .width(300.dp)
            .align(Alignment.Center)
            .padding(bottom = 310.dp)
            .padding(top = 200.dp)

        )
        {
            Image( // IMAGEM DO MEIO
                painter = painterResource(id = R.drawable.bluesky),
                contentDescription = "Image",
                modifier = Modifier.fillMaxSize()
            )


            TextField(value = "", onValueChange = {}, //Login
                modifier = Modifier
                    .width(240.dp)
                    .height(50.dp)
                    .offset(y = (-30).dp)
                    .align(Alignment.Center),
                placeholder = {Text(text = "Login")}
            )

            TextField(value = "", onValueChange = {}, //Senha
                modifier = Modifier
                    .width(240.dp)
                    .height(50.dp)
                    .offset(y = (60).dp)
                    .align(Alignment.Center),
                placeholder = {Text(text = "Senha")}
            )
        }


        Box(modifier = //BOX PARA O BOTÃO
        Modifier
            .width(240.dp)
            .padding(top = 220.dp)
            .border(width = 2.dp, Color.Black, shape = RoundedCornerShape(8.dp))
            .align(Alignment.Center),
        ){
                Button( //BOTÃO LOGAR
                    onClick = { navController.navigate("Tela3") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray)
                ) {
                    Text(text = "Logar")
                }
        } //BOX PARA O BOTÃO

        Box(modifier = //BOX PARA O REGISTRAR
        Modifier
            .width(240.dp)
            .padding(top = 320.dp)
            .align(Alignment.Center),
        ){
            Text(text = "Não possui conta? Cadastre-se!",
            modifier = Modifier
                .clickable { navController.navigate("tela2") }
                .align(Alignment.Center),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
            )

        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewTela() {
    val navController = rememberNavController() // Importe rememberNavController
    Tela1(navController = navController)
    //aqui é preciso fazer essas fita acima novamente para
    //ativar a preview
}
