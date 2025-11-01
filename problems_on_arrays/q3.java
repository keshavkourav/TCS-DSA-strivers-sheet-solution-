// Given an array of integers nums, return the second-largest element in the array.
//  If the second-largest element does not exist, return -1.


public class q3 {
    public static int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        // Optional: handle case when no second largest exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {3, 9, 5, 1, 9, 7};
        int result = secondLargestElement(nums);
        System.out.println("Second largest element: " + result);
    }
}

