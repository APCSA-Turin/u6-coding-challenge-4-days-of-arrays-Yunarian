
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will will be tested on this method
        String[] listOfStatuses = new String[names.length];
        int numNice = 0;
        int numNaughty = 0;
        
        // randomly sorts all names into either "naughty" or "nice"
        for (int i = 0; i < names.length; i++) {
            int naughtyOrNice = (int)(Math.random() * 2);
            if (naughtyOrNice == 0) {
                listOfStatuses[i] = "Nice";
                numNice++;
            } else {
                listOfStatuses[i] = "Naughty";
                numNaughty++;
            }
        }

        String[] nices = new String[names.length];
        String[] naughties = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            if (listOfStatuses[i].equals("Nice")) {
                nices[i] = names[i];
            } else {
                naughties[i] = names[i];
            }
        }

        String[][] returnedArray = {nices, naughties};
        return returnedArray; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] result = Day2.nameSort(names);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println(result[i][j]);
            }
            System.out.println();
        }
    }
}