import java.util.*;

public class SolutionLC1984 {
    public static int minimumDifference(int[] nums, int k) {
        int mindiff = Integer.MAX_VALUE;
        int length =nums.length;
        if(length<2){
            return 0;
        }
        Arrays.sort(nums);  //{2,3,4,6,8,9} will be new arranged Array
        for(int i =0; i+k-1 < length; i++){
            int diff = nums[i+k-1] - nums[i];
            mindiff = Math.min(mindiff , diff);
        }
        return mindiff;
    }
    public static void main(String[] args) {
        int[] nums = {2,6,4,8,9,3};
        int result = minimumDifference(nums, 2);
        System.out.println(result);
    }
}

/*
Example 1:----------
Input: nums = [90], k = 1
Output: 0
Explanation: There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.

Example 2:----------
Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.
*/