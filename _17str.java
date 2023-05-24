import java.util.*;

public class _17str {

    public static String rever(String a) {
        String ans = "";
        int sz = a.length();
        for (int i = sz - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            ans = ans + ch;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            // System.out.println("Enter a string : " );
            arr[i] = sc.nextLine();
        }

        // Sort the strings
        Arrays.sort(arr);

        // Print the sorted strings
        System.out.println("Sorted strings : ");
        for (String str : arr) {
            System.out.println(str);
        }

        // Combine two strings
        String combine = arr[0] + arr[1];
        System.out.println("Combined String : " + combine);

        // Reverse the first string
        String rev = rever(arr[0]);
        System.out.println("Reversed String : " + rev);

    }
}
