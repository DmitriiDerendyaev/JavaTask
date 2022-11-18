package models;

import java.util.ArrayList;

public class AdressParser{
    public String firstName;
    public String lastName;
    public String gender;
    public int age;

    public AdressParser(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "AdressParser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}


