package com.example.java;

public class ClothingItem {
    public String type;
    public String itemColor;
    public double itemPrice;

    public static void main(String[] args) {
         ClothingItem item = new ClothingItem();
         item.type = "hat";
         item.itemColor = "Blue";
         item.itemPrice = 20.59d;
         item.displayItem();
         item.itemColor();
//         item.itemPrice();

        System.out.println("The price of this hat : " + item.itemPrice);
    }
    private void displayItem(){
        System.out.println("This is a " + this.type);
    }
    private void itemColor(){
        System.out.println("The item color is " + this.itemColor);
    }
    private double itemPrice(){
        return itemPrice;
    }
}
