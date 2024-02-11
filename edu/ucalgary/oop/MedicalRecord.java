package edu.ucalgary.oop;

/*
Extra Notes for development:
Basics done, now error checking is needed
*/

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    //Constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment){
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    //Getters
    public Location getLocation(){
        return this.location;
    }

    public String getTreatmentDetails(){
        return this.treatmentDetails;
    }

    public String getDateOfTreatment(){
        return this.dateOfTreatment;
    }

    //Setters
    public void setLocation(Location location){
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails){
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment){
        this.dateOfTreatment = dateOfTreatment;
    }
}
