//1877. Minimize Maximum Pair Sum in Array
import java.util.*;
public class SolutionLC1877 {
    public static int minPairSum(int[] nums) {
        int sum = 0;
        int currsum = 0;
        Arrays.sort(nums);
        int left =0, right=nums.length-1;
        if(nums.length < 3){
            return nums[left]+nums[right];
            }
        while(left<right){
            currsum = nums[left] + nums[right];
            left++;
            right--;
            if(currsum > sum){
                sum = currsum;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,4,2,4,6};
        System.out.println(minPairSum(nums));
    }
}

/*
Example 1:
Input: nums = [3,5,2,3]
Output: 7
Explanation: The elements can be paired up into pairs (3,3) and (5,2).
The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.

Example 2:
Input: nums = [3,5,4,2,4,6]
Output: 8
Explanation: The elements can be paired up into pairs (3,5), (4,4), and (6,2).
The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.
*/