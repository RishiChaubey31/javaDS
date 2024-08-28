import java.util.*;

public class sstrring {
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float ShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            // east
            if (direction == 'E') {
                x++;
            }
            // west
            else if (direction == 'W') {
                x--;
            }
            // north
            else if (direction == 'N') {
                y++;
            }
            // south
            else {
                y--;
            }
        }
        double x2 = Math.pow(x, 2);
        double y2 = Math.pow(y, 2);
        return (float) Math.sqrt(x2 + y2);
    }

    public static String uppercase(String str) { // conversion of every first letter of word of String to uppercase
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static StringBuilder compressed2(String str) { // COMPRESSED STRING USING STRINGBUILDER
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.append(str);
    }

    public static String compressed(String str) { // COMPRESSED STRING WITHOUT USING STRINGBUILDER
        String str2 = " ";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            str2 += str.charAt(i);
            if (count > 1) {
                str2 += count.toString();
            }
        }
        return str2;
    }

    // ********************* FROM HERE ONWARDS PRACTICE QUESTIONS

    public static void ana1(String str1, String str2) { // ANAGRAM O(n*logn)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // checking for the lengths
        if (str1.length() == str2.length()) {
            // conversion to character array
            char[] str1chararray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray();

            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);

            boolean result = Arrays.equals(str1chararray, str2chararray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams ");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams ");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }

    public static boolean ana2(String str1, String str2) { // ANAGRAM CODE o(n^2)
        int flag = 0;
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char ch2 = str2.charAt(j);
                if (ch1 == ch2) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                break;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverses(String str) { // reverin a senetnce
        str += " ";
        String word = " ", rev = " ";
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                rev = word + "" + rev;
                word = "";
            }
        }
        return rev;
    }

    public static boolean isPalindrome(String s) { // valid plaindrome
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s1.length();
        for (int i = 0; i < n / 2; i++) {
            if (s1.charAt(i) != s1.charAt(n - 1 - i)) {

                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        String str1 = "aabbcc";
        String str2 = "abcdef";
        System.out.println(ana2(str1, str2));
    }
}
