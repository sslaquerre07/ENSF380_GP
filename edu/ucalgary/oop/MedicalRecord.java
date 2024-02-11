package edu.ucalgary.oop;
import java.util.regex.*;

/*
Extra Notes for development:
Done, all test passed!
*/

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    //Constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException{
        if(!patternCheck(dateOfTreatment)){
            throw new IllegalArgumentException("Invalid Date Format Used");
        }
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

    public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException{
        if(!patternCheck(dateOfTreatment)){
            throw new IllegalArgumentException("Invalid Date Format Used");
        }
        this.dateOfTreatment = dateOfTreatment;
    }

    //Additional Functions
    public boolean patternCheck(String toCheck){
        Pattern myPattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
        Matcher myMatcher = myPattern.matcher(toCheck);
        return myMatcher.find();
    }
}
