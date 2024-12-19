package com.example.project;

public class Day3 {
    public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            grid[i][j] = " ";
          }
        }

        int mid = size / 2;
        for (int i = 0; i < size; i++) {
          grid[mid][i] = "*";
          grid[i][mid] = "*";
          grid[i][i] = "*";
          grid[i][size - i - 1] = "*";
        }
  
        return grid;
    }


    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      int size = snowflake[0].length;
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          System.out.print(snowflake[i][j]);
        }
        System.out.println();
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake(generateSnowflake(5));
    }
}
