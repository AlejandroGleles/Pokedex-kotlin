package br.gonzaga.pokedex.api

import br.gonzaga.pokedex.api.model.PokemonApiResult
import br.gonzaga.pokedex.api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonService  {
    @GET("pokemon")
    fun listPokemon(@Query("limit") limit: Int): Call<PokemonsApiResult>

    @GET("pokemon/{number}")
    fun getPokemon(@Path("number") number: Int): Call<PokemonApiResult>


}