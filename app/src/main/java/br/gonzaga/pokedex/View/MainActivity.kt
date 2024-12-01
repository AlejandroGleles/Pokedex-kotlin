package br.gonzaga.pokedex.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.gonzaga.pokedex.R
import br.gonzaga.pokedex.domain.Pokemon
import br.gonzaga.pokedex.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.rvPokemons)

        val charmander = Pokemon(
            "https://www.google.com/imgres?q=charmander&imgurl=https%3A%2F%2Fstatic.wikia.nocookie.net%2Fpokemonet%2Fimages%2F8%2F87%2F004CharmanderFRLG.png%2Frevision%2Flatest%2Fscale-to-width-down%2F492%3Fcb%3D20130505000902%26path-prefix%3Dpt-br&imgrefurl=https%3A%2F%2Fpokemonet.fandom.com%2Fpt-br%2Fwiki%2FCharmander&docid=A8XqqDxxDg3aEM&tbnid=639MZXwAD0_VVM&vet=12ahUKEwjl3a2ix4eKAxUAHbkGHdu6CsQQM3oECBcQAA..i&w=492&h=439&hcb=2&ved=2ahUKEwjl3a2ix4eKAxUAHbkGHdu6CsQQM3oECBcQAA",
                4,
            "Charmander",
            listOf(
                PokemonType("Fire")
            )
        )
        val pokemons = listOf(
            charmander,charmander,charmander,charmander,charmander
        )
        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = PokemonAdapter(pokemons)

        }
    }
