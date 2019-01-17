package com.company;

public class Main {
    /* Rylee Charlton, exercise 1, 1/17/19 */
    public static void main(String[] args) {
        int zip = 43125;
        int sum = 0;
        float average;
        String city = "Columbus";
        int dailyHighs[] = {32, 25, 27, 40, 45};


        for (int i = 0; i <= 4; i++) {
            sum = sum + dailyHighs[i];
        }

        average = sum / 5;

        System.out.println("City: " + city + " Zipcode: " + zip + " Average High Temperature: " + average );
    }
}
