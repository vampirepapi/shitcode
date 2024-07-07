package random;

class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String str : operations) {
            if (str.contains("+")) {
                x += 1;
            } else {
                x -= 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] oprs = { "++X", "++X", "X++" };
        int finalValueAfterOperations = finalValueAfterOperations(oprs);
        System.out.println(finalValueAfterOperations);
    }
}