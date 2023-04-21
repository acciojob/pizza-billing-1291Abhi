package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int vegBasePrice=300;
    private int nonVegBasePrice=400;
    private int cheesePrice=80;

    private int vegToppingPrice =70;
    private int nonVegToppingPrice =120;
    private int toppingPrice;
    private int takeWayPrice=20;

    private boolean isCheeseAdded;

    private boolean isToppingAdded;

    private boolean isTakeWayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        basePrice=getBasePrice();
        price=basePrice;
        isCheeseAdded=false;
        isToppingAdded=false;
        isTakeWayAdded=false;
    }

    private int getBasePrice(){
        return isVeg?vegBasePrice:nonVegBasePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       if(!isCheeseAdded){
           isCheeseAdded=true;
           price+=cheesePrice;
       }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            isToppingAdded=true;
            if(isVeg){
                toppingPrice=vegToppingPrice;
            }
            else{
                toppingPrice=nonVegToppingPrice;
            }
            price+=toppingPrice;
        }

    }

    public void addTakeaway(){

        // your code goes here
        if(!isTakeWayAdded){
            isTakeWayAdded=true;
            price+=takeWayPrice;
        }

    }

    public String getBill(){
        String var="";
        var+="Base Price Of The Pizza: "+basePrice+"\n";
        if(isCheeseAdded)
            var+="Extra Cheese Added: "+cheesePrice+"\n";
        if(isToppingAdded)
            var+="Extra Toppings Added: "+toppingPrice+"\n";
        if(isTakeWayAdded)
            var+="Paperbag Added: "+takeWayPrice+"\n";
        var+="Total Price: "+getPrice()+"\n";
        this.bill=var;
        return this.bill;
    }
}
