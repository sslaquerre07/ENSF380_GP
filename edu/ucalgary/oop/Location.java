package edu.ucalgary.oop;

/*
Extra Notes for development:
Should be mostly done, current errors are based around the fact that there is no
definition for the disastervictim class.
*/

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

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

    public DisasterVictim[] getOccupants(){
        return this.occupants;
    }

    public Supply[] getSupplies(){
        return this.supplies;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setSupplies(Supply[] supplies){
        this.supplies = supplies;
    }

    public void setOccupants(DisasterVictim[] occupants){
        this.occupants = occupants;
    }

    //Additional Functions
    public void addOccupant(DisasterVictim occupant){
        DisasterVictim[] old_list = this.getOccupants();
        DisasterVictim[] new_list = new DisasterVictim[old_list.length + 1];
        for(int i = 0;i<old_list.length;i++){
            new_list[i] = old_list[i];
        }
        new_list[old_list.length] = occupant;

        this.setOccupants(new_list);
    }

    public void removeOccupant(DisasterVictim occupant){
        DisasterVictim[] old_list = this.getOccupants();
        DisasterVictim[] new_list = new DisasterVictim[old_list.length-1];
        int OLD_ID = occupant.getAssignedSocialID();
        for(int i=0;i<new_list.length;i++){
            int id = old_list[i].getAssignedSocialID();
            if(id == OLD_ID){
                i--;
                continue;
            }
            else{
                new_list[i] = old_list[i];
            }
        }

        this.setOccupants(new_list);
    }

    public void addSupply(Supply supply){
        Supply[] old_list = this.getSupplies();
        Supply[] new_list = new Supply[old_list.length + 1];
        for(int i = 0;i<old_list.length;i++){
            new_list[i] = old_list[i];
        }
        new_list[old_list.length] = supply;

        this.setSupplies(new_list);
    }

    public void removeSupply(Supply supply){
        Supply[] old_list = this.getSupplies();
        Supply[] new_list = new Supply[old_list.length-1];
        String OLD_TYPE = supply.getType();
        for(int i=0;i<new_list.length;i++){
            String type = old_list[i].getType();
            if(type.equals(OLD_TYPE)){
                i--;
                continue;
            }
            else{
                new_list[i] = old_list[i];
            }
        }

        this.setSupplies(new_list);
    }
}
