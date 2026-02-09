# 🎲 Sorteador de Campeões - League of Legends

<div align="center">

<img src="https://raw.githubusercontent.com/yurijserrano/Github-Profile-Readme-Logos/master/games/league-of-legends.svg" width="150" height="150" alt="League of Legends Logo"/>

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)

**Status: ✅ Concluído | Tipo: 🎓 Educacional**

</div>

---

## 📖 Sobre o Projeto

Aplicativo Android desenvolvido em **Kotlin** que sorteia **3 campeões aleatórios** de **League of Legends** para ajudar jogadores a escolherem seus picks de forma divertida! 🎮

O app conta com uma **interface moderna** usando **Jetpack Compose**, paleta de cores **oficial do LoL**, e integração com a **Data Dragon API da Riot Games** para exibir os ícones dos campeões sorteados.

---

## 🎓 Contexto Educacional

Este é meu **primeiro projeto em Kotlin**, desenvolvido inicialmente acompanhando um [tutorial no YouTube](https://youtu.be/bvauaOmqSSs) sobre criação de apps de sorteio em Android, mas com **extensas personalizações** para torná-lo único e funcional.

> 💡 **Objetivo**: Dar os primeiros passos em Kotlin e desenvolvimento Android, aprendendo conceitos de UI moderna, integração com APIs externas, e boas práticas de desenvolvimento.

---

## 🚀 Minhas Personalizações

Transformei o projeto básico do tutorial em algo completamente diferente e alinhado com minha identidade como jogador de LoL:

### **🎨 Design e Interface**
- ✅ **Jetpack Compose** - Migrei de XML para Compose, tecnologia moderna de UI declarativa
- ✅ **Paleta oficial do League of Legends** - Cores autênticas do jogo (azul escuro, dourado)
- ✅ **Cards elegantes** - Layout profissional com elevação e sombras
- ✅ **Gradiente de fundo** - Visual imersivo inspirado no cliente do LoL
- ✅ **Botão de limpar** - Permite resetar o sorteio facilmente

### **⚙️ Funcionalidades**
- ✅ **Sorteio de 3 campeões** - Ao invés de apenas 1, para dar mais opções
- ✅ **Integração com Data Dragon API** - Busca automática de ícones dos campeões
- ✅ **Lista completa e atualizada** - **169 campeões** atualizados até **09/02/2026**
- ✅ **Tratamento de nomes especiais** - Lógica customizada para campeões com nomes compostos, apóstrofos e caracteres especiais (ex: "Nunu e Willump", "Kai'Sa", "Dr. Mundo")
- ✅ **Fallback de imagens** - Exibe ícone padrão caso a imagem não carregue

### **📋 Lista de Campeões**
Incluí **todos os 169 campeões** disponíveis no jogo, incluindo os mais recentes:
- 🆕 **Mel** (lançamento recente)
- 🆕 **Yunara** (lançamento recente)  
- 🆕 **Zaahen** (lançamento recente)

> ⚠️ **Observação**: Os 3 campeões mais recentes (Mel, Yunara e Zaahen) podem não ter imagens disponíveis na Data Dragon API ainda, pois foram lançados muito recentemente. O app exibirá um ícone padrão para eles até que a Riot atualize a API.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Descrição |
|-----------|-----------|
| **Kotlin** | Linguagem de programação principal |
| **Jetpack Compose** | Framework moderno de UI declarativa |
| **Android SDK** | Kit de desenvolvimento Android |
| **Android Studio** | IDE de desenvolvimento |
| **Coil** | Biblioteca para carregamento de imagens assíncronas |
| **Data Dragon API** | API oficial da Riot Games para dados do LoL |
| **Material Design 3** | Sistema de design para componentes visuais |

---

## ✨ Funcionalidades

- 🎮 **Sorteio aleatório** de 3 campeões de League of Legends
- 🖼️ **Exibição de ícones** dos campeões via Data Dragon API
- 🗑️ **Botão de limpar** para resetar o sorteio
- 🎨 **Interface temática** com as cores oficiais do LoL
- 📱 **Design responsivo** e moderno com Jetpack Compose
- ⚡ **Carregamento assíncrono** de imagens com fallback

---

## 📱 Como Executar

### Pré-requisitos
- Android Studio instalado (versão mais recente recomendada)
- JDK 8 ou superior
- Dispositivo Android (API 21+) ou emulador

### Passos

1. **Clone o repositório:**
```bash
git clone https://github.com/JorgeALDev/App-de-Sorteio.git
```

2. **Abra o projeto no Android Studio:**
```
File > Open > Selecione a pasta do projeto
```

3. **Aguarde a sincronização do Gradle**  
   O Android Studio vai baixar todas as dependências automaticamente.

4. **Execute o app:**
   - Conecte um dispositivo Android (com depuração USB ativada)  
   - Ou inicie um emulador  
   - Clique em **Run** (▶️) ou pressione `Shift + F10`

---

## 🎮 Como Usar

1. Abra o aplicativo
2. Toque no botão **"SORTEAR"**
3. O app mostrará 3 campeões aleatórios com seus ícones
4. Escolha um para jogar! 🎯
5. Use o botão de lixeira para limpar e sortear novamente

---

## 📚 Aprendizados

Este projeto me permitiu aprender e praticar:

### **Conceitos de Kotlin**
- Sintaxe básica e funções
- Variáveis de estado com `mutableStateOf`
- Manipulação de listas e coleções
- Funções de alta ordem (`shuffled()`, `take()`)

### **Jetpack Compose**
- Composables e recomposição
- Gerenciamento de estado com `remember`
- Layouts (`Column`, `Spacer`, `Card`)
- Estilização e theming
- Material Design 3

### **Integração com APIs**
- Uso da biblioteca **Coil** para carregamento de imagens
- Construção dinâmica de URLs
- Tratamento de casos especiais (nomes compostos)
- Fallback para erros de carregamento

### **Boas Práticas**
- Componentização de UI
- Separação de lógica e apresentação
- Nomes descritivos de variáveis
- Tratamento de edge cases

---

## 📂 Estrutura do Projeto

```
app/src/main/java/com/example/appdesorteio/
└── champion_raffler.kt    # Arquivo principal com toda a lógica e UI
```

---

## 🔧 Principais Funções

### `getImagemCampeao(nomeCampeao: String): String`
Converte o nome do campeão para o formato correto da URL da Data Dragon API, tratando casos especiais como:
- Nomes compostos ("Aurelion Sol" → "AurelionSol")
- Apóstrofos ("Kai'Sa" → "Kaisa")
- Caracteres especiais ("Dr. Mundo" → "DrMundo")

### `sorteio()`
Embaralha a lista de 169 campeões e seleciona 3 aleatoriamente.

### `limpar()`
Reseta o estado do sorteio, limpando a lista de campeões exibidos.

---

## 🎨 Paleta de Cores

As cores foram extraídas da identidade visual oficial do League of Legends:

```kotlin
val LoLGradienteAzulInicio = Color(0xFF0A1428)  // Azul escuro início
val LoLGradienteAzulFim = Color(0xFF1E2328)     // Azul escuro fim
val LoLDourado = Color(0xFFC89B3C)              // Dourado principal
val LoLDouradoEscuro = Color(0xFF785A28)        // Dourado escuro
val LoLTextoBranco = Color(0xFFF0E6D2)          // Branco off-white
```

---

## 🐛 Limitações Conhecidas

- ⚠️ **Campeões muito recentes** (Mel, Yunara, Zaahen) podem não ter imagens na Data Dragon API ainda
- 📶 Requer conexão com internet para carregar os ícones dos campeões
- 🌐 Depende da disponibilidade da API Data Dragon da Riot Games

---

## 👨‍💻 Autor

Desenvolvido por **[Jorge AL](https://github.com/JorgeALDev)** como primeiro projeto em Kotlin.

---

## 📺 Referências

- [Tutorial no YouTube](https://youtu.be/bvauaOmqSSs) - App de Sorteio com Kotlin (base inicial)
- [Data Dragon API](https://developer.riotgames.com/docs/lol#data-dragon) - Documentação oficial da Riot Games
- [Jetpack Compose Docs](https://developer.android.com/jetpack/compose) - Documentação oficial do Android

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Sinta-se livre para usar, modificar e distribuir.

---

<div align="center">

**⭐ Se gostou do projeto, deixe uma estrela!**

Feito com ❤️ e muito ☕ por Jorge AL

</div>
