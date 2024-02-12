package edu.ucalgary.oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.setInquirer(inquirer);
        this.setMissingPerson(missingPerson);
        this.setDateOfInquiry(dateOfInquiry);
        this.setInfoProvided(infoProvided);
        this.setLastKnownLocation(lastKnownLocation);
    }

    // Getters
    public Inquirer getInquirer() {
        return this.inquirer;
    }
    public DisasterVictim getMissingPerson() {
        return this.missingPerson;
    }
    public String getDateOfInquiry() {
        return this.dateOfInquiry;
    }
    public String getInfoProvided() {
        return this.infoProvided;
    }
    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }
    public String getLogDetails() {
        return "Inquirer: " + this.getInquirer().getFirstName() + ", Missing Person: " + this.getMissingPerson().getFirstName() + ", Date of Inquiry: " + this.getDateOfInquiry() + ", Info Provided: " + this.getInfoProvided() + ", Last Known Location: " + this.getLastKnownLocation().getName();
    }

    // Setters
    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }
    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }
    public void setDateOfInquiry(String dateOfInquiry) {
        if (validDate(dateOfInquiry)) {
            this.dateOfInquiry = dateOfInquiry;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }
    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }
    private boolean validDate(String date) {
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
    
}
