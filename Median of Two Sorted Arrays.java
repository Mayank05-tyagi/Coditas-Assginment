class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {int m = nums1.length, n = nums2.length;
        int count = 0, median = 0;
        int i=0, j=0;

        if ((m+n) % 2 == 0) {
            int firstElement = 0;
            for (count = 1; count <= (m+n)/2 + 1; count++) {
                if (i < m && j < n) {
                    if (nums1[i] <= nums2[j])
                        median = nums1[i++];
                    else
                        median = nums2[j++];
                } else if (i == m) {
                  median = nums2[j++];  
                } else if (j == n) {
                    median = nums1[i++];
                }
                if (count == (m+n)/2) {
                    firstElement = median;
                }
            }
            return (double)(firstElement + median) / 2;
        } else {
            for (count = 1; count <= (m+n)/2 + 1; count++) {
                if (i < m && j < n) {
                    if (nums1[i] <= nums2[j])
                        median = nums1[i++];
                    else
                        median = nums2[j++];
                } else if (i == m) {
                  median = nums2[j++];  
                } else if (j == n) {
                    median = nums1[i++];
                }
            }
        }
        return median;
        
    }
}