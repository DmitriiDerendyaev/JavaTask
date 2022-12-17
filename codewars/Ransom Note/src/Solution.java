import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> ransomCounts = new HashMap<>();
        Map<Character, Integer> magazineCounts = new HashMap<>();

        for (char ch : ransomNote.toCharArray()) {
            ransomCounts.put(ch, ransomCounts.getOrDefault(ch, 0) + 1);
        }

        for (char ch : magazine.toCharArray()) {
            magazineCounts.put(ch, magazineCounts.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomCounts.keySet()) {
            if (!magazineCounts.containsKey(ch) || magazineCounts.get(ch) < ransomCounts.get(ch)) {
                return false;
            }
        }
        return true;
    }
}