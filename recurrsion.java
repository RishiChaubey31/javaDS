
public class recurrsion {
    public static void decerease(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decerease(n - 1);
    }

    public static void increasa(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increasa(n - 1);
        System.out.print(n + " ");

    }

    public static int fact(int n) { // O(n) for n calls space complexity O(n) n varibales are creatd
        if (n == 0) {
            return 1;
        }
        int f = n * fact(n - 1);
        return f;
    }

    public static int sum(int n) { // TC=O(n),sc=O(n)
        if (n <= 0) {
            return 0;
        }
        int s = n + sum(n - 1);
        return s;
    }

    public static void fibo(int n) { // without recurrsion fiboncci series
        int a = 0, b = 1;
        System.out.print(a + ",");
        System.out.print(b + ",");
        int sum = 0;
        while (sum <= n) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + ",");
        }
    }

    public static int fibonacci(int n) { // fibonacci with recurrsion
        if (n == 0 || n == 1) { // O(n) space complexity
            return n; // calls are exponential O(2^n)
        }
        int fib1 = fibonacci(n - 1);
        int fib2 = fibonacci(n - 2);
        int fibn = fib1 + fib2;
        return fibn;
    }

    public static boolean CheckSort(int arr[], int i) { // O(n),O(n)
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return CheckSort(arr, i + 1);
    }

    public static int Occurence(int[] arr, int key, int i) { // 1st occurenvce
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return Occurence(arr, key, i + 1);

    }

    public static int lastOccurence(int[] arr, int key, int i) { // last occurence
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;

    }

    public static int power(int x, int n) { // power of x^n
        if (n == 0) { // TOME COMPLEXITY O(n)
        }
        int xn = x * power(x, n - 1);
        return xn;
    }

    public static int OptimisedPower(int x, int n) {
        if (n == 0) {
            return 1; // time complexity O(logn )
        }
        int halfpower = OptimisedPower(x, n / 2);
        int powersq = halfpower * halfpower;

        if (n % 2 != 0) {
            powersq = x * powersq;
        }
        return powersq;
    }

    public static int tilingProb(int n) { // area of floor 2*n
        if (n == 0 || n == 1) { // base case
            return 1;
        }
        int way1 = tilingProb(n - 1); // vertically pit tiles
        int way2 = tilingProb(n - 2); // horizontally putting tiles
        int totalways = way1 + way2;
        return totalways;
    }

    public static void RemoveDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) { // if the character is already present
            RemoveDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true; // to carry out the index,character not present then change in sTRING
            RemoveDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friends(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // choice
        int f1 = friends(n - 1); // single

        int f2 = friends(n - 2); // pairs
        int pairways = (n - 1) * f2;
        int totways = f1 + pairways;
        return totways;
    }

    public static void printBinaryStrings(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        /*
         * things required
         * if(lastPlace==0){
         * printBinaryStrings(n-1, 1, str.append("1"));
         * printBinaryStrings(n-1, 0, str.append("0"));
         * }
         * else{
         * printBinaryStrings(n-1, 0, str.append("0"));
         */
        // ************MORE SUBTLE WAY TO DO THIS
        printBinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void indices(int[] arr, int key, int i) { // to return all the indices at which the key is present
        if (i == arr.length) {
            return;

        }
        if (arr[i] == key) {
            System.out.print(i + " ");

        }
        indices(arr, key, i + 1); // PROBLEM 1
    }

    public static void numTOstring(int n) {
        String[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (n == 0) {
            return;
        }
        int r = n % 10;
        n = n / 10;
        numTOstring(n);
        System.out.print(word[r] + " ");
    }

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;

    }

    public static void TowerOfHanoi(int n, String source, String helper, String destiny) {
        if (n == 1) {
            System.out.println("transfer disk " + source + " to " + destiny);
            return;
        }
        TowerOfHanoi(n - 1, source, destiny, helper);
        System.out.println("transfer disk " + source + " to " + destiny);
        TowerOfHanoi(n - 1, helper, source, destiny);
    }

    public static void main(String[] args) {
        TowerOfHanoi(3, "s", "h", "d");
    }

}
