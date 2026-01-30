public class ReverseArray {
    public static void reverseArray(int[] nums){
        int left =0, right = nums.length-1;
        while(left < right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        reverseArray(nums);
    }
}