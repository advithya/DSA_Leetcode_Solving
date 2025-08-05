class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;
        int[] nums3 = new int[c];

        System.arraycopy(nums1, 0, nums3, 0, a);
        System.arraycopy(nums2, 0, nums3, a, b);

        Arrays.sort(nums3);

        if (c % 2 == 1) {  // If the length is odd
            return nums3[c / 2];
        } else {  // If the length is even
            return (nums3[(c - 1) / 2] + nums3[c / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums3, nums4));
    }
}
