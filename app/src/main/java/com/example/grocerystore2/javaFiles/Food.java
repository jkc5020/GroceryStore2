package com.example.grocerystore2.javaFiles;

public class Food {
    private double price;
    private String name;
    private int num;
    Food(String type, double cost, int id){
        price = cost;
        name = type;
        num = id;


    }

    public int getNum() {
        return num;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        return "name: " + name +  " id: " + num + " price: $" + price;
    }
}
