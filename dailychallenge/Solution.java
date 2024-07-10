package dailychallenge;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = IntStream.range(1, n + 1).boxed().collect(Collectors.toCollection(ArrayList::new));
        int idx = 0;
        while (friends.size() > 1) {
            idx = (idx + k - 1) % friends.size();
            friends.remove(idx);
        }
        return friends.get(0);
    }

    public static void main(String[] args) {
        int n = 6, k = 5;
        int theWinner = findTheWinner(n, k);
        System.out.println(theWinner);

    }
}