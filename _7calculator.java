import java.util.*;

class MyCalculator {
    public long power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        }

        else if (n==0 || p==0) {
            throw new Exception("n or p should not be equals to zero");
        }

        else{
            return ((long)Math.pow(n, p));
        }

    }
}

public class Prob7 {
    public static void main(String[] args){
        MyCalculator obj = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(obj.power(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
