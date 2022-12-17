import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;

//class Solution {
//    public static boolean canConstruct(String ransomNote, String magazine) {
//
//        Map<Character, Integer> ransomCounts = new HashMap<>();
//        Map<Character, Integer> magazineCounts = new HashMap<>();
//
//        for (char ch : ransomNote.toCharArray()) {
//            ransomCounts.put(ch, ransomCounts.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch : magazine.toCharArray()) {
//            magazineCounts.put(ch, magazineCounts.getOrDefault(ch, 0) + 1);
//        }
//
//        for (char ch : ransomCounts.keySet()) {
//            if (!magazineCounts.containsKey(ch) || magazineCounts.get(ch) < ransomCounts.get(ch)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> ransomList = new ArrayList<>();
        ArrayList<Character> magazineList = new ArrayList<>();

        char[] ransomStrinigArray = ransomNote.toCharArray();
        char[] magazineStrinigArray = magazine.toCharArray();

        for (int i = 0; i < ransomNote.length(); i++){
            ransomList.add(ransomStrinigArray[i]);
        }


        for (int i = 0; i < magazine.length(); i++){
            magazineList.add(magazineStrinigArray[i]);
        }

        for(int i = 0; i < ransomList.size(); i++){
            for(int j = 0; j < magazineList.size(); j++){
                if(ransomList.get(i) == magazineList.get(j)){
                    magazineList.remove(j);
                }
            }
        }



        return true;
    }
}