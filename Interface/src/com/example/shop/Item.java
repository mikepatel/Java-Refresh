package com.example.shop;

public class Item implements Comparable{
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;

    // Constructor
    Item(String idIn, String nameIn, String retailIn, String quanIn){
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(quanIn);

        price = Math.floor(retail * 0.58);
    }

    // Getters
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getRetail(){
        return retail;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    // implement compareTo
    public int compareTo(Object obj){
        Item temp = (Item) obj;

        // make comparison
        if(this.price < temp.price){
            return 1;
        }
        else if(this.price > temp.price){
            return -1;
        }
        else{
            return 0;
        }
    }
}
