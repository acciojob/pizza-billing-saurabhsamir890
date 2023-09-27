package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int papaerbagPrice;
    private boolean ischeeseAdded;
    private boolean istoppingsAdded;
    private boolean ispaperbagAdded;
    private boolean isbillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppingsPrice=70;
        }
        else{
            this.price=400;
            this.toppingsPrice=120;
        }
        this.cheesePrice=80;
        this.papaerbagPrice=20;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseAdded==false){
            price= price+cheesePrice;
            ischeeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingsAdded==false){
            price= price+toppingsPrice;
            istoppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(ispaperbagAdded==false){
            price= price+papaerbagPrice;
            ispaperbagAdded= true;
        }
    }

    public String getBill(){
        // your code goes here

//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470;

        if(isbillgenerated==false) {

            if (ischeeseAdded) {
                bill = bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
            }

            if (istoppingsAdded) {
                bill = bill + "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }

            if (ispaperbagAdded) {
                bill = bill + "Paperbag Added: " + this.papaerbagPrice + "\n";
            }

            bill = bill + "Total Price: " + price; // remember bill is string

            isbillgenerated=true;

        }


        return this.bill;
    }
}
