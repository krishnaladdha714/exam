import java.util.Scanner;

//3.1Java Program to Reverse a String.
//3.2) Write a Java program to check that String is palindrome or not.
public class _3str {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();

        String ok = "";
        int sz = s.length();

        for (int i = sz - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            ok = ok + ch;
        }
        System.out.println("Reversed String is : " + ok);

        if (ok.equals(s))

        {
            System.out.println("palindrone");
        } else {
            System.out.println(" not ");
        }

    }
}
