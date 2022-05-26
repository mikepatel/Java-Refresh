package com.example.shop;

public class GiftShop {
    // main
    public static void main(String[] args) {
        Storefront store = new Storefront();

        store.addItem("A", "MUG", "10", "150");
        store.addItem("B", "LG MUG", "12", "82");
        store.addItem("C", "REPLICA", "58", "64");
        store.addItem("D", "T SHIRT", "19", "106");

        store.sort();

        for(int i=0; i< store.getSize(); i++){
            Item show = (Item) store.getItem(i);
            System.out.println("Item ID: " + show.getId() +
                    "\nItem Name: " + show.getName() +
                    "\nItem Retail Price: $" + show.getRetail() +
                    "\nItem Price: $" + show.getPrice() +
                    "\nItem Quantity: " + show.getQuantity() +
                    "\n"
            );
        }
    }
}