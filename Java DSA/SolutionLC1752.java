public class SolutionLC1752 {
    public static boolean check(int[] nums) {
        int idx0 = nums[0];
        //checked for we discoverd the 1 small num after big in rotated
        int checked = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] < nums[i-1]){
                checked++;
            }
        }
        if(checked > 1) return false;
        else if(checked == 1 && nums[nums.length-1] > idx0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));
    }
}

/*
Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].

Example 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.

Example 3:
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 */