public class BinarySearch {
    public static int binarySearch(int[] nums, int key){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == key){
                return mid;
            }
            if (nums[mid] < key) {
                start = mid +1;
            }
            if(nums[mid] > key){
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int key = 10;
        int index = binarySearch(nums , key);
        if (index == -1){
            System.out.println("NOt Found");
        }
        else{
            System.out.println(key + " is at index: " + index);
        }
    }
}