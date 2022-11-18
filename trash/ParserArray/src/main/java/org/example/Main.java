package org.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import models.PeopleParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String pathSample4 = "D:\\mospolytech\\Java\\JavaGit\\JavaTask\\trash\\ParserArray\\src\\sample4.json";
        File inputSample4 = new File(pathSample4);

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(inputSample4));
            JsonObject fileObject = fileElement.getAsJsonObject();

            JsonArray jsonArrayOfPeople = fileObject.get("people").getAsJsonArray();
            List<PeopleParser> people = new ArrayList<>();

            for(JsonElement peopleElement: jsonArrayOfPeople){
                JsonObject peopleJsonObject = peopleElement.getAsJsonObject();

                String name = peopleJsonObject.get("firstName").getAsString();
                String lastName = peopleJsonObject.get("lastName").getAsString();
                String gender = peopleJsonObject.get("gender").getAsString();

                int age = (int)peopleJsonObject.get("age").getAsLong();
                int number = (int)peopleJsonObject.get("number").getAsLong();

                PeopleParser oncePeople = new PeopleParser(name, lastName, gender, age, number);

                people.add(oncePeople);
            }

            System.out.println(people.toString());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}