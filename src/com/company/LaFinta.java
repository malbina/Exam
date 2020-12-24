package com.company;

public class LaFinta extends Pizza {
    String typeOfPizza;
    boolean withMushroomsOrNot;

    public LaFinta(){}

    public LaFinta(double price, double weight, String typeOfPizza, boolean withMushroomsOrNot) {
        super(price, weight);
        this.typeOfPizza = typeOfPizza;
        this.withMushroomsOrNot = withMushroomsOrNot;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isWithMushroomsOrNot() {
        return withMushroomsOrNot;
    }

    public void setWithMushroomsOrNot(boolean withMushroomsOrNot) {
        this.withMushroomsOrNot = withMushroomsOrNot;
    }

    @Override
    public void cook() {
        System.out.println(" Готовится пицца Ла Финта.");

    }

    @Override
    public void sayAboutMe() {
        System.out.print("Пицца: "+ typeOfPizza+","+" Цена: "+ price +","+ " Вес "+weight+".\n");
        if (withMushroomsOrNot){
            System.out.println("Специфика: Вы заказали пиццу Ла Финту с грибами.");
        }
        else {
            System.out.println( "Специфика:  Вы заказали пиццу Ла Финту без грибов.");
        }
    }
}