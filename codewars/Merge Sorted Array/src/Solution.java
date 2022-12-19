class Solution {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            merged[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            merged[k] = nums2[j];
            j++;
            k++;
        }
        nums1 = merged;
        return merged;
    }
}

//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        while(m > 0 && n > 0){
//            if(nums1[m-1] > nums2[n-1]){
//                nums1[m+n-1] = nums1[m-1];
//                m--;
//            }else{
//                nums1[m+n-1] = nums2[n-1];
//                n--;
//            }
//        }
//        while(n > 0){
//            nums1[n+m-1] = nums2[n-1];
//            n--;
//        }
//
//    }
//}