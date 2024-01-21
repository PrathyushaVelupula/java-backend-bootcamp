package main.java.io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int max =arr[0];
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (j > max) {
                max = j;
            }
        }

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int avg = sum/arr.length;
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+avg);
        System.out.println("largest number : "+max);
    }
}
