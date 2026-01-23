public class MoveZeroesLC283 {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = left; right<nums.length; right++){
            if(nums[left]!=0 && nums[left]!=nums.length-1){
                left++;
            }
            else if(nums[left]==0 && nums[right]!=0){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,3,5,0,3,0,7,0,9};
        moveZeroes(nums);
    }
}

/*
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
*/