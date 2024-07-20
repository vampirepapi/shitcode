package random;

class Solution {
    public int[] findArray(int[] pref) {

        for (int i = 1; i < pref.length; i++) {
            pref[i] = pref[i] ^ pref[i - 1];
        }
        return pref;
    }
}