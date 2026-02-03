public class BubbleSort {
    public static void bubblSort(int[] nums){
        for (int turn = 0; turn < nums.length-1; turn++) { //for turn 1 we go till length - 1 element to compare with their next
            for(int j =0; j<nums.length-1-turn; j++){      //for turn 2 we go till condition because as turn increases our array has highest elements at last.
                if(nums[j] > nums[j+1]){                   //e.g. turn 0= 5 at last, turn 1= 4 before last, turn 2= 3 before 4, turn 3= 2 before 3, turn 4= array sorted.
                    int temp = nums[j];                    //so we decrease the condition of j for not comparing sorted last elements as turn increases to save time. 
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,3,1,5,2};
        bubblSort(nums);
    }
}
