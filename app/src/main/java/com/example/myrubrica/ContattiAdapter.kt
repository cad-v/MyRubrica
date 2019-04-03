package com.example.myrubrica

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myrubrica.DatabaseContainer.Contatto

class ContattiAdapter (val dataset: ArrayList<Contatto>,
                       val context: Context) : RecyclerView.Adapter<RigaContViewHolder>() {

    // Invocata per creare un ViewHolder
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RigaContViewHolder {
        // Crea e restituisce un viewholder, effettuando l'inflate del layout relativo alla riga
        return RigaContViewHolder(LayoutInflater.from(context).inflate(R.layout.rigacontatto, viewGroup, false))
    }

    // Invocata per conoscere quanti elementi contiene il dataset
    override fun getItemCount(): Int {
        return dataset.size
    }

    // Invocata per visualizzare all'interno del ViewHolder il dato corrispondente alla riga
    override fun onBindViewHolder(viewHolder: RigaContViewHolder, position: Int) {
        val contatto = dataset.get(position)

        viewHolder.tvNome.text = contatto.nome
        viewHolder.tvProduttore.text =contatto.cognome
    }


}