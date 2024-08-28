
public class bit_manipulation {
    public static void oddOReven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {

            System.out.println("even number");
        } else {
            System.out.println("odd nummber");
        }
    }

    public static int getIbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitmask = i << 1;
        return n | bitmask;
    }

    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateBit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearBit(n, i);
        } else {
            return setBit(n, i);
        }

        /*
         * n=clearBit(n,i );
         * int bitmask=newbit<<i;
         * return n| bitmask;
         */
    }

    public static int clearIthbit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static void main(String args[]) {
        System.out.println(clearIthbit(15, 2));
    }
}
