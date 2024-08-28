import java.util.*;

public class functiona {

    public static int fact(int num) { // factorial
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;

        }
        return factorial;
    }

    public static int bincoffe(int n, int r) { // binomial coffecient
        int bin = fact(n) / (fact(r) * fact(n - r));
        return bin;
    }

    public static int sum(int z, int y) { /* example of function overloading */
        return z + y;
    }

    public static float sum(float z, float y) {
        return z + y;
    }

    public static boolean isprime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInrange(int n) { // to print prime number in range
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    
      public static int binaryTOdecimal(int n){
      int c=0,s=0,r;
      for(int i=0;i<=c;i++){
      r=n%10;
      c++;
      s=s+(int)(r*Math.pow(2,i));
     
     n=n/10;
      if(n==0)
      break;
     }
      return s;
      }
     
    // public static void binaryTOdecimal(int n) { // binary conversio to decimal
    //     int pow = 0;
    //     int sum = 0;
    //     int temp = n;
    //     while (n > 0) {
    //         int r = n % 10;
    //         sum = sum + (r * (int) Math.pow(2, pow));
    //         pow++;
    //         n = n / 10;
    //     }
    //     System.out.println("decimal of " + temp + "=" + sum);

    //   }

    public static void decimalTObinary(int n){ //decimal conversio to binary
        int p=0;
        int s = 0;
        int temo =n;
        while (n>0){
            int r=n%2;
            s=s+(r*(int) Math.pow(10,p));
            p++;
            n=n/2;
    }
    System.out.println("the binary of "+ temo+ "= "+ s);
}
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        System.out.println(binaryTOdecimal(n));
    }

}
