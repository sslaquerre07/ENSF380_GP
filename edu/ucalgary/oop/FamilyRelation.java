package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        this.setPersonOne(personOne);
        this.setRelationshipTo(relationshipTo);
        this.setPersonTwo(personTwo);
    }

    // Getters
    public DisasterVictim getPersonOne() {
        return this.personOne;
    }
    public String getRelationshipTo() {
        return this.relationshipTo;
    }
    public DisasterVictim getPersonTwo() {
        return this.personTwo;
    }

    // Setters
    public void setPersonOne(DisasterVictim personOne) {
        this.personOne = personOne;
    }
    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }
    public void setPersonTwo(DisasterVictim personTwo) {
        this.personTwo = personTwo;
    }
}
