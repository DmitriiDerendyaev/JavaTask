package org.example;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import models.AdressParser;
import models.FruitParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String pathFile1 = "D:\\mospolytech\\Java\\JavaGit\\JavaTask\\trash\\JSON_parser\\src\\sample1.json";
        File input1 = new File(pathFile1);
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input1));
            JsonObject fileObject = fileElement.getAsJsonObject();

            // extract basic fields
            String fruit = fileObject.get("fruit").getAsString();
            String size = fileObject.get("size").getAsString();
            String color = fileObject.get("color").getAsString();

            FruitParser sample1 = new FruitParser(fruit, size, color);

            System.out.println(sample1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String pathFile2 = "D:\\mospolytech\\Java\\JavaGit\\JavaTask\\trash\\JSON_parser\\src\\sample2.json";
        File input2 = new File(pathFile2);

        try {
            JsonElement fileElement2 = JsonParser.parseReader(new FileReader(input2));
            JsonObject fileObject2 = fileElement2.getAsJsonObject();

            String firstName = fileObject2.get("firstName").getAsString();
            String lastName = fileObject2.get("lastName").getAsString();
            String gender = fileObject2.get("gender").getAsString();
            int age = (int)fileObject2.get("age").getAsLong();

            AdressParser sample2 = new AdressParser(firstName, lastName, gender, age);

            System.out.println(sample2.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}