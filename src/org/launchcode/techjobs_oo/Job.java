package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID
    public Job(){
        id = nextId;
        nextId++;
    }
    //  and a second to initialize the other five fields.
    //  The second constructor should also call the first in order to initialize the 'id' field.
    public Job(String name, Employer employer, Location location,PositionType positionType,CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        //BONUS this covers empty constructor, but will return the same if only null is entered for name. so it does not quite work.
        // but if i dont have it, then the whole thing will error whenever a null is entered anywhere in the second constructor.
        if(name ==null) {
            //this.name="Data not available";
            return "OOPS! This job does not seem to exist.";
        }
        //BONUS if all parameters in constructor two are entered with ""
        if (name.equals("") && employer.toString().equals("") && location.toString().equals("") && positionType.toString().equals("") && coreCompetency.toString().equals("") ){
            return "OOPS! This job does not seem to exist.";
        }
        //I think this method will error if null is entered anywhere in the second constructor other than name.
            // It throws an error when i try to use setValue().
            // so I don't have a way to create the output to have "Data not available" in the correct row if null is used.
        // for some reason I also get this error if I put the "" if statements and the null if statements together (if name.equals("") || name==null)
//        if(employer ==null){
//            employer.setValue("Data not available");
//             this does not work so not sure how to get correct outcome without typing whole thing each time
//        }

        if (name.equals("")){
            this.name="Data not available";
        }
        if (employer.toString().equals("")){
            employer.setValue("Data not available");
        }
        if (location.getValue().equals("")){
            location.setValue("Data not available");
        }
        if (positionType.getValue().equals("")){
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue().equals("")){
            coreCompetency.setValue("Data not available");
        }

        return "\n"+
                "ID: " + id +"\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer +"\n" +
                "location: " + location +"\n" +
                "Position Type: " + positionType +"\n" +
                "Core Competency: " + coreCompetency
                +"\n";
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
