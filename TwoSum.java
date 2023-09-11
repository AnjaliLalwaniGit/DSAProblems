package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums={3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] ans=new int[2];


        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                ans[0]=hm.get(target-nums[i]);
                ans[1]=i;
                break;
            }
            hm.put(nums[i],i);
        }
        return ans;


    }
}

