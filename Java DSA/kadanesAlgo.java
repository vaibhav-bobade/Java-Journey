public class kadanesAlgo {
    public static int maxSubArraySum(int[] arr){
        int sum = arr[0];
        int maxsum = arr[0];

        for(int i =1; i<arr.length; i++){
            sum = Math.max(arr[i], sum + arr[i]);
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        int[] nums2 = {-5,-1,-6,-8,-9,-4,-3};
        System.out.println("Max SubArray sum of nums: " + maxSubArraySum(nums));
        System.out.println("Max SubArray of nums2: " + maxSubArraySum(nums2));
    }
}
