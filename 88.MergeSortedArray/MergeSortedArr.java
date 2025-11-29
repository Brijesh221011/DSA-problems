//88. Merge Sorted Array
//time complexity: O((m+n)log(m+n))
//space complexity: O(1)

import java.util.Arrays;
public class MergeSortedArr {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=n-1,k=m+n-1;

        while( j>=0 && k>m-1){
           nums1[k--]=nums2[j--];
        }
        Arrays.sort(nums1);
    }
}
