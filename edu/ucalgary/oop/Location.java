package edu.ucalgary.oop;
import java.util.ArrayList;

/*
Extra Notes for development:
Done! All Tests Passed
*/

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    //Constructor
    public Location(String name, String address){
        this.name = name;
        this.address = address;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public ArrayList<DisasterVictim> getOccupants(){
        return this.occupants;
    }

    public ArrayList<Supply> getSupplies(){
        return this.supplies;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setSupplies(ArrayList<Supply> supplies){
        this.supplies = supplies;
    }

    public void setOccupants(ArrayList<DisasterVictim> occupants){
        this.occupants = occupants;
    }

    //Additional Functions
    public void addOccupant(DisasterVictim occupant){
        ArrayList<DisasterVictim> old_list = this.getOccupants();
        ArrayList<DisasterVictim> new_list = new ArrayList<DisasterVictim>();
        if(old_list != null){
            int old_len = old_list.size();
            for(int i = 0;i<old_len;i++){
                new_list.add(old_list.get(i));
            }
        }
        new_list.add(occupant);

        this.setOccupants(new_list);
    }

    public void removeOccupant(DisasterVictim occupant){
        ArrayList<DisasterVictim> old_list = this.getOccupants();
        ArrayList<DisasterVictim> new_list = new ArrayList<>();
        if(old_list == null){
            System.out.println("List not initialized");
            return;
        }

        old_list.remove(occupant);
        this.setOccupants(new_list);
    }

    public void addSupply(Supply supply){
        ArrayList<Supply> old_list = this.getSupplies();
        ArrayList<Supply> new_list = new ArrayList<Supply>();
        if(old_list != null){
            int old_len = old_list.size();
            for(int i = 0;i<old_len;i++){
                new_list.add(old_list.get(i));
            }
        }
        new_list.add(supply);

        this.setSupplies(new_list);
    }

    public void removeSupply(Supply supply){
        ArrayList<Supply> old_list = this.getSupplies();
        ArrayList<Supply> new_list = new ArrayList<>();
        int index = old_list.indexOf(supply);
        if(index == -1){
            System.out.println("Element not found");
            return;
        }
        for(int i=0;i<old_list.size();i++){
            if(i == index){
                continue;
            }
            else{
                new_list.add(supply);
            }
        }

        this.setSupplies(new_list);
    }
}
