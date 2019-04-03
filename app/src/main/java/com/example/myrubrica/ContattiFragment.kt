package com.example.myrubrica


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myrubrica.DatabaseContainer.DataBase
import kotlinx.android.synthetic.main.fragment_contatti.*


class ContattiFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contatti, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Imposto il layout manager a lineare per avere scrolling in una direzione
        listcontatti.layoutManager = LinearLayoutManager(activity)

        // Associo l'adapter alla RecyclerView
        listcontatti.adapter = ContattiAdapter(DataBase.getContatti(), requireContext())
    }
}