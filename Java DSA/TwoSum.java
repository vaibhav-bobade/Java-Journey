import java.util.*;

public class TwoSum{
    public static int[] getIndexes(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int half = target - nums[i];
            if(map.containsKey(half)){
                return new int[] {map.get(half), i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {5,9,6,3,1,8};
        int target = 7;
        int result[] = getIndexes(nums, target);
        System.out.println(Arrays.toString(result));     //[2, 4]....6+1
    }
}