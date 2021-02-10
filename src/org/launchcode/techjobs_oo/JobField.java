package org.launchcode.techjobs_oo;

import java.util.Objects;

//Finally, to prevent the creation of a JobField object, make this class abstract
public abstract class JobField {
    //What fields (variables??) do ALL FOUR of the classes have in common?
        // value and id and nextId
        //In JobField, declare each of the common fields.
    private int id;
    private static int nextId = 1;
    private String value;
    //Which constructors are the same in ALL FOUR classes?
        //both
        //Code the constructors.
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    //Which custom methods are identical in ALL of the classes?
        //toString (corCompetency equals is different from others)
        //Add in the custom methods
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //What getters and setters do ALL of the classes share?
    //getId getValue setValue
    //Use Generate to create the appropriate getters and setters.


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
