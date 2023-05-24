import java.util.Arrays;
import java.util.HashSet;

public class _1arr {
    public static void main(String[] args) {
        // Original array with repeated elements
        Integer[] array = { 2, 4, 6, 8, 2, 4, 10, 12, 6 };

        // Convert the array to a HashSet
        HashSet<Integer> uniqueSet = new HashSet<>(Arrays.asList(array));

        // Convert the HashSet back to an array
        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);

        // Print the unique elements
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}

// import java.util.*;

// public class Prob1_Part2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter size of first array : ");
// int sz1 = sc.nextInt();
// int arr1[] = new int[sz1];

// System.out.println("Enter elements of first array : ");
// for (int i = 0; i < sz1; i++) {
// arr1[i] = sc.nextInt();
// }
// System.out.println("Enter size of Second array : ");
// int sz2 = sc.nextInt();
// int arr2[] = new int[sz2];

// System.out.println("Enter elements of second array : ");
// for (int i = 0; i < sz2; i++) {
// arr2[i] = sc.nextInt();
// }

// System.out.println("Common elements between given two arrays : ");
// for (int i = 0; i < sz1; i++) {
// for (int j = 0; j < sz2; j++) {
// if (arr1[i] == arr2[j]) {
// System.out.println(arr1[i]);
// }
// }
// }

// }
// }
