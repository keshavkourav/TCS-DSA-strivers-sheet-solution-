// Problem statement: Given an array, we have found the number of occurrences of each element in the array.
public class q5{
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 10, 15, 10, 5};
        int[] arr2 = {2, 2, 3, 4, 4, 2};

        System.out.println("Example 1:");
        countOccurrences(arr1);

        System.out.println("\nExample 2:");
        countOccurrences(arr2);
    }

    static void countOccurrences(int[] arr) {
        boolean[] visited = new boolean[arr.length];  // to mark counted elements

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue; // skip already counted numbers

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // mark as counted
                    count++;
                }
            }

            System.out.println(arr[i] + " " + count);
        }
    }
}
