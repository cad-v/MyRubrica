package com.example.myrubrica.DatabaseContainer
//E' solo uno e non può essere istanziato più di una volta come con le classi
object DataBase {


    private var contatti=ArrayList<Contatto>()
    //Inizializzo il database
    init {
        contatti.add(Contatto("Felice","Trotta"))
        contatti.add(Contatto("Renato","Ambrosone"))
        contatti.add(Contatto("Simone","Cristofaro"))
        contatti.add(Contatto("Davide","Casuccio"))
//Il metodo add(oggetto), chiamiamo il costruttore all'interno dell'oggetto
    }

    fun getContatti(): ArrayList<Contatto>{
     return contatti
    }


}