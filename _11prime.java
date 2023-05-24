import java.util.*;

public class _11prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print its multiplication table : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

// import java.util.*;

// public class Prob11_Part2 {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number to check if it is prime or not ");
// int n = sc.nextInt();

// if (n <= 1) {
// System.out.println(n + " is not a prime number");
// return;
// }

// for(int i=2; i<=Math.sqrt(n); i++){
// if(n%i==0){
// System.out.println(n + " is not a prime number");
// return;
// }
// }

// System.out.println(n + " is a prime number");
// }
// }
