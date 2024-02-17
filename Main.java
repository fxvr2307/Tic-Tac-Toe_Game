package org.example;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 3; // Change the value of n as needed
        int[][] matrix = spiral(n);

        // Print the generated spiral matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] spiral(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int number = 1;

                    //2                   //2
        while (top <= bottom && left <= right) {
            // Fill top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = number++;
            }
            top++;

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = number++;
            }
            right--;

            // Fill bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = number++;
            }
            bottom--;

            // Fill left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = number++;
            }
            left++;
        }

        return matrix;
    }
}






