package com.example.comics;

import java.util.ArrayList;
import java.util.HashMap;

public class ComicBooks {

    // main
    public static void main(String[] args) {
        // create a HashMap
        HashMap<String, Float> quality = new HashMap<>();

        // populate HashMap
        quality.put("mint", 3.00f);
        quality.put("near mint", 2.00f);
        quality.put("very fine", 1.50f);
        quality.put("fine", 1.00f);
        quality.put("good", 0.50f);
        quality.put("poor", 0.25f);

        // set up collection
//        Comic[] comics = new Comic[3];
        ArrayList<Comic> comics = new ArrayList<>();
        comics.add(new Comic("SpiderMan", "1A", "near mint", 152.00f));
        comics.add(new Comic("Batman", "3C", "very fine", 66.00f));
        comics.add(new Comic("X-Men", "101", "mint", 89.00f));

        // update prices
        for(Comic c: comics){
            c.setPrice(quality.get(c.condition));
        }

        // display output
        for(Comic c: comics){
            System.out.println("Title: " + c.title);
            System.out.println("Issue: " + c.issueNumber);
            System.out.println("Condition: " + c.condition);
            System.out.println("Price: $" + c.price);
            System.out.println();
        }
    }
}
