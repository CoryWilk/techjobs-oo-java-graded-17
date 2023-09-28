package org.launchcode.techjobs.oo;

public abstract class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }
    //Getters and Setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}