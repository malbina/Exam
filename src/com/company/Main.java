package com.company;

public class Main {

    public static void main(String[] args) {
    Pepperoni pepperoni = new Pepperoni(300,0.656,"Pepperoni",true);
    pepperoni.cook();
    pepperoni.sayAboutMe();
    Margarita margarita = new Margarita(450,0.555,"Margarita",false);
    margarita.cook();
    margarita.sayAboutMe();
    LaFinta laFinta = new LaFinta(300,0.565,"La Finta",false);
    laFinta.cook();
    laFinta.sayAboutMe();
    }

}