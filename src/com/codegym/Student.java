package com.codegym;

public class Student {
    private String name = "john";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "name " + name + " class " + classes;
    }
}
