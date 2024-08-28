import java.util.*;

public class prime {
    public static void main(String args[]) {
        int n, i, flag = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        n = sc.nextInt();
        sc.close();
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 0;
            }

        }
        if (flag == 0) {
            System.out.println("the number is not prime number: ");

        } else {
            System.out.println(" a prime number: ");
        }
    }

}
