public class StickyKeys {
    public static boolean isPossible(String origin, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < origin.length() && origin.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++; // залипание — пропускаем дубликаты
            } else {
                return false;
            }
        }
        // должны пройти всю строку origin
        return i == origin.length();
    }

    public static void main(String[] args) {
        System.out.println(isPossible("albert", "albert"));   // true
        System.out.println(isPossible("albert", "aaalberrt")); // true
        System.out.println(isPossible("lee", "lle"));          // false
        System.out.println(isPossible("alex", "aalexx"));      // true
        System.out.println(isPossible("alex", "alxe"));        // false
    }
}