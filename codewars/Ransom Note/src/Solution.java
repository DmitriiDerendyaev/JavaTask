
class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
            if(magazine.indexOf(ransomNote) == -1) return false;
            else return true;
    }
}