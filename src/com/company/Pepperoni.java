package com.company;

public class Pepperoni extends Pizza {
    String typeOfPizza;
    boolean isThePizzaSpicy;

    public Pepperoni (){}

    public Pepperoni (double price ,double weight,String typeOfPizza,boolean isThePizzaSpicy){
        super(price, weight);
        this.typeOfPizza  = typeOfPizza;
        this.isThePizzaSpicy = isThePizzaSpicy;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void setTypeOfPizza(String typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }

    public boolean isThePizzaSpicy() {
        return isThePizzaSpicy;
    }

    public void setThePizzaSpicy(boolean thePizzaSpicy) {
        isThePizzaSpicy = thePizzaSpicy;
    }

    @Override
    public void sayAboutMe() {
        System.out.print("Пицца: "+ typeOfPizza+","+" Цена: "+ price +","+ " Вес "+weight+".\n");
        if (isThePizzaSpicy){
            System.out.println("Специфика: Вы заказали острую пеперони.");
        }
         else {
            System.out.println( "Специфика:  Вы заказали не острую пеперони.");
            }
        }

    @Override
    public void cook() {
        System.out.println(" Готовится пицца Пепперони");
    }
}

