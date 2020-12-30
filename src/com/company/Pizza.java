package com.company;

public class Pizza {
    double price;
    double weight;

    public Pizza (){}

    public Pizza(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void cook (){
        System.out.println("Пицца готовится");
    }

    public void sayAboutMe(){
        System.out.println("Цена : "+price +","+" Вес: " +weight);

    }
}
