public class SolutionLC53 { 

    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currsum = Math.max(nums[i], currsum + nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        SolutionLC53 sol = new SolutionLC53();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {-3, -2, -5};
        int[] nums3 = {1};

        System.out.println("Max subarray sum (nums1): " + sol.maxSubArray(nums1)); 
        System.out.println("Max subarray sum (nums2): " + sol.maxSubArray(nums2));  
        System.out.println("Max subarray sum (nums3): " + sol.maxSubArray(nums3));  
    }
}

/*Output: 
Max subarray sum (nums1): 6
Max subarray sum (nums2): -2
Max subarray sum (nums3): 1
*/