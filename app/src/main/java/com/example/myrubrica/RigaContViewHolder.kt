package com.example.myrubrica

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.rigacontatto.view.*

//per distinguere i textview
class RigaContViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvNome = view.textNome
    val tvProduttore = view.textCognome
}
