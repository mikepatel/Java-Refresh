package com.example.bike;

public class Bicycle {
    private String ownerName;

    // Constructor
    public Bicycle(){
        ownerName = "Unknown";
    }

    // Getter
    public String getOwnerName(){
        return ownerName;
    }

    // Setter
    public void setOwnerName(String name){
        ownerName = name;
    }
}
