package recursion;

public class ReverseString {
    public static void revStrItr(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + "");
        }
    }

    public static void revStrRec(String s) {
        if (s == null || s.length() <= 1) {
            System.out.print(s);
            return;
        }
        System.out.print(s.charAt(s.length() - 1));
        revStrRec(s.substring(0, s.length() - 1));

    }

    public static void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        while (r > l) {
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
    }

    public static void main(String[] args) {
        revStrItr("shubham");
        System.out.println();
        revStrRec("shubham");
        System.out.println();
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        for (char c : s) {
            System.out.print(c);
        }
    }
}
