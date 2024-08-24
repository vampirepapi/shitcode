package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sortcharactersbyfrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Create a list from the map entries and sort it by frequency and then alphabetically
        List<Map.Entry<Character, Integer>> sortedDict = new ArrayList<>(map.entrySet());
        sortedDict.sort((a, b) -> {
            int freqCompare = b.getValue().compareTo(a.getValue());
            if (freqCompare == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return freqCompare;
        });

        // Build the result list based on sorted frequencies
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedDict) {
            Character key = entry.getKey();
            Integer freq = entry.getValue();
            if (freq > 0) {
                for (int i = 0; i < freq; i++) {
                    sb.append(key);
                }
                
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Sortcharactersbyfrequency obj = new Sortcharactersbyfrequency();
        System.out.println(obj.frequencySort("tree"));  // Output: [e, r, t]
        System.out.println(obj.frequencySort("raaaajj"));  // Output: [a, j, r]
        System.out.println(obj.frequencySort("bbccddaaa"));  // Output: [a, b, c, d]
    }
}
