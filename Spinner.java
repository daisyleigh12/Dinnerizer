package com.premieremediaservices.dinnerizer;

import java.lang.Math;

public class Spinner {

    public Spinner(int entreeID, String entreeName, int side1ID, String side1Name, int side2ID, String side2Name, int dessertID, String dessertName) {

        entreeName = getEntreeById();
        side1Name = getSide1ById();
        side2Name = getSide2ById();
        dessertName = getDessertById();

    }

    public static String getEntreeById() {
        String entreeById = "default";
        String[] entreeArray = new String[3];
        entreeArray[0] = "Hamburgers";
        entreeArray[1] = "Grilled Chicken";
        entreeArray[2] = "Pork Loin";
        int min = 1;
        int max = 3;
        int entreeID = (int) ((Math.random() * ((max - min) + 1)) + min);
        entreeById = entreeArray[entreeID - 1];
        return entreeById;
    }

    public static String getSide1ById() {
        String side1ByID = "default";
        String[] side1Array = new String[3];
        side1Array[0] = "Mixed Greens";
        side1Array[1] = "Green Beans";
        side1Array[2] = "Garden Salad";
        int min = 1;
        int max = 3;
        int side1ID = (int) ((Math.random() * ((max - min) + 1)) + min);
        side1ByID = side1Array[side1ID - 1];
        return side1ByID;
    }

    public static String getSide2ById() {
        String side2ByID = "default";
        String[] side2Array = new String[3];
        side2Array[0] = "Herb Rice";
        side2Array[1] = "Mac-n-Cheese";
        side2Array[2] = "Steak Fries";
        int min = 1;
        int max = 3;
        int side2ID = (int) ((Math.random() * ((max - min) + 1)) + min);
        side2ByID = side2Array[side2ID - 1];
        return side2ByID;
    }

    public static String getDessertById() {
        String dessertByID = "default";
        String[] dessertArray = new String[3];
        dessertArray[0] = "Berries with Cream";
        dessertArray[1] = "Pie Ala Mode";
        dessertArray[2] = "Cheesecake";
        int min = 1;
        int max = 3;
        int dessertID = (int) ((Math.random() * ((max - min) + 1)) + min);
        dessertByID = dessertArray[dessertID - 1];
        return dessertByID;
    }
}
