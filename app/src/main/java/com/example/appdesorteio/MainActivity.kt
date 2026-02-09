package com.example.appdesorteio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

val LoLGradienteAzulInicio = Color(0xFF0A1428)
val LoLGradienteAzulFim = Color(0xFF1E2328)
val LoLDourado = Color(0xFFC89B3C)
val LoLDouradoEscuro = Color(0xFF785A28)
val LoLTextoBranco = Color(0xFFF0E6D2)

fun getImagemCampeao(nomeCampeao: String): String {
    val casosEspeciais = mapOf(
        // Nomes compostos
        "Nunu e Willump" to "Nunu",
        "Aurelion Sol" to "AurelionSol",
        "Dr. Mundo" to "DrMundo",
        "Jarvan IV" to "JarvanIV",
        "Lee Sin" to "LeeSin",
        "Master Yi" to "MasterYi",
        "Miss Fortune" to "MissFortune",
        "Renata Glasc" to "Renata",
        "Tahm Kench" to "TahmKench",
        "Twisted Fate" to "TwistedFate",
        "Xin Zhao" to "XinZhao",

        "Wukong" to "MonkeyKing",

        "Bel'Veth" to "Belveth",
        "Cho'Gath" to "Chogath",
        "K'Sante" to "KSante",
        "Kai'Sa" to "Kaisa",
        "Kha'Zix" to "Khazix",
        "LeBlanc" to "Leblanc",
        "Vel'Koz" to "Velkoz"
    )

    val nomeCorreto = casosEspeciais[nomeCampeao] ?: nomeCampeao

    val nome = if (casosEspeciais.containsKey(nomeCampeao)) {
        nomeCorreto
    } else {
        nomeCorreto
            .replace("'", "")
            .replace(" ", "")
            .replace(".", "")
    }


    return "https://ddragon.leagueoflegends.com/cdn/14.24.1/img/champion/${nome}.png"
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}

@Composable
fun Home() {

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

    var campeaoSorteado by remember { mutableStateOf<List<String>>(emptyList()) }

    fun sorteio() {
        val sorteio = participantes.shuffled().take(3)
        campeaoSorteado = sorteio
    }

    fun limpar() {
        campeaoSorteado = emptyList()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        LoLGradienteAzulInicio,
                        LoLGradienteAzulFim
                    )
                )
            )
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Sorteador de Campeões",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = LoLDourado,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(48.dp)
        )

        Button(
            onClick = {
                sorteio()
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = LoLDourado,
                contentColor = LoLGradienteAzulInicio
            ),
            modifier = Modifier
                .padding(16.dp)
                .height(36.dp)
                .width(170.dp)
        ) {
            Text(
                text = "SORTEAR",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        if (campeaoSorteado.isNotEmpty()) {
            IconButton(
                onClick = {
                    limpar()
                },
                modifier = Modifier
                    .padding(8.dp)
                    .size(48.dp)
                    .background(LoLDouradoEscuro, shape = CircleShape),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = LoLTextoBranco
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Limpar sorteio",
                    modifier = Modifier.size(24.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        if (campeaoSorteado.isNotEmpty()) {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(1f),
                colors = CardDefaults.cardColors(containerColor = LoLGradienteAzulFim),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 12.dp
                )
            ) {

                Column(
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Escolha um para jogar:",
                        fontSize = 18.sp,
                        color = LoLTextoBranco,
                        modifier = Modifier.padding(16.dp)
                    )

                    campeaoSorteado.forEach { campeao ->
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(vertical = 8.dp)
                        ) {
                            AsyncImage(
                                model = getImagemCampeao(campeao),
                                contentDescription = "Ícone de $campeao",
                                error = painterResource(R.drawable.ic_launcher_foreground),
                                modifier = Modifier
                                    .width(64.dp)
                                    .height(64.dp)
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = campeao,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = LoLDourado,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }

            }
        }
    }
}


@Preview
@Composable
private fun HomePreview() {
    Home()
}