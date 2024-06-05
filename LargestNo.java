import java.util.*;

public class LargestNo {
    public static int largestNo(int a[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; // Initialize smallest

        for (int i = 0; i < a.length; i++) {
            if (largest < a[i]) {
                largest = a[i];
            }

            if (smallest > a[i]) {
                smallest = a[i];
            }
        }

        System.out.println("Smallest value: " + smallest); // print the smallest value
        return largest;
    }

    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 40, 50 };
        System.out.println("Largest value: " + largestNo(a));
    }
}
