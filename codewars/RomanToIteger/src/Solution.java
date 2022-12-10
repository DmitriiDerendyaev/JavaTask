//class Solution {
//    public static int romanToInt(String s) {
//        int answer = 0;
//
//        for(int i = 0; i < s.length() - 1; i++){
//            if((s.charAt(i) == 'I') && !(s.charAt(i) == 'I' && s.charAt(i+1) == 'V') &&
//                    !(s.charAt(i) == 'I' && s.charAt(i+1) == 'X')){
//                answer++;
//            } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
//                answer += 4;
//            } else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
//                answer += 9;
//            }
//            if((s.charAt(i) == 'X') && !(s.charAt(i) == 'X' && s.charAt(i+1) == 'L') &&
//                    !(s.charAt(i) == 'X' && s.charAt(i+1) == 'C')){
//                answer += 10;
//            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
//                answer += 40;
//            } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
//                answer += 90;
//            }
//            if((s.charAt(i) == 'C') && !(s.charAt(i) == 'C' && s.charAt(i+1) == 'D') &&
//                    !(s.charAt(i) == 'C' && s.charAt(i+1) == 'M')){
//                answer += 100;
//            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
//                answer += 400;
//            } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
//                answer += 900;
//            }
////            if(s.charAt(i) == 'V') answer += 5;
////            if(s.charAt(i) == 'L') answer += 50;
////            if(s.charAt(i) == 'D') answer += 500;
////            if(s.charAt(i) == 'M') answer += 1000;
//
//
//        }
//        if(s.charAt(s.length()-1) == 'I') answer++;
//
//
//        return answer;
//    }
//}

import java.util.HashMap;

//class Solution {
//    public static int romanToInt(String S) {
//        int ans = 0, num = 0;
//        for (int i = S.length()-1; i >= 0; i--) {
//            switch(S.charAt(i)) {
//                case 'I': num = 1; break;
//                case 'V': num = 5; break;
//                case 'X': num = 10; break;
//                case 'L': num = 50; break;
//                case 'C': num = 100; break;
//                case 'D': num = 500; break;
//                case 'M': num = 1000; break;
//            }
//            if (4 * num < ans) ans -= num;
//            else ans += num;
//        }
//        return ans;
//    }
//}
class Solution{
    public static int romanToInt(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'V' || s.charAt(i) == 'X'){
                if(i > 0 && s.charAt(i-1) == 'I') sum -= 2;
            }
            if(s.charAt(i) == 'L' || s.charAt(i) == 'C'){
                if(i > 0 && s.charAt(i-1) == 'X') sum -= 20;
            }
            if(s.charAt(i) == 'D' || s.charAt(i) == 'M'){
                if(i > 0 && s.charAt(i-1) == 'C') sum -= 200;
            }

            sum += map.get(s.charAt(i));
        }

        return sum;
    }
}

