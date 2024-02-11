package edu.ucalgary.oop;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DisasterVictim {
    private static int nextSocialID = 1;

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
    private String gender;
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.setFirstName(firstName);
        this.setEntryDate(ENTRY_DATE);
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    public String getComments() {
        return this.comments;
    }

    public MedicalRecord[] getMedicalRecords() {
        return this.medicalRecords;
    }
    public String getEntryDate() {
        return this.ENTRY_DATE;
    }
    public int getAssignedSocialID() {
        return this.ASSIGNED_SOCIAL_ID;
    }
    public Supply[] getPersonalBelongings() {
        return this.personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections() {
        return this.familyConnections;
    }
    public String getGender() {
        return this.gender;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setEntryDate(String ENTRY_DATE) {
        if (validDate(ENTRY_DATE)) {
            this.ENTRY_DATE = ENTRY_DATE;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        if (validDate(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongings = personalBelongings;
    }
    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void addPersonalBelonging(Supply supply) {
        if (this.personalBelongings == null) {
            this.personalBelongings = new Supply[1];
            this.personalBelongings[0] = supply;
        } else {
            Supply[] newSupplies = new Supply[this.personalBelongings.length + 1];
            System.arraycopy(this.personalBelongings, 0, newSupplies, 0, this.personalBelongings.length);
            newSupplies[this.personalBelongings.length] = supply;
            this.personalBelongings = newSupplies;
        }
    }
    public void removePersonalBelonging(Supply supply) {
        if (this.personalBelongings != null) {
            Supply[] newSupplies = new Supply[this.personalBelongings.length - 1];
            int j = 0;
            for (Supply personalBelonging : this.personalBelongings) {
                if (personalBelonging != supply) {
                    newSupplies[j] = personalBelonging;
                    j++;
                }
            }
            this.personalBelongings = newSupplies;
        }
    }
    public void addFamilyConnection(FamilyRelation familyRelation) {
        if (this.familyConnections == null) {
            this.familyConnections = new FamilyRelation[1];
            this.familyConnections[0] = familyRelation;
        } else {
            FamilyRelation[] newFamilyConnections = new FamilyRelation[this.familyConnections.length + 1];
            System.arraycopy(this.familyConnections, 0, newFamilyConnections, 0, this.familyConnections.length);
            newFamilyConnections[this.familyConnections.length] = familyRelation;
            this.familyConnections = newFamilyConnections;
        }
    }
    public void removeFamilyConnection(FamilyRelation familyRelation) {
        if (this.familyConnections != null) {
            FamilyRelation[] newFamilyConnections = new FamilyRelation[this.familyConnections.length - 1];
            int j = 0;
            for (FamilyRelation familyConnection : this.familyConnections) {
                if (familyConnection != familyRelation) {
                    newFamilyConnections[j] = familyConnection;
                    j++;
                }
            }
            this.familyConnections = newFamilyConnections;
        }
    }
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        if (this.medicalRecords == null) {
            this.medicalRecords = new MedicalRecord[1];
            this.medicalRecords[0] = medicalRecord;
        } else {
            MedicalRecord[] newMedicalRecords = new MedicalRecord[this.medicalRecords.length + 1];
            System.arraycopy(this.medicalRecords, 0, newMedicalRecords, 0, this.medicalRecords.length);
            newMedicalRecords[this.medicalRecords.length] = medicalRecord;
            this.medicalRecords = newMedicalRecords;
        }
    }
    private void setSocialID() {
        this.ASSIGNED_SOCIAL_ID = nextSocialID;
        nextSocialID++;
    }
    private boolean validDate(String date) {
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
