// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.

public class q4 {
    public static int[] reverse(int[] arr, int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = arr[n - 1 - i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverse(arr, arr.length);

        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}


