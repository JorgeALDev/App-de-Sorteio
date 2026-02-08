package com.example.appdesorteio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    private lateinit var content: () -> Unit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

@Composable
fun Home(){

    val participantes = listOf(
        "Aatrox",
        "Ahri",
        "Akali",
        "Akshan",
        "Alistar",
        "Ambessa",
        "Amumu",
        "Anivia",
        "Annie",
        "Aphelios",
        "Ashe",
        "Aurelion Sol",
        "Aurora",
        "Azir",
        "Bard",
        "Bel'Veth",
        "Blitzcrank",
        "Brand",
        "Braum",
        "Briar",
        "Caitlyn",
        "Camille",
        "Cassiopeia",
        "Cho'Gath",
        "Corki",
        "Darius",
        "Diana",
        "Dr. Mundo",
        "Draven",
        "Ekko",
        "Elise",
        "Evelynn",
        "Ezreal",
        "Fiddlesticks",
        "Fiora",
        "Fizz",
        "Galio",
        "Gangplank",
        "Garen",
        "Gnar",
        "Gragas",
        "Graves",
        "Gwen",
        "Hecarim",
        "Heimerdinger",
        "Hwei",
        "Illaoi",
        "Irelia",
        "Ivern",
        "Janna",
        "Jarvan IV",
        "Jax",
        "Jayce",
        "Jhin",
        "Jinx",
        "K'Sante",
        "Kai'Sa",
        "Kalista",
        "Karma",
        "Karthus",
        "Kassadin",
        "Katarina",
        "Kayle",
        "Kayn",
        "Kennen",
        "Kha'Zix",
        "Kindred",
        "Kled",
        "Kog'Maw",
        "LeBlanc",
        "Lee Sin",
        "Leona",
        "Lillia",
        "Lissandra",
        "Lucian",
        "Lulu",
        "Lux",
        "Malphite",
        "Malzahar",
        "Maokai",
        "Master Yi",
        "Mel",
        "Milio",
        "Miss Fortune",
        "Mordekaiser",
        "Morgana",
        "Naafiri",
        "Nami",
        "Nasus",
        "Nautilus",
        "Neeko",
        "Nidalee",
        "Nilah",
        "Nocturne",
        "Nunu e Willump",
        "Olaf",
        "Orianna",
        "Ornn",
        "Pantheon",
        "Poppy",
        "Pyke",
        "Qiyana",
        "Quinn",
        "Rakan",
        "Rammus",
        "Rek'Sai",
        "Rell",
        "Renata Glasc",
        "Renekton",
        "Rengar",
        "Riven",
        "Rumble",
        "Ryze",
        "Samira",
        "Sejuani",
        "Senna",
        "Seraphine",
        "Sett",
        "Shaco",
        "Shen",
        "Shyvana",
        "Singed",
        "Sion",
        "Sivir",
        "Skarner",
        "Smolder",
        "Sona",
        "Soraka",
        "Swain",
        "Sylas",
        "Syndra",
        "Tahm Kench",
        "Taliyah",
        "Talon",
        "Taric",
        "Teemo",
        "Thresh",
        "Tristana",
        "Trundle",
        "Tryndamere",
        "Twisted Fate",
        "Twitch",
        "Udyr",
        "Urgot",
        "Varus",
        "Vayne",
        "Veigar",
        "Vel'Koz",
        "Vex",
        "Vi",
        "Viego",
        "Viktor",
        "Vladimir",
        "Volibear",
        "Warwick",
        "Wukong",
        "Xayah",
        "Xerath",
        "Xin Zhao",
        "Yasuo",
        "Yone",
        "Yorick",
        "Yunara",
        "Yuumi",
        "Zaahen",
        "Zac",
        "Zed",
        "Zeri",
        "Ziggs",
        "Zilean",
        "Zoe",
        "Zyra"
    )

    var vencedores by remember { mutableStateOf<List<String>>(emptyList()) }

    fun sorteio(){
        val sorteio = participantes.shuffled().take(3)
        vencedores = sorteio
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "TOP 3 CAMPEÕES",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(50.dp)
        )

        Button(
            onClick = {
                sorteio()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF009688)
            ),
            modifier = Modifier.padding(0.dp,0.dp,0.dp,20.dp)
        ) {
            Text(
            text = "Realizar Sorteio",
            color = Color.White,
            fontSize = 18.sp
            )
        }

        if (vencedores.isNotEmpty()){
            vencedores.forEachIndexed { index,  vencedor ->
                Text(
                text = "TOP ${index+1}: ${vencedor}",
                fontSize = 18.sp,
                color = Color(0xFF009688),
                fontWeight = FontWeight.Bold
            )}
        }
    }

}

@Preview
@Composable
private fun HomePreview(){
    Home()
}