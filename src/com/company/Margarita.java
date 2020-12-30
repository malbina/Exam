package com.company;

public class Margarita extends Pizza {
    String nameOfPizza;
    boolean withMeatOrNot;

    public Margarita (){}
    public Margarita (double price, double weight,String nameOfPizza,boolean withMeatorNot){
        super(price, weight);
        this.nameOfPizza = nameOfPizza;
        this.withMeatOrNot = withMeatorNot;

    }

    public String getNameOfPizza() {
        return nameOfPizza;
    }

    public void setNameOfPizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }

    public boolean isWithMeat() {
        return withMeatOrNot;
    }

    public void setWithMeat(boolean withMeat) {
        this.withMeatOrNot = withMeatOrNot;
    }

    @Override
    public void cook() {
        System.out.println(" Готовится пицца Мaргарита.");
    }

    @Override
    public void sayAboutMe() {
        System.out.print("Пицца: "+ nameOfPizza+","+" Цена: "+ price +","+ " Вес "+weight+".\n");
        if (withMeatOrNot){
            System.out.println("Специфика: Вы заказали пиццу Маргариту с мясом.");
        }
        else {
            System.out.println( "Специфика:  Вы заказали пиццу Маргариту без мяса.");
        }
    }
}
