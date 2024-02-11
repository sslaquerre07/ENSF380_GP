package edu.ucalgary.oop;

/*
Extra Notes for development:
Should be done for the most part 
*/

public class Supply {
    private String type;
    private int quantity;

    //Constructors
    public Supply(String type, int quantity){
        this.type = type;
        this.quantity = quantity;
    }

    //Getters
    public String getType(){
        return this.type;
    }

    public int getQuantity(){
        return this.quantity;
    }

    //Setters
    public void setType(String type){
        this.type = type;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
