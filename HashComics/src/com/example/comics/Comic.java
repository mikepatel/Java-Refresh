package com.example.comics;

public class Comic {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    // constructor
    Comic(String inTitle, String inIssueNumber, String inCondition, float inBasePrice){
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    public void setPrice(float factor){
        price = basePrice * factor;
    }
}
