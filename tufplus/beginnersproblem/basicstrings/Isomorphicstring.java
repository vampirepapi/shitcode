package tufplus.beginnersproblem.basicstrings;

import java.util.HashMap;

public class Isomorphicstring {
    public static boolean isomorphicString(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) {
                    return false;  // Inconsistent mapping in sMap
                }
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) {
                    return false;  // Inconsistent mapping in tMap
                }
            } else {
                tMap.put(tChar, sChar);
            }
        }

        return true;
    }
}
