package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int countExtraCheese=0;

    private int countExtraTapping=0;

    private int countTakeWay=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg.equals(true)){
            this.price=300;
        }
        else
            this.price=400;
        this.bill="Base Price Of The Pizza: "+getPrice();
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price+=80;
        countExtraCheese++;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg.equals(true)){
            price+=70;
        }else {
            price+=120;
        }
        countExtraTapping++;
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
        countTakeWay++;
    }

    public String getBill(){
        if(countExtraCheese>0)
        this.bill=this.bill+"\nExtra Cheese Added: "+countExtraCheese*80;
        if(countExtraTapping>0) {
            if (isVeg.equals(true)) {
                bill += "\nExtra Toppings Added: " + countExtraTapping * 70;
            } else {
                bill += "\nExtra Toppings Added: " + countExtraTapping * 120;
            }
        }
        if(countTakeWay>0)
        bill+="\nPaperbag Added: "+countTakeWay*20;
        bill+="\nTotal Price: "+getPrice();

        return this.bill;
    }
}
