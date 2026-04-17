package striverSHEETtcs;

import java.util.Scanner;


public class Q3 {

    static void printsecSmallest(float[] arr) {

        if (arr.length < 2) {
            System.out.println("-1");
            return;
        }

        float min =Float.MAX_VALUE;
        float smin=Float.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin && arr[i] != min) {
                // Between min and smin
                smin = arr[i];
            }
        }
        if (smin == Float.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(smin);
        }

    }
    static void printseclargest(float[] arr) {

        if (arr.length < 2) {
            System.out.println(-1);
            return;
        }

        float max =-Float.MAX_VALUE;
        float smax=-Float.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                // Between min and smin
                smax = arr[i];
            }
        }
        if (smax == -Float.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(smax);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int n = sc.nextInt();
            float[] arr = new float[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextFloat();
            }
        if (arr == null || arr.length == 0) {
            System.out.println("-1");
            return;
        }
            printsecSmallest(arr);
        printseclargest(arr);
        

        sc.close(); // Close the scanner
    }
}