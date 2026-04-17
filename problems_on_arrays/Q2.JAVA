

import java.util.Scanner;

public class Q2 {

    static void printlargest(float[] arr) {
        if(arr.length== 0 || arr == null){
            System.out.println("array is empty...");
            return;

        }

        float a= arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            float[] arr = new float[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextFloat();
            }

            printlargest(arr);
        }

        sc.close(); // Close the scanner
    }
}