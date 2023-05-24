import java.util.*;

public class _12pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        int j = 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= j && j <= n; k++) {
                System.out.print("*");
            }
            j++;
            System.out.println();
        }

        j = n - 1;
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= j && j >= 1; k++) {
                System.out.print("*");
            }
            j--;

            System.out.println();
        }
    }
}
