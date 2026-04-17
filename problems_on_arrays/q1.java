// Problem Statement: Given an array, we have to find the smallest element in the array.


import java.util.Scanner;

public class Q1 {

    static void printSmallest(float[] arr) {
        // Edge case: check if array is empty
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        float min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Good practice: provide a prompt so the user knows what to type
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            float[] arr = new float[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextFloat();
            }

            printSmallest(arr);
        }

        sc.close(); // Close the scanner
    }
}