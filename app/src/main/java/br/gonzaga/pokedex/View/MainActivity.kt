package br.gonzaga.pokedex.View

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.gonzaga.pokedex.R
import br.gonzaga.pokedex.api.PokemonRepository
import br.gonzaga.pokedex.domain.Pokemon
import br.gonzaga.pokedex.domain.PokemonType

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        Thread(Runnable {
            loadPokemons()
        }).start()
    }

    private fun loadPokemons() {
        val pokemonsApiResult = PokemonRepository.listPokemon()

        pokemonsApiResult?.results?.let { results ->
            val pokemons = results.map { pokemonResult ->
                val number = pokemonResult.url
                    .replace("https://pokeapi.co/api/v2/pokemon/", "")
                    .replace("/", "").toInt()

                val pokemonApiResult = PokemonRepository.getPokemon(number)

                pokemonApiResult?.let {
                    Pokemon(
                        number = it.id,
                        name = it.name,
                        types = it.types.map { typeSlot -> typeSlot.type }
                    )
                }
            }.filterNotNull() // Filtra os valores nulos, se houver falha na API.

            recyclerView.post {
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = PokemonAdapter(pokemons)
            }
        } ?: run {
            Log.e("MainActivity", "Erro ao carregar Pokémons da API")
        }
    }

}
