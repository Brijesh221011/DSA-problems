//Leetcode Problem 4: Median of Two Sorted Arrays

//Brute Force Approach
// Time Complexity: O(m + n)
// Space Complexity: O(m + n)

public class Median {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int res[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                res[k++] = nums1[i++];
           
            } else {
                res[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            res[k++] = nums1[i++];
        }

        while (j < n2) {
            res[k++] = nums2[j++];
        }
       
        int n = n1 + n2;
        if (n % 2 == 1) { // Odd number of elements
            return (double) res[n / 2];
        } else { // Even number of elements
            int middle1 = res[(n / 2) - 1];
            int middle2 = res[n / 2];
            return (double) (middle1 + middle2) / 2.0;
        }
    }

 
}
