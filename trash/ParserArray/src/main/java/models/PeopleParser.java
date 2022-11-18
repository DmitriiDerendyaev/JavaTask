package models;

public class PeopleParser {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int number;

    public PeopleParser(String firstName, String lastName, String gender, int age, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PeopleParser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }
}
