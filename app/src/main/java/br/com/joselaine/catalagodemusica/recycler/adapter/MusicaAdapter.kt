package br.com.joselaine.catalagodemusica.recycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.joselaine.catalagodemusica.R
import br.com.joselaine.catalagodemusica.recycler.model.Musicas

class MusicaAdapter(
    private val context: Context,
    musicas: List<Musicas>
) : RecyclerView.Adapter<MusicaAdapter.ViewHolder>() {

    private val musicas = musicas.toMutableList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(musica: Musicas) {
            val nome = itemView.findViewById<TextView>(R.id.nomeMusica)
            val banda = itemView.findViewById<TextView>(R.id.nomeBanda)
            nome.text = musica.titulo
            banda.text = musica.banda
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.card_musica, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val musica = musicas[position]
        holder.vincula(musica)
    }

    override fun getItemCount() = musicas.size

}
