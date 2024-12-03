# 📱 Pokédex App

Este é um aplicativo **Pokédex** desenvolvido em **Kotlin** no **Android Studio**, que consome a **PokéAPI** para exibir uma lista de Pokémons com informações como nome, número, tipos e imagens.

---

## 🧩 Funcionalidades

- ✅ Listagem de Pokémons com nome, número e tipos.
- 🖼️ Carregamento dinâmico de imagens baseado no número do Pokémon.
- 🌐 Consumo de API para obter informações atualizadas.

---

## 🚀 Como Utilizar

### 1. Clonar o Repositório
Faça o clone do repositório para o seu ambiente local:

git clone https://github.com/AlejandroGleles/Pokedex-kotlin.git
2. Configurar o Ambiente
Abra o projeto no Android Studio.
Certifique-se de que as dependências no arquivo build.gradle foram sincronizadas.
3. Executar o Aplicativo
Conecte um dispositivo Android ou inicie um emulador.
Clique em Run no Android Studio.
🖥️ Estrutura do Projeto
Principais Diretórios e Arquivos
br.gonzaga.pokedex.view

MainActivity.kt: Configuração principal da RecyclerView e integração com o repositório de Pokémons.
PokemonAdapter.kt: Controla a exibição dos Pokémons na RecyclerView.
br.gonzaga.pokedex.api

PokemonService.kt: Define os endpoints para comunicação com a PokéAPI.
PokemonRepository.kt: Centraliza as chamadas HTTP e manipula os dados recebidos.
br.gonzaga.pokedex.api.model

PokemonsApiResult.kt: Modelos de dados para mapear as respostas da PokéAPI.
br.gonzaga.pokedex.domain

Pokemon.kt: Representa o modelo de um Pokémon com atributos como número, nome e tipos.
🔧 Tecnologias Utilizadas
Kotlin: Linguagem principal.
Retrofit: Consumo da PokéAPI.
Gson: Manipulação de JSON.
RecyclerView: Exibição da lista de Pokémons.
Material Design: Interface moderna e responsiva.
📷 Telas do Aplicativo

![Screenshot_2024-12-02-21-15-44-800_br gonzaga pokedex](https://github.com/user-attachments/assets/6cb9c373-53d7-487a-906a-8d3d4b416960)
![Screenshot_2024-12-02-21-15-58-372_br gonzaga pokedex](https://github.com/user-attachments/assets/5d1c0c7d-6830-4d15-b24e-55303b2ad2b6)


📜 Licença
Este projeto está licenciado sob a MIT License.
