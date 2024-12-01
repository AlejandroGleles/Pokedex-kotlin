package br.gonzaga.pokedex.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.gonzaga.pokedex.R
import br.gonzaga.pokedex.domain.Pokemon

class PokemonAdapter(
    private val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = items[position]
        holder.bindView(items)

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(items: Pokemon)= with(itemView) {
            val ivPokemon = findViewById<ImageView>(R.id.ivPokemon)
            val tvNumber = findViewById<TextView>(R.id.tvNumber)
            val tvType1 = findViewById<TextView>(R.id.tvType1)
            val tvName = findViewById<TextView>(R.id.tvName)
            val tvType2 = findViewById<TextView>(R.id.tvType2)

            //TODO: Load image with Glide

            tvNumber.text = "Nº ${items.formattedNumber}"
            tvName.text = items.name
            tvType1.text = items.types[0].name

            if (items.types.size > 1) {
                tvType2.visibility = View.VISIBLE
                tvType2.text = items.types[1].name
            } else {
                tvType2.visibility = View.GONE

        }
    }

}}